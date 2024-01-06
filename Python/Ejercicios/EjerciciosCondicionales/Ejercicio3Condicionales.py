#Hacer un programa que pida tres números y que diga cuál es mayor

num1 = int(input("Digite el primer número: "))
num2 = int(input("Digite el segundo número: "))
num3 = int(input("Digite el tercer número: "))

if num1>=num2 and num1>=num3:
    print(f"{num1} es el mayor de los tres")
elif num2>=num1 and num2>=num3:
    print(f"{num2} es el mayor de los tres")
elif num3>=num1 and num3>=num2:
    print(f"{num3} es el mayor de los tres")

'''
Digite el primer número: 25
Digite el segundo número: 14
Digite el tercer número: 68
68 es el mayor de los tres

Process finished with exit code 0
'''