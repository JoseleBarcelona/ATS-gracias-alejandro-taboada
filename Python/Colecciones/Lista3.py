
lista = [1, 2, 3, 4, 5, "Neus"]
print(lista)
print(3 in lista)           # in pregunta si el valor de 3 está dentro de la lista (True)
print("Núria" in lista)     # in pregunta si el String Núria está dentro de la lista (False)
print(lista.index(5))       # .index te dice en qué índice o posición se encuentra el valor 5
print(lista.index("Neus"))  # .index te dice en qué índice se encuentra el String Neus.

lista.pop()      # .pop() me elimina el último elemento de la lista
lista.pop(3)     # .pop(3) con un parámetro dentro, indica el índice del valor que se quiere eliminar
lista.remove(3)  # .remove(3) te elimina el valor digitado, no el valor que esté en el índice 3 como .pop
print(lista)

lista2 = [1, 2, 3, 4, 5, 1, 1, 1, 1, 1,  "Neus"]  # En las listas pueden haber elementos repetidos
print(lista2)
print(lista2.count(1)) #.count cuenta las veces que aparece el valor dentro de la lista, en este caso el 1 está 4 veces

lista2.reverse()  # .reverse invierte los elementos en la salida a consola
print(lista2)

lista3 = [1, 2, 3, 4, 5, "Neus", 1, 2, 3, 1, 2, 1]
lista3.clear()  # .clear borra todos los elementos de la lista
print(lista3)

lista4 = [1, 2, 3, 4, 5, "Neus"] * 4  # esto te concatena los elementos 4 veces seguidas
print(lista4)

lista5 = [-7, -8, -6, -2, 0, 6, 9, 7, 5]
lista5.sort()  # .sort te ordena los números ascendentemente
print(lista5)

lista6 = [-7, -8, -6, -2, 0, 6, 9, 7, 5]
lista6.sort(reverse=True)  #.sort(reverse=True) ordena los elementos descendentemente
print(lista6)
'''
[1, 2, 3, 4, 5, 'Neus']
True
False
4
5
[1, 2, 5]
[1, 2, 3, 4, 5, 1, 1, 1, 1, 1, 'Neus']
6
['Neus', 1, 1, 1, 1, 1, 5, 4, 3, 2, 1]
[]
[1, 2, 3, 4, 5, 'Neus', 1, 2, 3, 4, 5, 'Neus', 1, 2, 3, 4, 5, 'Neus', 1, 2, 3, 4, 5, 'Neus']
[-8, -7, -6, -2, 0, 5, 6, 7, 9]
[9, 7, 6, 5, 0, -2, -6, -7, -8]
'''
