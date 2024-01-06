'''
Los conjuntos son un tipo de colección donde los elementos se agregan de forma desordenada
donde su principal característica es que no pueden haber duplicados.
Dentro de un conjunto no puede haber otro tipo de colecciones, ejemplo: conjunto = {1,2,3,[8,9]}
la lista 8, 9 la detectaría como un error.
'''
conjunto = set()  #Para indicar que es un conjunto y no un diccionario, a la variable se lo indicamos con set()
conjunto = {1, 2, 3, "Hola", 4.56, 1, 2, 3} #Si duplico 1 2 3 en consola no lo saca ya que no admite duplicados
conjunto.add(5)  #si agregegamos un valor, lo agrega donde quiere ya que el conjunto son valores desordenados.
conjunto.add("Núria")  #.add agrega un valor al conjunto
conjunto.add('d')
print(conjunto)
print(3 in conjunto)  # in pregunta si el valor de 3 está dentro del conjunto (True)
print("Hola" in conjunto)
print(2 not in conjunto)  # not in pregunta si el valor de 2 no está dentro del conjunto (False)

conjunto2 = {1, 2, 3, 4, 5, 6, "Neus"}
conjunto2.discard("Neus")  # .discard elimina un elemento del conjunto
print(conjunto2)

conjunto3 = {1, 2, 3, 4, 5}
conjunto3.clear()  #Clear elimina todos los elementos del conjunto
print(conjunto3)

'''
{1, 2, 3, 'Hola', 4.56, 5, 'd', 'Núria'}
True
True
False
{1, 2, 3, 4, 5, 6}
set()

Process finished with exit code 0
'''
