# Entrada de datos

nombre = input("Digite su nombre: ") #input solo guarda datos de tipo cadena
print(f"Hola {nombre}")
print("Hola", nombre)
print("Hola {}".format(nombre))

numero = int(input("Digite un número: "))#para que input pueda guardar números enteros, hay que anidarlo en un int
print(f"El resultado de la suma es {numero+3}")

numero = float(input("Digite un número decimal: "))
#para que input pueda guardar números decimales, hay que anidarlo en un float
print(f"El resultado de la suma es {numero+3}")

'''
Digite su nombre: Josele
Hola Josele
Hola Josele
Hola Josele
Digite un número: 25
El resultado de la suma es 28
Digite un número decimal: 14.54
El resultado de la suma es 17.54

Process finished with exit code 0
'''
