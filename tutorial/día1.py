#jejeje
print ("Hola Mundo")
print("Hi! My name is Paul")
print("Pablo")

#Nuestra primera variable
x = 5
print(5)       #Imprime 5
print(5+5)     #Imprime 10
print(x)       #Imprime 5 porque más arriba definimos que x = 5
print(x+10)    #Imprime 15 dado que usa x = 5 y le suma 10

#Creamos una variable con texto -> string
nombre = "Pablo"
numero = 13
print(nombre)
print("Pablo"+"13")
print(nombre+str(numero))       #Usamos str para convertir valores numéricos a texto (String)
print("Cucu"*numero)            #Si multiplicamos un string por un número, multiplica dicho elemento aunque sea texto(solo en PYTHON)

#Operaciones matemáticas
print("\nHacemos operaciones matemáticas")  # (\) es anular lo que va después y combinada con ciertas cosas cambia su función.
                                            # (\n) es un salto de linea.
                                            # (\t) es tabulación.
                                            # (\") marca que simplemente es una comilla y sale en pantalla, no para abrir y cerrar string.
                                            # (\\) se usa para escribir la \ en pantalla simplemente.

num1 = 9
num2 = 13
 
suma = num1+num2
resta = num1-num2
multp = num1*num2
div = num1/num2
modulo = num1%num2

print(num1+num2)
print("suma=" + str(suma))
print("suma=" + str(suma) + " | resta=" + str(resta))

print("suma =" + str(suma) + "| resta =" + str (resta) + "| multiplicación =" + str (multp) + "| división =" + str (div))
print ( "Modulo =" + str(modulo))
