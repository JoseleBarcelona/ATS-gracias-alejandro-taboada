'''
Escriba un programa que tenga dos listas y que a continuación cree las siguientes listas
(en las que no deben haber repeticiones):
1. Lista de elementos que aparecen en las dos listas.
2. Lista de elementos que aparecen en la primera lista, pero no en la segunda.
3. Lista de elementos que aparecen en la segunda lista, pero no en la primera.
4. Lista de elementos qaue aparecen en ambas listas.
'''
lista1 = [-1, 0, 1, 2, 3, 3, 2, 3, "Hello", 1, "Hello"]
lista2 = [2, 3, 4, 1, 1, 5, 7, 8, "Hello", 1, 1, 5]

conjunto1 = set(lista1)
conjunto2 = set(lista2)
print(conjunto1, conjunto2) # creamos dos conjuntos para eliminar duplicados

union = list(conjunto1 | conjunto2)  # lo convertimos en lista y sumamos los elementos
soloA = list(conjunto1 - conjunto2)  # elementos que aparecen en a y no en b
soloB = list(conjunto2 - conjunto1)  # elementos que aparecen en b y no en a
interseccion = list(conjunto1 & conjunto2)   #elementos que aparecen en común

print(f"Lista de elementos que aparecen en las dos listas: {union}")
print(f"Lista de elementos que aparecen en la primera lista, pero no en la segunda: {soloA}")
print(f"Lista de elementos que aparecen en la segunda lista, pero no en la primera: {soloB}")
print(f"Lista de elementos qaue aparecen en ambas listas: {interseccion}")

'''
CÓDIGO EJECUTADO

{0, 1, 2, 3, 'Hello', -1} {1, 2, 3, 4, 5, 7, 8, 'Hello'}
Lista de elementos que aparecen en las dos listas: [0, 1, 2, 3, 4, 5, 7, 8, 'Hello', -1]
Lista de elementos que aparecen en la primera lista, pero no en la segunda: [0, -1]
Lista de elementos que aparecen en la segunda lista, pero no en la primera: [8, 4, 5, 7]
Lista de elementos qaue aparecen en ambas listas: [1, 2, 3, 'Hello']

Process finished with exit code 0
'''