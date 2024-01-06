#PILAS
'''
Una pila (stack en inglés) es una lista ordenada o estructura de datos
que permite almacenar y recuperar datos,siendo el modo de acceso a sus elementos de tipo LIFO
(del inglés Last In, First Out, «último en entrar, primero en salir»).
'''
pila = [1, 2, 3]
pila.append(4)  #Agregamos elementos por el final (Se apilan)
pila.append(5)
pila.append(6)
print(pila)

n = pila.pop()  #Elimina el último elemento agregado (Apilado), que al guardarlo en una variable, podemos recuperarlo.
print(f"El elemento extraido es el {n}")  #Dentro de n queda guardado el elemento eliminado
print(pila)
n = pila.pop()
print(f"El elemento extraido es el {n}")
print(pila)
pila.pop()   #Elimina el siguiente último elemento apilado directamente sin guardarlo en una variable.
print(pila)
'''
[1, 2, 3, 4, 5, 6]
El elemento extraido es el 6
[1, 2, 3, 4, 5]
El elemento extraido es el 5
[1, 2, 3, 4]
[1, 2, 3]

Process finished with exit code 0
'''