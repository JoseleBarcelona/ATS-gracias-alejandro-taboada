#Bucle for
'''
El bucle for se utiliza con colecciones y el iterador recorre elemento por elemento
las colecciones (Tuplas, conjuntos, listas, diccionarios....etc) y su sintaxis es:
for iterador in [], for iterador un (), for iterador in {}, etc.
'''
for i in [1, 2, 3, 4, "Alejandro", 5.12, "papa"]:  # con la identación (separación de 4 espacios) indicamos que estamos dentro del bucle
    print("Hola chavales")  # i recorre la lista elemento por elemento, en nuestro caso 7 veces

for f in [1, 2, 3, 4, "Alejandro", 5.12, "papa"]:
    print(f)   # Imprime el valor de cada elemento

coleccción = [3, 6, 133, 65, "Leche"]
for j in coleccción:
    print(f"Elementos {j}")   ## Imprime el valor de cada elemento

coleccción1 = {"Papa": 81, "Mama": 76, "Núria": 51, "Neus": 24} # creamos un diccionario
for g in coleccción1:
    print(f"clave: {g}")   # Muestra sólo la clave del diccionario
    print(f"valor: {coleccción1[g]}")  #Muestra el valor de la clave
    print(f"{g} -> {coleccción1[g]}")  #Muestra el nombre de la clave y el valor de la misma a la vez

for clave, valor in coleccción1.items():  #.items recorre todos los elementos del diccionario
    print(f"{clave} -> {valor}")

coleccción2 = "Alejandro"
for i in coleccción2:
    print(coleccción2)
    print("Hola")

for j in coleccción2:
    print(f"{j}")

for k in coleccción2:
    print(f"{k}", end=" ")

'''
Código ejecutado

Hola chavales
Hola chavales
Hola chavales
Hola chavales
Hola chavales
Hola chavales
Hola chavales
1
2
3
4
Alejandro
5.12
papa
Elementos 3
Elementos 6
Elementos 133
Elementos 65
Elementos Leche
clave: Papa
valor: 81
Papa -> 81
clave: Mama
valor: 76
Mama -> 76
clave: Núria
valor: 51
Núria -> 51
clave: Neus
valor: 24
Neus -> 24
Papa -> 81
Mama -> 76
Núria -> 51
Neus -> 24
Alejandro
Hola
Alejandro
Hola
Alejandro
Hola
Alejandro
Hola
Alejandro
Hola
Alejandro
Hola
Alejandro
Hola
Alejandro
Hola
Alejandro
Hola
A
l
e
j
a
n
d
r
o
A l e j a n d r o 
'''