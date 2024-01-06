'''
Hacer un programa que pida dos números y se de cuenta cuál de ellos
es par, cuál es impar, si ambos son pares o ambos son impares.
'''
print("PARES O NONES\n")
num1 = int(input("Digite un número:"))
num2 = int(input("Digite otro número:"))

if num1 %2 ==0 and num2 %2 ==0:
    print("Ambos números son PARES")
elif num1 %2 == 0 and num2 %2 !=0:
    print(f"El número {num1} es PAR y el número {num2} es IMPAR")
elif num1 %2 !=0 and num2 %2 ==0:
    print(f"El número {num1} es IMPAR y el número {num2} es PAR")
else:
    print("Ambos números son IMPARES")

    '''
    Digite un número:8
Digite otro número:9
El número 8 es PAR y el número 9 es IMPAR

Process finished with exit code 0
    '''