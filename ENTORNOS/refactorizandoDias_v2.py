"""
def pedirDia():
	dia =  int(input("Introduce un día del mes: "))
	return dia
def pedirMes():
	mes = input("Introduce un mes: ")
	return mes
def pedirAnio():
	anio = int(input("Introduce un año: "))
	return anio
"""
def perdirDato(dato):
	return int(input(f"Introduce un {dato}: "))		# Todo lo de arriba se puede resumir aquí.

def introduceFecha(dia,mes,anio):
	respuesta = True
	if anio < 2025:
		if mes == "febrero" and dia > 28:
			respuesta = False
		elif (mes == "septiembre" or mes == "noviembre" or mes == "abril" or mes == "junio") and dia > 30:
			respuesta = False
		elif dia > 31:
			respuesta = False
	else:
		respuesta = False
	return respuesta

def mesNumericoATexto(numMes):
	listaMeses = ["enero","febrero","marzo","abril","mayo","junio","julio","agosto","septiembre","octubre","noviembre","diciembre"]
	return listaMeses[numMes-1]

#--------------------------------------------------------------------------------------------------------------------------------------------------------------

dia = perdirDato("día del mes")
anio = perdirDato("año")
mes = mesNumericoATexto(perdirDato("mes")) 		# mesNum = perdirDato("mes")		---> Podemos resumir estas dos variables llamando a funciones en una.
												# mes = mesNumericoATexto(mesNum)
#print(f"El mes {mes} es {mes}.")

print(introduceFecha(dia, mes, anio))

salir = False
while not salir:
	dia = perdirDato("día del mes")
	anio = perdirDato("año")
	mes = mesNumericoATexto(perdirDato("mes")) 


"""
d1 = int(input("Introduce un día del mes: "))
m1 = int(input("Introduce un mes: "))
a1 = int(input("Introduce un año: "))

if m1 == "febrero" and d1 > 28:
	print("No es valido")
elif (m1 == "septiembre" or m1 == "noviembre" or m1 == "abril" or m1 == "junio")and d1 > 30:
	print("No es valido")
elif d1 > 31:
	print("No es valido")

if a1 > 2025:
	print("No es valido")
	
d2 = int(input("Introduce un día del mes: "))
m2 = int(input("Introduce un mes: "))
a2 = int(input("Introduce un año: "))

if m2 == "febrero" and d2 > 28:
	print("No es valido")
elif (m2 == "septiembre" or m2 == "noviembre" or m2 == "abril" or m2 == "junio")and d2 > 30:
	print("No es valido")
elif d2 > 31:
	print("No es valido")
	
if a2 > 2025:
	print("No es valido")
	
d3 = int(input("Introduce un día del mes: "))
m3 = int(input("Introduce un mes: "))
a3 = int(input("Introduce un año: "))

if m3 == "febrero" and d3 > 28:
	print("No es valido")
elif (m3 == "septiembre" or m3 == "noviembre" or m3 == "abril" or m3 == "junio")and d3 > 30:
	print("No es valido")
elif d3 > 31:
	print("No es valido")
	
if a3 > 2025:
	print("No es valido")
	
d4 = int(input("Introduce un día del mes: "))
m4 = int(input("Introduce un mes: "))
a4 = int(input("Introduce un año: "))

if m4 == "febrero" and d4 > 28:
	print("No es valido")
elif (m4 == "septiembre" or m4 == "noviembre" or m4 == "abril" or m4 == "junio")and d4 > 30:
	print("No es valido")
elif d4 > 31:
	print("No es valido")
	
if a4 > 2025:
	print("No es valido")

"""