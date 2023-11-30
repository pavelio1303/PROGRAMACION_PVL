# Organizacion de código:

#   Funciones.
def mediaTresNumeros(num1, num2, num3):     # 'def' sirve para definir los valores de una función.
    resultado = (num1+num2+num3)/3          
    return resultado                          # Las funciones son mundos separados del código principal.
#-----------------------------------------------------------------------------------------------------------------------

#   Código principal - MAIN.
print("Probando función.")

media = mediaTresNumeros(5,5,5)            # Guardamos la funcion en una variable 'media' (da igual el nombre) para llamarla con un print.
print(media)





