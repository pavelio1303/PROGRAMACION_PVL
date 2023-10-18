def pedirDia():
	dia =  int(input("Introduce un día del mes: "))
	return dia
def pedirMes():
	mes = input("Introduce un mes: ")
	return mes
def pedirAnio():
	anio = int(input("Introduce un año: "))
	return anio

def introduceFecha(dia,mes,anio):
	respuesta = "¡Felicidades maquina!"
	if mes == "febrero" and dia > 28:
		respuesta = "No es valido"
	elif (mes == "septiembre" or mes == "noviembre" or mes == "abril" or mes == "junio") and dia > 30:
		respuesta = "No es valido"
	elif dia > 31:
		respuesta = "No es valido"
	elif anio > 2025:
		respuesta = "No es valido"
	elif anio < 1800:
		respuesta = "Celebrando que sigues con vida ¡Felicidades Tutankamon!"
	else:
		respuesta
	return respuesta

dia1 = pedirDia()
mes1 = pedirMes()
anio1 = pedirAnio()

compruebaFecha = introduceFecha(dia1, mes1, anio1)

print(compruebaFecha)

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