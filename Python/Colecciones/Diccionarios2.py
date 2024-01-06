
equipo = {10:"Messi", 9:"Piqué", 8:"Guardiola", 7:"Iniesta"}

print(equipo)
print(equipo[10])
'''
Si digitamos una clave que no existe dentro del diccionario, podemos en su valor mostrar un mensaje
adicional con el método .get()
'''
print(equipo.get(9,"No existe un jugador con ese dorsal"))  #Aquí como existe en el diccionario, lo muestra.
print(equipo.get(6, "No existe un jugador con ese dorsal")) #Aquí muestra el mensaje por defecto al no existir.
print(10 in equipo)     #El jugador 10 está en el equipo
print(6 not in equipo)  #El jugador 6 no está en el equipo
print(equipo.keys())    # .keys te muestra las claves que están en el equipo
print(equipo.values())  # .values te muestra los valores del diccionario
print(equipo.items())   # .items te hace una lista y dentro de tuplas te pone la clave y valor de todo el diccionario
print(len(equipo))      # te indica cuantos elementos hay en el diccionario

equipo1 = {10:"Messi", 9:"Piqué", 8:"Guardiola", 7:"Iniesta"}
equipo1.clear()  #Limpiamos el diccionario
print(equipo1)
'''
{10: 'Messi', 9: 'Piqué', 8: 'Guardiola', 7: 'Iniesta'}
Messi
Piqué
No existe un jugador con ese dorsal
True
True
dict_keys([10, 9, 8, 7])
dict_values(['Messi', 'Piqué', 'Guardiola', 'Iniesta'])
dict_items([(10, 'Messi'), (9, 'Piqué'), (8, 'Guardiola'), (7, 'Iniesta')])
4
{}

'''