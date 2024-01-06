# Funciones integradas

n = "10"       # esto es un String
print(n)
print(type(n))

n1 = int("10") # si le ponemos la función integrada int, convierte la cadena en entero
print(n1)
print(type(n1))

n2 = str(10) #aquí hacemos lo contrario, convertimos un valor numérico en un String
print(n2)
print(type(n2))

n3 = bin(100) # convertimos un número en valor binario
print(n3)

n4 = hex(1000) # convertimos un número en valor hexadecimal
print(n4)

n5 = int("0b1010",2) #también podemos convertir un valor binario en entero
'''
los valores binarios en pyhton te los muestran como una cadena, por lo que tiene que escribirse
entre comillas y para pasarlos a número entero, tiene que precederle el tipo int, escribir el valor binario
 como si fuera un String y después de la coma indicar que está en base 2, que significa que es binario.
Nota: el 0b indica que es un número binario.
'''
print(n5)

n6 = int("0xa",16) # si pones que está en base 16, indicas que es un valor hexadecimal
  # aquí convertimos un valor hexadecimal en valor entero
print(n6)

n7 = abs(-8) # valor absoluto
print(n7)

n8 = round(15.26897415)
print(n8)

n9 = len("Núria te adoro")
# esta función te cuenta la longitud de la cadena incluido los espacios ya que ocupan un lugar en la memoria
print(n9)

'''
10
<class 'str'>
10
<class 'int'>
10
<class 'str'>
0b1100100
0x3e8
10
10
8
15
14

Process finished with exit code 0
'''