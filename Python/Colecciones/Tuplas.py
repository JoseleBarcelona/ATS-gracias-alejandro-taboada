'''
# Las tuplas son como las listas, pero con la diferencia
 de que son listas inmutables (No se pueden modificar una vez tenga
 los parámetros definidos entre los paréntesis ()).
 Las tuplas van entre paréntesis ().
 Las tuplas se utilizan principalmente para hacer búsquedas y la gran ventaja es que se ejecutan
 mucho más rápido y consumen menos memoria que las listas.
'''
tupla = (4, "Hola", 6.78, [1, 2, 3], 4, "Maldita cacatúa")
print(tupla)
print(tupla[1])  #Esto muestra el valor del índice 1, en este caso es: Hola
print(tupla[3])
print(tupla[-1])
print(tupla[2:])
print(4 in tupla)
print(tupla.index("Hola"))
print(tupla.count(4))
print(len(tupla))
'''
Si la tupla la queremos convertir en una lista, la tenemos que guardar en una variable
y convertirla con la función list y al imprimir se mostraría entre corchetes[]
La tupla no quedaría modificada, sino que la conversión queda guardada en una variable
'''
lista = list(tupla)
print(lista)

'''También se puede hacer viceversa, convertir una lista en una tupla'''

lista1 = ["hola", "carabola"]
print(lista1)
tupla1 = tuple(lista1) # se sabe porque en consola sale entre () y no entre []
print(tupla1)
'''
(4, 'Hola', 6.78, [1, 2, 3], 4, 'Maldita cacatúa')
Hola
[1, 2, 3]
Maldita cacatúa
(6.78, [1, 2, 3], 4, 'Maldita cacatúa')
True
1
2
6
[4, 'Hola', 6.78, [1, 2, 3], 4, 'Maldita cacatúa']
['hola', 'carabola']
('hola', 'carabola')
'''