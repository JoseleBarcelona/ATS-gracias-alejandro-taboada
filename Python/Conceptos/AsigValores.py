numero = 10
print("El resultado de la multiplicación es: ", numero * 5)
print("El número digitado es:", numero)
print("Neus preciosa " * 5)
print("\nNeus preciosa " * 5)
print(type(numero)) #Type te dice qué tipo de variable es, en este caso es  un "int"

decimal = 20.54
print(decimal)
print(type(decimal)) #Aquí te dice que es un "float"

cadena = 'Neus, eres "muy guapa" ' #combinación de comillas doble y simples para entrecomillar una palabra o frase
print(cadena)
print(type(cadena)) #Esto te dice que es un "String"

valor = True #True o False empiezan por mayúsculas
valor1 = False
print(valor)
print(type(valor)) #Esto indica un booleano

num1 = 10
num2 = 20
suma = (num1 + num2) * 2 / 3
print("El resultado de la operación es: ", suma)
"""
Python admite el tipado dinámico, esto quiere decir que a lo largo del programa, si el programador
quiere, el valor de una variable puede cambiar tantas veces como se quiera (Sobreescritura tipada o sea
de tipos, (Strings, int, boolean, char, double, float, etc)
"""
valor2 = 8
print(valor2)
valor2 = "Josele Barcelona"
print(valor2)

'''
El resultado de la multiplicación es:  50
El número digitado es: 10
Neus preciosa Neus preciosa Neus preciosa Neus preciosa Neus preciosa 

Neus preciosa 
Neus preciosa 
Neus preciosa 
Neus preciosa 
Neus preciosa 
<class 'int'>
20.54
<class 'float'>
Neus, eres "muy guapa" 
<class 'str'>
True
<class 'bool'>
El resultado de la operación es:  20.0
8
Josele Barcelona

Process finished with exit code 0
'''


