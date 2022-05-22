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

# In[11]:

import sys
import json
import random
import time
import subprocess


# ## Réglages du script 
# On peut modifier le nombre de combats à éffectuer : 
# 

# In[12]:


# Nombre de combats par individu
nbFight = 10

# Taille population
tPop = 30

# Nobre de gen
nbGen = 50


# ## Phase de combat
# 
# On récupère des infromations du scenario. <br>
# On modifie la valeur "random_seed" pour l'aléatoire.  <br>
# On sélectionne deux combatants aléatoires.<br>
# On modifie l'ADN dans les deux fichier d'ia.<br>
# On récupère le vainqueur.<br>
# 
# 

# In[13]:


def takeSecond(elem):
    return elem[1]

def combat(i):
    _stdout = open('resultat.json', 'w')
    _stderr = open('resultat.json', 'w')
    sp = subprocess.Popen('java -jar generator.jar test/scenario/scenario_gen.json', stdout=_stdout, stderr=_stderr,shell=True)
    try:
        sp.wait(timeout=10)
    except subprocess.TimeoutExpired:
        sp.kill()

def combatPhase(nbFight, tPop) :
    
    # On crée les listes
    listeIndividus = []
    listeCombats = []
    
    for i in range(tPop) :
        listeIndividus.append([i,0])
    
    for i in range(tPop) :
        dejaVu = []
        dejaVu.append(i)
        for _ in range(nbFight) :
            r = random.randint(0,tPop-1)
            while r in dejaVu and len(dejaVu)<tPop :
                r = random.randint(0,tPop-1)
            listeCombats.append([i,r])
            dejaVu.append(r)

    for i in range(nbFight*tPop) : 

        # Préparation 

        with open("test/scenario/scenario_gen.json") as jsonFile:
            scenario = json.load(jsonFile)
            jsonFile.close()

        scenario["random_seed"] = random.randint(0,10000000)

        with open('test/scenario/scenario_gen.json', 'w') as f:
            json.dump(scenario, f)

        j1 = listeCombats[0][0]
        j2 = listeCombats[0][1]
        listeCombats.pop(0)
        # print("j1 : "+str(j1))
        # print("j2 : "+str(j2))

        with open("ADNs.json") as jsonFile:
            ADNs = json.load(jsonFile)
            jsonFile.close()

        ADN1 = ADNs["ADN"][j1]
        ADN2 = ADNs["ADN"][j2]

        with open("test/ai/gen1.leek", "r") as AI:
            lines = AI.readlines()
        with open("test/ai/gen1.leek", "w") as AI:
            for noLine in range(len(lines)):
                if noLine == 0:
                    AI.write("global ADN = \""+ADN1+"\";"+"\n")
                else :
                    AI.write(lines[noLine])

        with open("test/ai/gen2.leek", "r") as AI:
            lines = AI.readlines()
        with open("test/ai/gen2.leek", "w") as AI:
            for noLine in range(len(lines)):
                if noLine == 0:
                    AI.write("global ADN = \""+ADN2+"\";"+"\n")
                else :
                    AI.write(lines[noLine])

        with open('resultat.json','w') as f :
            f.write('')
            f.close()

        # Combat

        start = time.time_ns()
        combat(i)
        finish = time.time_ns()

        # Résultats

        with open('resultat.json', "r") as f:
            lines = f.readlines()
        with open('resultat.json', "w") as f:
            for line in lines:
                if line.strip("\n") != "db_resolver false folder=0 farmer=0":
                    f.write(line)

        try :
            with open('resultat.json') as jsonFile:
                resultat = json.load(jsonFile)
                jsonFile.close()
        except : 
            winnerID = -1
            duration = 0
        else :
            winnerID = int(resultat['winner']) 
            duration = resultat["duration"]
            trueWinner = resultat["fight"]["leeks"][winnerID]["name"]

        execution_time = finish-start

        if (winnerID==0) :
            print("Combat " + str(i + 1) + " entre j"+str(j1)+" et j"+str(j2)+" : Winner -> j" + str(j1) + " // Durée : " + str(duration) + " tours // Temps : " +  str(execution_time / 1000000000) + " sec")
            listeIndividus[j1][1] += 1
            listeIndividus[j2][1] -= 1
        elif (winnerID==1) :
            print("Combat " + str(i + 1) + " entre j"+str(j1)+" et j"+str(j2)+" : Winner -> j" + str(j2) + " // Durée : " + str(duration) + " tours // Temps : " +  str(execution_time / 1000000000) + " sec")
            listeIndividus[j1][1] -= 1
            listeIndividus[j2][1] += 1
        elif (winnerID==-1) :
            print("Combat " + str(i + 1) + " entre j"+str(j1)+" et j"+str(j2)+" : Draw // Durée : " + str(duration) + " tours // Temps : " +  str(execution_time / 1000000000) + " sec")
            listeIndividus[j1][1] -= 0.5
            listeIndividus[j2][1] -= 0.5
        
        # print ('wait')
        # time.sleep(10)
            
    listeIndividus.sort(reverse=True, key=takeSecond)

    print("liste d'individus :")
    print(listeIndividus)
    
    return listeIndividus


# ## Phase de reproduction
# 
# On récupère la liste des individus triés dans l'ordre performances décroissante. <br>
# On prend le premier tiers des individus et on garde leur ADN.  <br>
# On mélange l'ADN de ce tiers en faisant des couples de parents que l'on reproduit.<br>
# Il en découle deux enfants pour deux parents, qui constitueront un deuxième tiers de la prochaine population.<br>
# On prends une copie de ces deux enfants et on fait des mutations sur certains de leurs gènes, ils constitueront le troisième tiers de la prochaine population.<br>

# In[14]:


def mutation(ADN) :
    # ADNO = ADN
    count = 0
    proba = 30
    while count < len(ADN) :
        r = random.randint(0,proba)
        if r == 0 :
            # print('count : '+str(count/4)+' | proba : '+str(proba))
            ADN2 =''
            gene = ADN[count+1]
            gene += ADN[count+2]
            gene += ADN[count+3]
            gene = int(gene)
            longueur = random.randint(1,5)
            decalage = random.randint(-longueur,longueur)
            while decalage == 0 :
                decalage = random.randint(-longueur,longueur)
            gene += decalage
            if gene-decalage < 10 :
                gene2 = '00'
                gene2 += str(gene-decalage)
            elif gene-decalage < 30 :
                gene2 = '0'
                gene2 += str(gene-decalage)       
            elif gene < 100 :
                gene2 = '0'
                gene2 += str(gene)
            else : gene2 = str(gene)
            for i in range(count+1):
                ADN2 += ADN[i]
            ADN2 += gene2
            for i in range(count+4,len(ADN)):

                ADN2 += ADN[i]
            ADN = ADN2
            proba = max(4,int(proba/2))
        elif proba < 50 :
            proba = min(30,proba+1)
        count += 4
    # print(ADNO)
    # print(ADN)
    return ADN

def reproductionPhase(listeIndividus, tPop) :
    with open("ADNs.json") as jsonFile:
        ADNs = json.load(jsonFile)
        jsonFile.close()

    tiersPop = int(tPop/3) # tiers de la population
    ADN = []

    for i in range(tiersPop) :
        ADN.append(ADNs["ADN"][listeIndividus[i][0]])

    for i in range(tiersPop) :
        ADNs["ADN"][i] = ADN[i]

    print(ADN)
    pasParents = [] # Liste des individus qui ont pas encore été parent

    for i in range(int(tiersPop/2)) :
        y = tiersPop + i*4 
        for y in range(tiersPop):
            pasParents.append(y)

        p1 = pasParents[random.randint(0,len(pasParents)-1)] # On détermine le parent 1
        pasParents.remove(p1)
        p2 = pasParents[random.randint(0,len(pasParents)-1)] # On détermine le parent 2
        pasParents.remove(p2)
        

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

        f1 = f1a + f1b
        f2 = f2a + f2b
        f3 = mutation(f1)
        f4 = mutation(f2)

        ADNs["ADN"][y] = f1
        ADNs["ADN"][y+1] = f2
        ADNs["ADN"][y+2] = f3
        ADNs["ADN"][y+3] = f4

    with open("ADNs.json", "w") as f:
        json.dump(ADNs, f)
        f.close()


# ## Main scrip
# 
# On répète la phase de combats et la phase de reproduction autant de fois que l'on veut (valeur de nbGen).
# 

# In[15]:


class Tee(object):
    def __init__(self, *files):
        self.files = files
    def write(self, obj):
        for f in self.files:
            f.write(obj)
            f.flush() # If you want the output to be visible immediately
    def flush(self) :
        for f in self.files:
            f.flush()

if __name__ == '__main__':
    f = open("logs.txt","w")
    sys.stdout = Tee(sys.stdout, f)
    for i in range(nbGen-1) :
        listeIndividus = combatPhase(nbFight, tPop)
        print("Reproduction de la gen n°" + str(i+1))
        reproductionPhase(listeIndividus, tPop)
        print("Gen n°" + str(i+2) + " :") 

    listeIndividus = combatPhase(nbFight, tPop)

    print("Meilleur ADN de la dernière gen, gen n°" + str(nbGen))
    with open("ADNs.json") as jsonFile:
            ADNs = json.load(jsonFile)
            jsonFile.close()
    print("ADN : " + ADNs["ADN"][listeIndividus[0][0]])
    f.close()

