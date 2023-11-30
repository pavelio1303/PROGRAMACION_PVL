# _INSTRUCCIONES_
# _Los mensajes "..." pueden personalizarse. Siéntete libre de añadir todo el lore que quieras.
# _¿Ves funciones dónde no las hay? Hazlas, seguramente mejoren tu código. 

# Ejercicios input/print
#0. Solicita por teclado un color. Guardalo para más tarde.
#1. Solicita por teclado una palabra e imprimela de nuevo. 
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
#10. Solicita por teclado dos numeros y la palabra 'suma' o 'resta'. Realiza la operación correspondiente.

# Ejercicios booleanos - condicionales.
#11. Solicita por teclado dos numeros. Escribe "El primer número es mayor" o "El primer número es menor" segun corresponda.
#12. Solicita por teclado dos numeros. Escribe "Has ganado" si el segundo número menos el primero da un valor positivo.
#13. Solicita por teclado un color. Si coincide con el color del ejercicio #0 escribe "¿Cómo sabías que era mi color favorito?"
#14. Solicita por teclado un día de la semana y un número. Si el número coincide con su día de la semana o el día introducido es viernes escribe "¡Has ganado!"
#15. Solicita por teclado tres núemros. Si los dos primeros son mayores que el tercero, escribe "Mayores"; si los dos son menores que el tercero, escribe "Menores"; para cualquier otro caso, escribe "¿Igua

def multiplicaCero(num1):
    return num1*0


#0
color = str(input("Dame un color: "))

#1
palabra = str(input("Dime una palabra: "))
print("Tu palabra es: " + palabra)

#2
palabra = str(input("Dime otra palabra: "))
print((palabra*5) + " jejeje me rayé")

#3
palabra = str(input("Dime otra palabra más: "))
print(((palabra + " ")*5) + ", ahora mejor, antes casi me atraganto...")

#4
palabra = str(input("Venga, otra palabrita: "))
numero = int(input("¿Cuantas veces te lo tengo que repetir? Dime: "))
print((palabra + " ")*numero)

#5
palabra = str(input("¿Que es lo que quieres llevarte de mi humilde negocio?: "))
numero = str(input("¿Cuantas unidades quiere?: "))
print("¡Estás de suerte! Justo tengo " + numero + " " + palabra + ".")

#6
print("Dime un número shavah, te vas a sorprender: ")
num1 = int(input())
print(multiplicaCero(num1))
