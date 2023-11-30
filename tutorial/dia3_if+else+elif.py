#EJERCICIOS PRÁCTICOS
print ("Ejercicios prácticos:")

#Ejer. 1
print ("¿Eres mayor de edad?")

edad = int(input("Introduce tu edad: ")) #Si introducimos texto dentro del 'input' hace que 
                                         #el valor inroducido en el ejecutable aparezca justo a continuación.

esMayorEdad = (edad >= 18)      # Se puede escribir también 'esMayorEdad = edad >= 18'.

print (esMayorEdad)             # 'esMayorEdad' es de tipo bool.
print (type(esMayorEdad))       # 'type' Imprime el tipo del objeto que tiene dentro.

if esMayorEdad:
    print("Es mayor de edad.")  # Todo lo que vaya dentro del 'if' va TABULADO.
else:                           # El 'else' siempre tiene que ir debajo de 'if', aunque no es obligatorio y se puede omitir.
    print("Es menor de edad.")



#Ejer. 3
print("Ejer. 3. ¿Es positivo o negativo?")

numero = int(input("Introduce un número: "))
esPositivo = (numero > 0)

if esPositivo:
    print("Es positivo.")
elif numero == 0:               # 'elif' (else if) se utiliza para añadir alguna excepción entre 'if' y 'else'.
    print("Es 0.")
else:
    print("Es negativo.")



#Ejer. 5
print("Ejer. 5. ¿Aprobado o suspenso?")

nota = int(input("Introduce tu nota: "))

esNoVale = (nota < 0 or nota > 10)      # Nombramos como 'esNoVale' añadiendo el 'es' para automáticamente saber al verlo que es un 'bool'
esSobresaliente = (nota >= 9 and nota <= 10)
esNotable = (nota >= 7)       # Omitimos  'and nota < 9' puesto que el codigo al ejecutarse en orden 
esBien = (nota >= 6)          #  y ya 'sobresaliente' estar por encima  no hace falta ponerlo por optimización.
esSuficiente = (nota >= 5)
#esSuspenso = (nota < 5), lo omitimos porque ya se incluse en el else.

if esNoVale:
    print("Nota no válida.")
elif esSobresaliente:
    print("Sobresaliente, buenardium.")
elif esNotable:
    print("Notable.")
elif esBien:
    print("Bien.")
elif esSuficiente:
    print("Suficiente.")
else:
    print("Un humilde suspenso maestro.")




