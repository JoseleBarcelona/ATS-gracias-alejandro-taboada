# Condicionados combinados, la identación que es la tabulación, determina el anidamiento de cada condicional

edad = int(input("Digite su edad: "))
altura = float(input("Digite su altura: "))
#Hacemos condicionales anidados para asegurarnos de que nadie digite una edad negativa

if edad >=0 and edad<100: #Otra sintaxis válida en Python es (if 0<edad<100:)
    print("Edad correcta")
    if edad>=18:
        print("La persona es mayor de edad")
    else:
        print("La persona es menor de edad")
else:
     print("Edad incorrecta")

if 0.45<altura<2.20:
    print("La altura está dentro de la normalidad")
else:
    print("Esa altura está fuera de los parámetros considerados normales")

'''
Digite su edad: 51
Digite su altura: 1.78
Edad correcta
La persona es mayor de edad
La altura está dentro de la normalidad

Process finished with exit code 0
'''