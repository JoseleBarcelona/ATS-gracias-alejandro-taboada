'''
Hacer un programa que pida dos números y se de cuenta cuál de ellos
es par o si ambos lo son.
'''
print("NÚMEROS PARES E IMPARES\n")
num1 = int(input("Digite un número: "))
num2 = int(input("Digite otro número: "))
if num1 %2 == 0:  #Una manera de hacerlo
    print(f"El número {num1} es PAR")
else:
    print(f"El número {num1} es IMPAR")

if num2 %2 !=0:  #Otra manera de hacerlo
    print(f"El número {num2} es IMPAR")
else:
    print(f"El número {num2} es PAR")

'''
Digite un número: 4
Digite otro número: 5
El número 4 es PAR
El número 5 es IMPAR

Process finished with exit code 0
'''