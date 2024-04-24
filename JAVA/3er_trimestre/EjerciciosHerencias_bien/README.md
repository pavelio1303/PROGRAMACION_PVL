### AMPLIAMOS LA CLASE ESTRUCTURA DE MASCOTA -> (PERRO,GATO,PAJARO)

- Creamos una interfaz, llamada FuncionesBasicas que declara los métodos comer(), evacuar(), dormir() y jugar(). 
- Le añadimos a la interfaz FuncionesBasicas los metodos nacer(), morir() y reproducirse().
- Creamos la clase Humano que implenta la interfaz FuncionesBasicas.
- La clase Mascota debe implementar tambien la interfaz FuncionesBasicas.
- Crea un main en el que crees objetos de las clases Perro, Gato, Pájaro y Humano.
- Muestra los nombres de todos los objetos creados y muestra alguna de sus características comunes y propias.

### MÁQUINA DE BOLAS

- Crea una clase Juguete que tenga los siguientes atributos:
  - nombre : String
  - precio : double -> Precio de fábrica del juguete que va en la bola.
- La clase Juguete tiene los siguientes métodos:
  - Constructores -> Los que se crean convenientes.
  - Gets/Sets.
  - toString() : String
  - generarPrecioJugete(precioMaximo : double) : double -> Genera un precio aleatorio para el juguete que variará entre 20 centimos y 2€.
    
- Crea una clase MaquinaDeBolas que tenga los siguientes atributos:
  - precioDeLaBola : double -> Precio de la bola. Puede ser múltiplo de monedas de 50 centimos.
  - juguete : Juguete [5..*] -> Conjunto de juguetes que tiene la máquina de bolas
- La clase MáquinaDeBolas tendrá los siguientes métodos:
  - Constructores -> Los que se crean convenientes.
  - Gets/Sets.
  - toString() : String
  - obtenerJugueteAleatorio() : Juguete -> Devuelve un juguete aleatorio de la lista de juguetes.
  - obtenerBeneficio(j : Jugete) : double -> Devuelve el beneficio obtenido con esa bola teniendo en cuenta el precio de la bola y el precio del juguete.
 
- Crea la clase MaquinaDePinball que herede de MaquinaDeBolas que tenga los siguentes atributos:
  - puntos : int -> Con cada partida se obtendrán una serie de puntos. Inicialmente tiene 0 puntos.
- La clase MaquinaDePinball tendrá los siguentes métodos:
  - Constructores -> Los que se crean convenientes.
  - Gets/Sets.
  - toString() : String
  - jugar() : int -> Muestra por pantalla en mensaje "--- Jugando al Pinball ---", es opcional dibujar una máquina de pinball :) y devuelve una puntuación aleatoria entre 20 y el precio en céntimos de la bola. Se corresponde a los puntos. 
  - obtenerJugueteAleatorio() : Juguete -> Devuelve un juguete aleatorio de la lista de juguetes que no debe superar en precio (en céntimos) de los puntos que se han obtenido.
 
### BOMBILLA

Crea las clases Bombilla y BombillaRGB.

- Sobre la clase Bombilla:
    - Bombilla tiene el atributo luminosidad, de tipo entero.
    - Bombilla es una clase abstracta con el método abstracto iluminar(). 
    - La luminosidad de la bombilla puede variar de entre 800 y 1100 lúmenes.
- Sobre la clase BombillaRGB:
    - BombillaRGN tiene tres atributos R, G y B de tipo entero.
    - La clase BombillaRGB hereda de Bombilla. 
    - Los atributos R, G y B de la bombillaRGB puede tomar cualquier valor entre 0 y 255. 
    - El método iluminar() devuelve un String en el que aparece un mensaje sobre si la bombilla es apropiada para estudiar (1000 lúmenes o más y color blanco) o no (menos de 1000 lúmenes o cualquier otro color).
    - Además de los constructores básicos tiene un constructor al que le llega un String con el valor en HEX y debe pasarlo a RGB. Crea los métodos auxiliares que consideres oportunos.
- Todas las clases deben tener toString que muestra el valor de sus atributos: 
    - En la clase Bombilla: _Es una bombilla de {luminosidad} lúmenes_
    - En la clase BombillaRGB: _Es una bombilla de {luminosidad} lúmenes y color {color}_

EN EL MAIN: Crea un Main que te permita probar los métodos realizados.

### ALARMA

Crea la clase Alarma, cuyos objetos activen un objeto de tipo Timbre cuando el valor medido por un Sensor supere un umbral preestablecido.

### AMPLIAMOS LA CLASE ESTRUCTURA DE MASCOTA -> (PERRO,GATO,PAJARO)

- Creamos una interfaz, llamada FuncionesBasicas que declara los métodos comer(), evacuar(), dormir() y jugar(). 
- Le añadimos a la interfaz FuncionesBasicas los metodos nacer(), morir() y reproducirse().
- Creamos la clase Humano que implenta la interfaz FuncionesBasicas.
- La clase Mascota debe implementar tambien la interfaz FuncionesBasicas.
- Crea un main en el que crees objetos de las clases Perro, Gato, Pájaro y Humano.
- Muestra los nombres de todos los objetos creados y muestra alguna de sus características comunes y propias.

### MÁQUINA DE BOLAS

- Crea una clase Juguete que tenga los siguientes atributos:
  - nombre : String
  - precio : double -> Precio de fábrica del juguete que va en la bola.
- La clase Juguete tiene los siguientes métodos:
  - Constructores -> Los que se crean convenientes.
  - Gets/Sets.
  - toString() : String
  - generarPrecioJugete(precioMaximo : double) : double -> Genera un precio aleatorio para el juguete que variará entre 20 centimos y 2€.
    
- Crea una clase MaquinaDeBolas que tenga los siguientes atributos:
  - precioDeLaBola : double -> Precio de la bola. Puede ser múltiplo de monedas de 50 centimos.
  - juguete : Juguete [5..*] -> Conjunto de juguetes que tiene la máquina de bolas
- La clase MáquinaDeBolas tendrá los siguientes métodos:
  - Constructores -> Los que se crean convenientes.
  - Gets/Sets.
  - toString() : String
  - obtenerJugueteAleatorio() : Juguete -> Devuelve un juguete aleatorio de la lista de juguetes.
  - obtenerBeneficio(j : Jugete) : double -> Devuelve el beneficio obtenido con esa bola teniendo en cuenta el precio de la bola y el precio del juguete.
 
- Crea la clase MaquinaDePinball que herede de MaquinaDeBolas que tenga los siguentes atributos:
  - puntos : int -> Con cada partida se obtendrán una serie de puntos. Inicialmente tiene 0 puntos.
- La clase MaquinaDePinball tendrá los siguentes métodos:
  - Constructores -> Los que se crean convenientes.
  - Gets/Sets.
  - toString() : String
  - jugar() : int -> Muestra por pantalla en mensaje "--- Jugando al Pinball ---", es opcional dibujar una máquina de pinball :) y devuelve una puntuación aleatoria entre 20 y el precio en céntimos de la bola. Se corresponde a los puntos. 
  - obtenerJugueteAleatorio() : Juguete -> Devuelve un juguete aleatorio de la lista de juguetes que no debe superar en precio (en céntimos) de los puntos que se han obtenido.
 
### BOMBILLA

Crea las clases Bombilla y BombillaRGB.

- Sobre la clase Bombilla:
    - Bombilla tiene el atributo luminosidad, de tipo entero.
    - Bombilla es una clase abstracta con el método abstracto iluminar(). 
    - La luminosidad de la bombilla puede variar de entre 800 y 1100 lúmenes.
- Sobre la clase BombillaRGB:
    - BombillaRGN tiene tres atributos R, G y B de tipo entero.
    - La clase BombillaRGB hereda de Bombilla. 
    - Los atributos R, G y B de la bombillaRGB puede tomar cualquier valor entre 0 y 255. 
    - El método iluminar() devuelve un String en el que aparece un mensaje sobre si la bombilla es apropiada para estudiar (1000 lúmenes o más y color blanco) o no (menos de 1000 lúmenes o cualquier otro color).
    - Además de los constructores básicos tiene un constructor al que le llega un String con el valor en HEX y debe pasarlo a RGB. Crea los métodos auxiliares que consideres oportunos.
- Todas las clases deben tener toString que muestra el valor de sus atributos: 
    - En la clase Bombilla: _Es una bombilla de {luminosidad} lúmenes_
    - En la clase BombillaRGB: _Es una bombilla de {luminosidad} lúmenes y color {color}_

EN EL MAIN: Crea un Main que te permita probar los métodos realizados.

### ALARMA

Crea la clase Alarma, cuyos objetos activen un objeto de tipo Timbre cuando el valor medido por un Sensor supere un umbral preestablecido.

![Clase UML (6)](https://github.com/STEMgranada/PROGRAMACION/assets/150047104/0fb0c9f5-79f9-4b85-b410-8690610ac82b)

Implemante el código necesario para el funcionamiento de la alarma: La alarma comprueba si debe activar o desactivar el timbre cuando se invoca el método comprobar().

Crea una subclase de Alarma llamada AlarmaLuminosa que, además de activar el timbre, encienda una luz. La luz debe está representada por un objeto de tipo Luz.
Implemante el código necesario para el funcionamiento de la alarma: La alarma comprueba si debe activar o desactivar el timbre cuando se invoca el método comprobar().

Crea una subclase de Alarma llamada AlarmaLuminosa que, además de activar el timbre, encienda una luz. La luz debe está representada por un objeto de tipo Luz.

Implemante el código necesario para el funcionamiento de la alarma: La alarma comprueba si debe activar o desactivar el timbre cuando se invoca el método comprobar().

Crea una subclase de Alarma llamada AlarmaLuminosa que, además de activar el timbre, encienda una luz. La luz debe está representada por un objeto de tipo Luz.
