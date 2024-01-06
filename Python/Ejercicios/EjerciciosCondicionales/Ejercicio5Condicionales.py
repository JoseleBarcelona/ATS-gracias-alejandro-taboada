'''
Construir un programa que simule el funcionamiento de una calculadora
que pueda realizar las cuatro operaciones básicas (Suma, resta, mult, div).
El usuario debe especificar la operación con el primer carácter del nombre
de la operación.
S,s = suma
R,r = resta
M,m = multiplicación
D,d = división
'''
num1 = float(input("Digite un número: "))
num2 = float(input("Digite otro número: "))
operación = input("Digite la operación que quiere realizar\nSuma: S,s\nResta: R,r\nMultiplicación: M,m\nDivisión: D,d\n").upper()
# el método .upper() te transforma las letras minúsculas en mayúsculas en caso de que el usuario digite una minúscula.
if operación == 'S':
    suma = num1+num2
    print(f"La suma es: {suma}")
elif operación == 'R':
    resta = num1-num2
    print(f"La resta es: {resta}")
elif operación == 'M':
    mult = num1*num2
    print(f"La multipliccación es: {mult}")
elif operación == 'D':
    div = num1/num2
    print(f"La división es: {div:.2f}")# .2f indica que solo quiero ver dos decimales en la consola
else:
    print("El carácter digitado es erroneo, vuelva a intentarlo")

    '''
    Digite un número: 8
Digite otro número: 9
Digite la operación que quiere realizar
Suma: S,s
Resta: R,r
Multiplicación: M,m
División: D,d
m
La multipliccación es: 72.0

Process finished with exit code 0
    '''
