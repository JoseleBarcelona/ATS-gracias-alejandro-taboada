#Hacer un programa que pida un carácter e indique si es una vocal o no.

letra = input("Digite una letra del abecedario: ").lower()
#  .lower() te transforma las mayúsculas en minúsculas, en caso de que el usuario digite la letra en mayúscula

if letra =='a' or letra =='e' or letra =='i' or letra =='o' or letra =='u':
    print(f"{letra} es una vocal")
else:
    print(f"{letra} es una consonante")

    '''
    Digite una letra del abecedario: t
t es una consonante

Process finished with exit code 0
    '''
