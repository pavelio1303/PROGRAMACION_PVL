# _INSTRUCCIONES_
# _Los mensajes "..." pueden personalizarse. Siéntete libre de añadir todo el lore que quieras.
# _¿Ves funciones dónde no las hay? Hazlas, seguramente mejoren tu código. 



def solicitaNumeroNatural():
    return int(input("Introduce un número natural: "))

def solicitaPalabra():
    return("Introduce una palabra: ")

def solicitaColor():
    return("Introduce un color: ")

def ejercicio0():
    return input("Introduce un color: ")

def ejercicio1():
    return input("Introduce una palabra: ")

def ejercicio10():
    num1 = solicitaNumeroNatural()
    num2 = solicitaNumeroNatural()
    operacion = input("Introduce suma o resta: ")
    if operacion == "suma":
        resultado = num1+num2
    elif operacion == "resta":
        resultado = num1-num2
    else:
        resultado = "NO VÁLIDO"
    return f"La operación '{operacion}' da de resultado {resultado}"    # f significa formato.

def ejercicio13(colorViejo):
    colorNuevo = ejercicio0()
    if colorViejo == colorNuevo:
        respuesta = f"¿Como sabías que mi color favorito es {color}?" 
    else:
        respuesta =  "Ese color no me gusta..."    # Creamos variable respuesta por no poner 
                                                    #   varios return dentro de una función.
    return respuesta
                        # Usamos un return porque es lo mejor en una función 
                        #   en lugar de un print("Ese color...").



# Ejercicios input/print
#0. Solicita por teclado un color. Guardalo para más tarde.
color = ejercicio0()
#1. Solicita por teclado una palabra e imprimela de nuevo. 
palabra = ejercicio1()
print(ejercicio1())
#2. Solicita por teclado una palabra y repítela 5 veces.
#3. Solicita por teclado una palabra y repítela 5 veces separándola por espacios.
#4. Solicita una palabra y un número. Repite la palabra tantas veces como indique el número.
#5. Solicita una palabra y un número. Muestra por pantalla: "Tengo <numero> <palabra>s".

# Ejercicios operadores.
#6. Solicita por teclado un número y multiplícalo por 0.
#7. Solicita por teclado dos números y multiplícalos entre sí.
#8. Solicita por teclado dos números y escribe true si el primero es mayor.
#9. Solicita por teclado un número y escribe true si es par.
#9.1. Solicita por teclado un número y escribe true si es multiplo de 5.


# Ejercicios booleanos - condicionales.
#10. Solicita por teclado dos numeros y la palabra 'suma' o 'resta'. Realiza la operación correspondiente.
print(ejercicio10())
#11. Solicita por teclado dos numeros. Escribe "El primer número es mayor" o "El primer número es menor" segun corresponda.
#12. Solicita por teclado dos numeros. Escribe "Has ganado" si el segundo número menos el primero da un valor positivo.
#13. Solicita por teclado un color. Si coincide con el color del ejercicio #0 escribe "¿Cómo sabías que era mi color favorito?"
print(ejercicio13(color))
#14. Solicita por teclado un día de la semana y un número. Si el número coincide con su día de la semana o el día introducido es viernes escribe "¡Has ganado!"
#15. Solicita por teclado tres núemros. Si los dos primeros son mayores que el tercero, escribe "Mayores"; si los dos son menores que el tercero, escribe "Menores"; para cualquier otro caso, escribe "¿Igua











