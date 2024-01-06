#BUCLE WHILE
# vamos pedir que el bucle se repita hasta que el valor sea positivo
# queremos saber la raiz cuadrada por lo que el número ha de ser positivo

import math   #importamos el módulo math

numero = int(input("Digite un número: "))

while numero < 0:
    print("ERROR, el número digitado debe ser positivo")
    numero = int(input("Digite un número: "))

print(f"La raiz cuadrada de {numero} es: {(math.sqrt(numero)):.2f}")

'''
CÓDIGO EJECUTADO

Digite un número: -658
ERROR, el número digitado debe ser positivo
Digite un número: -984
ERROR, el número digitado debe ser positivo
Digite un número: 98
La raiz cuadrada de 98 es: 9.90

Process finished with exit code 0
'''