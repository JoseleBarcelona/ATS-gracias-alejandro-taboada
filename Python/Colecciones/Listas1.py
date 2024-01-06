#Las listas en otros lenguajes de programación son conocidadas como Arrays o vectores.
#Las listas van entre corchetes []
lista = ["Lunes", "Martes", "Miercoles", "Jueves", "Viernes", 40, 5.67, [1, 2, 3], True]
print(lista)      #imprime todos los elementos de la lista
print(lista[0])   #imprime el primer elemento de derecha a izquierda
print(lista[4])   #imprime el último elemento de derecha a izquierda
print(lista[-5])  #imprime el último elemento de izquierda a derecha
print(lista[-1])  #imprime el primer elemento de izquierda a derecha
print(lista[0:3]) #imprime la posición 0, 1 y 2 en memoria y se queda uno antes que es el 3
print(lista[2:4]) #imprime desde la posición 2 de la memoria hasta la 3 ya que es uno menos que el intervalo marcado
print(lista[:3])  #imprime desde el 0 al 2
print(lista[2:])  #imprime desde la posición 2 hasta el final
print(len(lista)) #len te cuenta los elementos que tiene la lista
lista[0] = "El coño de tu prima"  #El valor que está en el índice 0 cambia al nuevo valor
print(lista)
'''
['Lunes', 'Martes', 'Miercoles', 'Jueves', 'Viernes', 40, 5.67, [1, 2, 3], True]
Lunes
Viernes
Viernes
True
['Lunes', 'Martes', 'Miercoles']
['Miercoles', 'Jueves']
['Lunes', 'Martes', 'Miercoles']
['Miercoles', 'Jueves', 'Viernes', 40, 5.67, [1, 2, 3], True]
9
['El coño de tu prima', 'Martes', 'Miercoles', 'Jueves', 'Viernes', 40, 5.67, [1, 2, 3], True]

'''