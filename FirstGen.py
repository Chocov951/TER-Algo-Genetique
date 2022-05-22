#!/usr/bin/env python
# coding: utf-8

# In[2]:


import json
import random


# In[3]:


tpop = 30

for i in range(int(tpop/2)-1) :
    with open("ADNs.json") as jsonFile:
        ADNs = json.load(jsonFile)
        jsonFile.close()
    
    
    p1 = random.randint(0,len(ADNs["ADN"])-1) # On détermine le parent 1
    while True:
        p2 = random.randint(0,len(ADNs["ADN"])-1) # On détermine le parent 2
        if(p2 != p1):
            break

    ADNp1 = ADNs["ADN"][p1] 
    ADNp2 = ADNs["ADN"][p2] 
    
    # On détermine à quel endroit on coupe l'adn
    p1Split = random.randint(0,len(ADNp1)/4) * 4
    p2Split = random.randint(0,len(ADNp2)/4) * 4

    f1a = "" # Première moitié de fils 1
    f1b = "" # Deuxième moitié de fils 1
    f2a = "" # Première moitié de fils 2
    f2b = "" # Deuxième moitié de fils 2

    p1Len = len(ADNp1)
    p2Len = len(ADNp2)

    for j in range(p1Len) :
        if (j<p1Split) : f1a += ADNp1[j]
        else : f2b += ADNp1[j]

    for j in range(p2Len) :
        if (j<p2Split) : f2a += ADNp2[j]
        else : f1b += ADNp2[j]

    ADNs["ADN"].append(f1a + f1b)
    ADNs["ADN"].append(f2a + f2b)
    
    with open("ADNs.json", "w") as f:
        json.dump(ADNs, f)
        f.close()
 


# In[ ]:




