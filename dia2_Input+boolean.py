# El input recoge el dato y lo guarda en nombre.
nombre = input("Introduce tu nombre: ")
print ("Hola " + nombre)

# Existen dos tipos de =s en programación:

#   =   -> Asigna lo que hay a la izquierda a lo que hay a la derecha.
#       Ej. numero = 5

#   ==  -> Es un igual LÓGICO. ¡Compara lo que tiene a la izq y der!
#       Devuelve true, si son iguales; o false, si son distintos.


#1. Entrada. Numero. Salida: True si es mayor de edad.

# Input siempre guarda el valor introducido como string(str),
# si queremos que sea un entero hay que transformarlo a un entero (int)
# El: int(input(...))

numero = int(input("Introduce tu edad: "))
# Para saber el tipo -> print(type(numero)) 

print ("¿Es mayor de edad? ")
print (numero >= 18)

#EJERCICIOS PRÁCTICOS
print ("Ejercicios prácticos:")

#Ejer. 3
print("Ejer. 3. ¿Es positivo o negativo?")

numero2 = int(input())
print (numero2 >= 0)

#Ejer. 5
print("Ejer. 5. ¿Aprobado o suspenso?")

numero3 = int(input())
print (numero3 >= 5 and numero3 <= 10)

#Ejer. 2
print("Ejer. 2. ¿Es fin de semana?")

diaSemana = input()
print (diaSemana == "Sábado" or diaSemana == "Domingo")


#Ejer. 4
print("Ejer. 4. ¿Es una vocal?")

vocal = input()
print (vocal == "a" or vocal == "e" or vocal == "i" or vocal == "o" or vocal == "u")




