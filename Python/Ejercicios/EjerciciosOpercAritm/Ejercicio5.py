'''
Una tienda ofrece un descuento de un 15% sobre el total de la compra y un cliente
desea saber cuánto deberá pagar finalmente por su compra.
'''

precio = float(input("Digite el precio del producto: "))
descuento = precio * 0.15
precio_final = precio - descuento

print(f"El precio final es de: {precio_final:.2f}")#.2f indica que solo saldrá en consola 2 decimales.

'''
Digite el precio del producto: 14
El precio final es de: 11.90

Process finished with exit code 0
'''