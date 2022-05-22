#!/usr/bin/env python
# coding: utf-8

# # Notebook d'algo génétique pour le TER LeekWars.
# 
# 
# Membres du groupe : 
# 
# * Kenza Boumaza
# * Sabrine Farah 
# * Abdelhamid Louati
# * Louis Rémy

# ## Import 
# Improt nécéssaire au programme. 

# In[77]:


import subprocess
import json
import random
import concurrent.futures
import time


# ## Réglages du script 
# On peut modifier le nombre de combats à éffectuer : 
# 

# In[78]:


# Nombre de combats 
nbFight = 8

# Taille population
tPop = 8

# Nobre de gen
nbGen = 1


# ## Phase de combat
# 
# On récupère des infromations du scenario. <br>
# On modifie la valeur "random_seed" pour l'aléatoire.  <br>
# On sélectionne deux combatants aléatoires.<br>
# On modifie l'ADN dans les deux fichier d'ia.<br>
# On récupère le vainqueur.<br>
# 
# 

# In[79]:


def takeSecond(elem):
    return elem[1]

def combat(i) :
    fileName = 'resultat_'+str(i+1)+'.json'
    pathName = 'test/scenario/scenario_gen_' +str(i+1)+'.json'
    start = time.time_ns()
    _stdout = open(fileName, 'w')
    _stderr = open(fileName, 'w') 
    try : 
        sp = subprocess.Popen('java -jar generator.jar '+pathName, stdout=_stdout, stderr=_stderr)
    except : 
        string = "le combat "+str(i+1)+" n'a pas marché."
    else : 
        string = "combat "+str(i+1)+" fini."
    finish = time.time_ns()
    temps = (finish-start)
    return [string,temps]

def combatPhase(nbFight, tPop) :
    
    # On crée les listes 
    listeIndividus = []
    listeJoueurs = []
    listeTemps = []
    listeCombats = []

    
    for i in range(tPop) :
        listeIndividus.append([i,0])


    # Préparation 

    with open("test/scenario/scenario_gen.json") as jsonFile:
        scenario = json.load(jsonFile)
        jsonFile.close()
    with open("test/ai/gen1.leek", "r") as AI:
        lines = AI.readlines()
        AI.close()
    
    for i in range(nbFight) :
        j1 = random.randint(0,tPop-1) 
        while True:
            j2 = random.randint(0,tPop-1)
            if(j2!=j1):
                break
        print("j1 : "+str(j1))
        print("j2 : "+str(j2))
        listeJoueurs.append([j1,j2])

        with open("ADNs.json") as jsonFile:
            ADNs = json.load(jsonFile)
            jsonFile.close()

        ADN1 = ADNs["ADN"][j1]
        ADN2 = ADNs["ADN"][j2]
        pathName = 'test/ai/gen_' +str(i*2)+'.leek'
        with open(pathName, "w") as AI:
            for noLine in range(len(lines)):
                if noLine == 0:
                    AI.write("global ADN = \""+ADN1+"\";"+"\n")
                else :
                    AI.write(lines[noLine])
        scenario["entities"][0][0]["ai"] = pathName

        pathName = 'test/ai/gen_' +str(i*2+1)+'.leek'
        with open(pathName, "w") as AI:
            for noLine in range(len(lines)):
                if noLine == 0:
                    AI.write("global ADN = \""+ADN2+"\";"+"\n")
                else :
                    AI.write(lines[noLine])
        scenario["entities"][1][0]["ai"] = pathName

        scenario["random_seed"] = random.randint(0,10000000)
        pathName = 'test/scenario/scenario_gen_' +str(i+1)+'.json'
        with open(pathName, 'w') as f:
            json.dump(scenario, f)


    # Combat
    for i in range(nbFight) :
        fileName = 'resultat_'+str(i+1)+'.json'
        with open(fileName, "w") as f:
            f.close()
        listeCombats.append(i)

    with concurrent.futures.ProcessPoolExecutor() as executor :
        results = executor.map(combat,listeCombats)

        for result in results :
            print(result[0])
            listeTemps.append(result[1])


    # Résultats

    for i in range(nbFight) :
        fileName = 'resultat_'+str(i+1)+'.json'

        with open(fileName, "r") as f:
            lines = f.readlines()
            f.close()
        with open(fileName, "w") as f:
            for line in lines:
                if line.strip("\n") != "db_resolver false folder=0 farmer=0":
                    f.write(line)
            f.close()

        try :
            with open(fileName) as jsonFile:
                resultat = json.load(jsonFile)
                jsonFile.close()
        except : 
            print(fileName+" est illisible.")
        else : 
            winnerID = int(resultat['winner']) 
            winnerName = scenario["entities"][winnerID][0]["name"]
            duration = resultat["duration"]
            execution_time = listeTemps[i]

            if (winnerID == -1) : print("Combat " + str(i + 1) + " : Draw // Durée : " + str(duration) + " tours // Temps : " +  str(execution_time / 1000000000) + " sec")
            else : print("Combat " + str(i + 1) + " : Winner -> " + winnerName + " // Durée : " + str(duration) + " tours // Temps : " +  str(execution_time / 1000000000) + " sec")

            j1 = listeJoueurs[i][0]
            j2 = listeJoueurs[i][1]

            if (winnerID==0) :
                listeIndividus[j1][1] += 1
                listeIndividus[j2][1] -= 1
            elif (winnerID==1) :
                listeIndividus[j1][1] -= 1
                listeIndividus[j2][1] += 1
            elif (winnerID==-1) :
                listeIndividus[j1][1] -= 0.5
                listeIndividus[j2][1] -= 0.5



    listeIndividus.sort(reverse=True, key=takeSecond)

    print("liste d'individus :")
    print(listeIndividus)
    
    return listeIndividus


# ## Phase de reproduction
# 
# On récupère la liste des individus triés dans l'ordre performances décroissante. <br>
# On prend la première moitié des individus et on garde leur ADN.  <br>
# On mélange l'ADN de cette moitié en faisant des couples de parents que l'on reproduit.<br>
# il en découle deux enfants pour deux parents, qui constitueront la deuxième moitié de la prochaine population.<br>

# In[80]:


def reproductionPhase(listeIndividus, tPop) :
    with open("ADNs.json") as jsonFile:
        ADNs = json.load(jsonFile)
        jsonFile.close()

    mPop = int(tPop/2) # moitié de la population
    ADN = []

    for i in range(mPop) :
        ADN.append(ADNs["ADN"][listeIndividus[i][0]])

    for i in range(mPop) :
        ADNs["ADN"][i] = ADN[i]

    print(ADN)
    dejaParents = [] # Liste des individus qui ont déjà été parents

    for i in range(int(mPop/2)) :
        y = mPop + i*2 
        p1 = random.randint(0,mPop-1) # On détermine le parent 1
        dejaParents.append(p1)
        while True:
            p2 = random.randint(0,mPop-1) # On détermine le parent 2
            if(p2 not in dejaParents):
                dejaParents.append(p2)
                break

        # On détermine à quel endroit on coupe l'adn
        p1Split = random.randint(0,len(ADN[p1])/4) * 4
        p2Split = random.randint(0,len(ADN[p2])/4) * 4

        f1a = "" # Première moitié de fils 1
        f1b = "" # Deuxième moitié de fils 1
        f2a = "" # Première moitié de fils 2
        f2b = "" # Deuxième moitié de fils 2

        p1Len = len(ADN[p1])
        p2Len = len(ADN[p2])

        for j in range(p1Len) :
            if (j<p1Split) : f1a += ADN[p1][j]
            else : f2b += ADN[p1][j]

        for j in range(p2Len) :
            if (j<p2Split) : f2a += ADN[p2][j]
            else : f1b += ADN[p2][j]

        ADNs["ADN"][y] = f1a + f1b
        ADNs["ADN"][y+1] = f2a + f2b

    with open("ADNs.json", "w") as f:
        json.dump(ADNs, f)
        f.close()


# ## Main scrip
# 
# On répète la phase de combats et la phase de reproduction autant de fois que l'on veut (valeur de nbGen).
# 

# In[81]:


def main() :
    for i in range(nbGen) :
        listeIndividus = combatPhase(nbFight,tPop) 
        reproductionPhase(listeIndividus, tPop) 

    print("Meilleur ADN de la dernière gen, gen n°" + str(nbGen))
    with open("ADNs.json") as jsonFile:
            ADNs = json.load(jsonFile)
            jsonFile.close()
    print("ADN : " + ADNs["ADN"][listeIndividus[0][0]])

if __name__ == '__main__':
    main()

