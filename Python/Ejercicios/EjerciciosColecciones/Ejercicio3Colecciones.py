'''
Escriba una lista donde se cree una lista con los siguientes personajes de cuentos
1. Nombre: Heidi      1. Nombre: Abuelito   1. Nombre: Pedro
   Oficio: pastora    2. Oficio: pastor     2. Oficio: cabrero
   Relación : nieta   3. Relación: abuelo   3. Relación : amigo
'''
personajes = []  # creamos una lista vacía

personaje1 = {"Nombre": "Heidi", "Oficio": "Pastora", "Relación":"Nieta"}  # creamos un diccionario con la clave e índice
personaje2 = {"Nombre": "Abuelito", "Oficio": "Pastor", "Relación":"Abuelo"}
personaje3 = {"Nombre": "Pedro", "Oficio": "Cabrero", "Relación":"Amigo"}

personajes.append(personaje1)  #agregamos a la lista el personaje
personajes.append(personaje2)
personajes.append(personaje3)
print(personajes)

'''
CÓDIGO EJECUTADO

[{'Nombre': 'Heidi', 'Oficio': 'Pastora', 'Relación': 'Nieta'}, {'Nombre': 'Abuelito', 'Oficio': 'Pastor', 'Relación': 'Abuelo'}, {'Nombre': 'Pedro', 'Oficio': 'Cabrero', 'Relación': 'Amigo'}]
'''