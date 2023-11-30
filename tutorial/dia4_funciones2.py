# Organizacion de código:
    # Dentro de una función nunca se pone un print, debido a que tendremos Front y Back,
    # en un sevidor no hay pantalla para imprimir y dichas operaciones se hacen en el Back.
    # todos los print van en la vista (Front).

#   Funciones.

# Esta por si nos hacemos la pixa un lio:
def mediaTresNumeros(num1, num2, num3):     # Cada valor es un argumento de entrada.
    resultado = (num1+num2+num3)/3          
    return resultado                        # Aquí es donde nunca ponemos print.

# Para operaciones sencillas:
def otraMediaTresNumeros(num1, num2, num3):     
    return (num1+num2+num3)/3

# Para divivir la operación en otras más sencillas:
def otraOtraMediaTresNumeros(num1, num2, num3):     
    suma = num1+num2+num3
    return suma/3
    
# Podemos tener funciones sin return.

# La función a continuación es una excepción, normalmente no usamos print() en funciones,
#  solo se usa cuando queremos mostrar algo.
def dibujarLinea(forma):
    print(forma*80)

def dibujarLineaPuntos(): # No tiene parametros de entrada.
    print("."*80)

# Para hacerlo sin print() en la función:
def crearLinea(forma):
    return forma*80

# Esto es del EJERCICIO PRÁCTICO de más abajo de nombre y edad
def presentacion(nombre,edad):
    resultadoP = "Hola, " + nombre + ", dices tener " + edad + " años. Buena edad para jubilarse, ¿Ya cobras la pensión?"
    return resultadoP
    

#   ______________________________________________________________Código principal. ____________________________________________________________________

dibujarLineaPuntos()
dibujarLinea("=")
dibujarLinea("x")
dibujarLinea("¬")
dibujarLinea("w")
dibujarLinea("=")
dibujarLineaPuntos()

# Print de lo que devuelve
print(crearLinea("¡!"))

# EJERCICIOS PRÁCTICOS
    # Línea hecha con o.
    # Im primir en pantalla: "La media de 5, 10, 15 es 10"
    # Línea hecha con O.

num1 = 5
num2 = 10
num3 = 15

media = mediaTresNumeros(num1,num2,num3)

dibujarLinea("o")
print("La media de " + str(num1) + ", " + str(num2) + " y " + str(num3) + " es: " + str(media))
print(f"La media es de {media}")    #esta forma de hacerlo con la "f" (formatear o dar formato) es única de Python
dibujarLinea("O")

#_________________________________________________________________________________________________________________________________________________________

nombre = input("Introduce tu nombre: ")
edad = input("Introduce tu edad: ")
print (presentacion(nombre,edad))



