import os

#Josue Blanco Arias 
#https://www.youtube.com/watch?v=5JHo7YULXPc
#https://www.youtube.com/watch?v=h-cFWLLmzrk
#https://docs.python.org/3/library/functions.html#open

nombre_archivo = "Agenda.txt"
#Hacer el archivo una variable

if os.path.exists(nombre_archivo):

    with open(nombre_archivo,'r') as archivo:

        lista_diccionarios= []

        for linea in archivo.readlines():
            elementos = list(map(str.strip,linea.split(',')))

            if len(elementos) == 4:
                nuevo_registro = {
                    "Nombre": elementos[0],
                    "Numero de telefono": elementos[1],
                    "Correo electronico": elementos[2],
                    "Direccion": elementos[3]
                    }
                
                lista_diccionarios.append(nuevo_registro)
            else:
                print (f'Error: la linea "{linea.strip()}" no tiene el formato esperado y sera omitida ')
else:
    lista_diccionarios = []



def agregar_registros():
    
    nombre = input('Ingrese el nombre: ')

    while True:
        ntelefono = input('Ingrese su numero de telefono: ')
        if ntelefono.isdigit():
            break
        else:
            print('Digite solo números')

    correoelec = input('Ingrese su correo electronico: ')
    direccion = input('Ingrese su direccion: ')

    nuevo_registro = {
        "Nombre": nombre,
        "Numero de telefono": ntelefono,
        "Correo electronico": correoelec,
        "Direccion": direccion
    }
    
    lista_diccionarios.append(nuevo_registro)
    guardarinformacion()
    print(f'Informacion guardada en "{nombre_archivo}"')
    print("Registro Creado Exitosamente")



def guardarinformacion():
    with open(nombre_archivo,'w') as archivo:
        for diccionario in lista_diccionarios:
            linea = ','.join([f'{valor}' for valor in diccionario.values()])
            archivo.write(linea+ '\n')



def visualizarlista():
    for i,diccionario in enumerate(lista_diccionarios,1):
        print(f'Registro:{diccionario}')



def visualizaruser():
    #Primero pregunta por el nombre a buscar 
    nombre_buscar = input("Ingrese el nombre a buscar: ")
    for i, diccionario in enumerate(lista_diccionarios, 1):
        
        #EL i en for itera en la lista para buscar en lista diccionarios, 
        #el elemento a buscar  y diccionario es el elemento actual en la lista 
        
        if diccionario["Nombre"] == nombre_buscar:
            
            #Si el elemento coincide con el elemento a buscar, entonces cumple condicion 
            # e imprime solo el regiastro solicitado

            print(f'Registro {i}: {diccionario}')
            break
    else:
        print('Ese nombre no se ha encontrado')



def eliminaruser():

    nombre_eliminar = input("Ingrese el nombre a eliminar: ")

    for i, diccionario in enumerate(lista_diccionarios, 1):
        if diccionario["Nombre"] == nombre_eliminar:

            #misma func modificada , si el elemento a buscar coincide con el elemento en el diccionario 
            #entonces con el .remove borra todo ese registro

            print(f'Registro: {diccionario}')

            lista_diccionarios.remove(diccionario)

            guardarinformacion()

            #se invoca la funcion para actualizar el txt
            print(f'El registro con el nombre "{nombre_eliminar}" ha sido eliminado.')
            break
    else:
        print(f'El nombre "{nombre_eliminar}" no se ha encontrado en la lista.')


def moduser():
    nombre_eliminar = input("Ingrese el nombre a modificar: ")

    for diccionario in lista_diccionarios:
        if diccionario["Nombre"] == nombre_eliminar:
            nombrenuevo = input("Ingrese el nuevo nombre: ")

            while True:
                ntelefonon = input('Ingrese el nuevo numero de telefono: ')
                if ntelefonon.isdigit():
                    break
                else:
                    print('Digite solo números')

            correoelecn = input("Ingrese la nueva direccion de correo electronico: ")
            direccionn = input('Ingrese la nueva direccion: ')

            # Modificamos el valor correspondiente en el diccionario
            diccionario["Nombre"] = nombrenuevo
            diccionario["Numero de telefono"] = ntelefonon
            diccionario["Correo electronico"] = correoelecn
            diccionario["Direccion"] = direccionn

            guardarinformacion()  # Se guarda la información actualizada

            print(f'El nombre "{nombre_eliminar}" ha sido modificado a "{nombrenuevo}".')
            break
    else:
        print(f'El nombre "{nombre_eliminar}" no se ha encontrado en la lista.')



def menu ():
    print('\n1. Agregar nuevo contacto')
    print('2. Visualizar todos los contactos')
    print('3. Visualizar contacto')
    print('4. Eliminar contacto')
    print('5. Modificar usuario')
    print("6. Salir")



while True:
    menu()
    opcion = input("\nIngrese una opcion deseada: ")
    if opcion == '1': 
        agregar_registros()
    elif opcion == '2':
        visualizarlista()
    elif opcion == '3':
        visualizaruser()
    elif opcion == '4':
        eliminaruser()
    elif opcion=='5':
        moduser()
    elif opcion == '6':
        break
    else:
        print('Opcion invalida, intente nuevamente')

