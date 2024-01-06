'''
Escriba un programa donde tenga una lista y que a continuación elimine los
elementos repetidos y por último mostrar la lista.
'''
'''El conjunto es la colección que no admite duplicados con el set() convertimos la lista en un conjunto
y lo guardamos en la variable conjunto
'''
lista = [1, 2, 3, "José", 2, 2, 1, "José", 3]
conjunto = set(lista)    #Convertimos la lista a conjunto y los duplicados quedan eliminados
lista = list(conjunto)   #Convertimos el conjunto de nuevo en lista pero con los duplicados ya eliminados
print(lista)

# Otra manera más creativa de resolver el mismo problema es la siguiente:

lista1 = [1, 2, 3, "José", 2, 2, 1, "José", 3]
lista1 = list(set(lista1))  #Con el set() lista1 pasa a conjunto y con el list() vuelve a lista sin duplicados
print(lista1)               #Esto lo hacemos a través de la sobreesritura

'''
[1, 2, 3, 'José']
[1, 2, 3, 'José']

Process finished with exit code 0
'''