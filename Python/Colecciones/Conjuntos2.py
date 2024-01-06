'''
Un conjunto se crea de esta manera, a = set() siempre y cuando vaya a ser un conjunto
vacio que posteriormente se le vayan a ir agregando valore como por ejemplo a.add().
Pero si desde un inicio se le van a ir poniendo elemento no haría falta crear el conjunto set(),
Lo haremos directamente entre corchetes{}
'''
a = {1, 2, 3}
b = {3, 4, 5}
print(a == b)  # con esto preguntamos la igualdad
print(len(a))  # longitud de los elementos

c = a | b      # la suma se hace con el carácter |
print(c)       # El valor 3 solo aparece una vez ya que los conjuntos no duplican valores
d = a & b      # con & pedimos los valores en común (Intersección) de los dos conjuntos, en este caso es 3
print(d)
e = a - b      # con el - pedimos los elementos de a que no están en b
print(e)
f = b - a      # aquí pedimos los elementos de b que no están en a
print(f)
g = a ^ b      # esto ^ pide la diferencia simétrica (Elementos que están en a y en b pero no en ambos)
print(g)

'''
False
3
{1, 2, 3, 4, 5}
{3}
{1, 2}
{4, 5}
{1, 2, 4, 5}
'''