'''
Hacer un programa que simule un cajero automático con un saldo incial de 1000€
con el siguiente menú de opciones:
1. Ingresar dinero en la cuenta
2. Retirar dinero de la cuenta
3. Mostrar saldo disponible en pantalla
4. Salir
'''

saldo = 1000
# Cada vez que ponga un \t, la tabulación del String avanzará 4 espacios

print("\t\t\tMENU")
print("1. Ingresar dinero en la cuenta")
print("2. Retirar dinero de la cuenta")
print("3. Mostrar dinero disponible")
print("4. Salir")

opcion = int(input("Digite una opción de menu: "))
print() #Esto te da un salto de linea igual que \n
if opcion ==1:
    ingreso = float(input("Teclee la cantidad a ingresar en cuenta: "))
    saldo = saldo + ingreso
    print(f"El saldo en cuenta es de: {saldo:.2f}€")
elif opcion ==2:
    retirar = float(input("Teclee la cantidad a retirar: "))
    if retirar>saldo:
        print("La cantidad a retirar no está disponible")
    else:
        saldo -= retirar
        print(f"El saldo en la cuenta es de: {saldo:.2f}€")
elif opcion ==3:
    print(f"El saldo actual en cuenta es de: {saldo:.2f}")
elif opcion ==4:
    print("Gracias por confiar en 'LA CAIXA'")
else:
    print("La opción marcada no se encuentra disponible")

'''
			MENU
1. Ingresar dinero en la cuenta
2. Retirar dinero de la cuenta
3. Mostrar dinero disponible
4. Salir
Digite una opción de menu: 2

Teclee la cantidad a retirar: 1500
La cantidad a retirar no está disponible

Process finished with exit code 0
'''