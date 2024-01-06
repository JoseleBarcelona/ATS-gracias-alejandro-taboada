# Programa para intercambiar el valor de dos variables

a = input("Digite el valor de a: ")
b = input("Digite el valor de b: ")

a, b = b, a

print(f"El nuevo valor de a es: {a}")
print(f"El nuevo valor de b es: {b}")

'''
Digite el valor de a: 7
Digite el valor de b: 8
El nuevo valor de a es: 8
El nuevo valor de b es: 7

Process finished with exit code 0
'''