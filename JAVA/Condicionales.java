// Print de hola mundo

// Primero hay que compilar, para hacerlo escribimos en la consola dentro de la carpeta del archivo 'javac' y el nombre del archivo a compilar.

// La clase tiene que llamarse igual que el archivo, normalmente se crea solo una

public class Condicionales {   // El nombre de la clase SIEMPRE va en mayúsculas !!!!!

    public static void main(String[] args){
        int numero = 13;

        /* 
        if numero < 5:
            print("El número es menor que 5")
        elif numero == 5:
            print("El número es igual a 5.")
        elif numero > 5:
            print("El número es mayor que 5.")
        */
        if (numero < 5){
            System.out.println("El número es menor que 5.");
        } else if (numero == 5){
            System.out.println("El número es igual a 5.");
        } else {
            System.out.println("El número es mayor que 5.");
        }
    } 
}