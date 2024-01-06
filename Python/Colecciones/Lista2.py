'''
Las posiciones en las listas o arrays van de la siguiente manera:
0, 1, 2, 3, 4,...etc., siendo 0 la primera posición
'''
lista = [1, 2, 3, 4, 5]
lista.append(6) #append te agrega un elemento al final de la lista
lista.append("Núria")
lista.insert(0, 0) #inserta el valor 0 en la posición cero que es la primera
'''
con el .insert se le tienen que dar dos valores, el primer valor determina el índice o
posición donde quieres que vaya el nuevo valor insertado y el segundo muestra el valor
'''
lista.insert(2, "Neus") #inserta el String Neus en la posición 2 que es la tercera

print(lista)

lista2 = [1, 2, 3, 4, 5]
lista2.extend([6, 7, 8, 9, 10]) # .extend concatena varios elementos a la vez al final de la lista

print(lista2)
#Otra manera de concatenar es de la siguiente manera
lista3 = [1, 2, 3]
lista4 = [4, 5, 6]
lista5 = lista3 + lista4
print(lista5)
'''
[0, 1, 'Neus', 2, 3, 4, 5, 6, 'Núria']
[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
[1, 2, 3, 4, 5, 6]

'''
