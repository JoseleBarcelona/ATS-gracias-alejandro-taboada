#COLAS o FILAS
'''
Una cola es una estructura de datos que almacena elementos en una lista y permite acceder a los datos
 por uno de los dos extremos de la lista. Un elemento se inserta en la cola (parte final) de la lista
  y se suprime o elimina por la frente (parte inicial, cabeza) de la lista.
  FIFO First in, First out (Primero en entrar, primero en salir).
'''
cola = ["José", "Núria", "Neus", "Papa"]  # Personas en la cola o fila
cola.append("Mama")  # Agregamos personas a la cola una tras otra al final de la cola
cola.append("Cristina")
print(cola)

'''
Para ir sacando a los elementos de la cola por el principio, le indicamos al método .pop(0)
que empiece por el índice 0
'''
n = cola.pop(0)  # Sacamos a José de la cola
print(f"{n} está siendo atendido en la cola del banco")
print(cola)
n = cola.pop(0)  # Sacamos a Núria de la cola
print(f"{n} está siendo atendida en la cola del banco")
print(cola)

n = cola.pop(3)  # Si cambio el índice te entrega el valor del índice que queda en la lista desde la última extracción
# Cristina sería el índice 3 ya que antes habríamos sacado de la cola a José y Núria, caso contrario Cristina sería el 6
print(f"{n} está siendo atendida en la cola del banco")
print(cola)
'''
['José', 'Núria', 'Neus', 'Papa', 'Mama', 'Cristina']
José está siendo atendido en la cola del banco
['Núria', 'Neus', 'Papa', 'Mama', 'Cristina']
Núria está siendo atendida en la cola del banco
['Neus', 'Papa', 'Mama', 'Cristina']
Cristina está siendo atendida en la cola del banco
['Neus', 'Papa', 'Mama']

Process finished with exit code 0

'''