'''
Los diccionarios son otro tipo de colección, donde los elementos se guardan también desordenados
y la principal característica es que tienen dos elementos por posición (la clave y el valor)
y en estos tampoco pueden haber claves duplicadas. Diccionario = {"clave":"valor", "clave":"valor"}
'''
diccionario = {"azul":"blue", "rojo":"red", "verde":"green"}

diccionario["amarillo"] = "yellow"   # manera de agregar un nuevo elemento
diccionario["rojo"] = "RED"          # modifica el valor de la clave (sobreescribe)
print(diccionario)
print(diccionario["azul"])
print(diccionario["amarillo"])

diccionario1 = {"azul":"blue", "rojo":"red", "verde":"green"}
del(diccionario1["verde"])   # Borrando la clave, se borra el valor
print(diccionario1)
#En los diccionarios se pueden meter listas, tuplas, int, floats, diccionarios, etc.
diccionario2 = {"Alejandro":{"edad":22, "estatura":1.73}, "José":[21, 1.75], "María":[22, 1.67]}
print(diccionario2)
print(diccionario2["Alejandro"])   #Mostramos el valor de esta clave en concreto

diccionario3 = {"María":{"María":{"edad":25, "estatura":1.80}}}
print(diccionario3["María"])

'''
{'azul': 'blue', 'rojo': 'RED', 'verde': 'green', 'amarillo': 'yellow'}
blue
yellow
{'azul': 'blue', 'rojo': 'red'}
{'Alejandro': {'edad': 22, 'estatura': 1.73}, 'José': [21, 1.75], 'María': [22, 1.67]}
{'edad': 22, 'estatura': 1.73}
{'María': {'edad': 25, 'estatura': 1.8}}
'''