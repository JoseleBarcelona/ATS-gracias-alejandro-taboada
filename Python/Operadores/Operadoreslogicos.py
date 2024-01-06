'''
and vale 1 y or vale 0
-and tienen que ser los dos valores iguales para que de un True
-or con que solamente haya un True, el resultado es True aunque lo compare con un False
-not cambia el resultado del booleano. Si tienes un False, lo convierte ne True y viceversa

Prioridades de los operadores lógicos

1.NOT
2.AND
3.OR

Prioridades de ejecución aritmética

1. ()
2. **
3. *, /, mod%, not
4. +, -, and
5. >, <, ==, >=, <=, !=, or
'''

#Ejemplos

a = 10
b = 20
c = 30

resultado = ((a<b) and (b<c))
print(resultado)

resultado2 = ((a>b) and (b<c))
print(resultado2)

resultado3 = ((a>b) or (b<c))
print(resultado3)

resultado4 = not ((a>b) or (b<c))
print(resultado4)
'''
True
False
True
False

Process finished with exit code 0
'''


