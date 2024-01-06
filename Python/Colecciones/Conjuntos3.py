#Conjuntos y subconjuntos

a = {1, 2, 3}
b = {3, 4, 5}

c = {1, 2, 3, 5}
print(a.issubset(c))    #Preguntamos si a es un subconjunto de c
print(b.issubset(c))
print(c.issuperset(a))  #Preguntamos si c es un superconjunto de a
print(c.issuperset(b))
print(a.isdisjoint(b))  #Preguntamos si a no está unido a b. Sería falso ya que comparten 3

d = frozenset({1, 2, 3,})  #Con frozenset convertimos al conjunto en inmutable como en una tupla

'''
True
False
True
False
False
'''
