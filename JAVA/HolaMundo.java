// Print de hola mundo

// Primero hay que compilar, para hacerlo escribimos en la consola dentro de la carpeta del archivo 'javac' y el nombre del archivo a compilar.

// La clase tiene que llamarse igual que el archivo, normalmente se crea solo una

class HolaMundo {   // El nombre de la clase SIEMPRE va en mayúsculas !!!!!

    public static void main(String[] args){    // Esto es crear el main, hace falta siempre parece ser. Public es para poder llamar al archivo haciendolo público.
        // Solicitar argumentos en el momento de ejecutar el código.
        if (args.length == 1){
            System.out.print("Hola " + args[0] + "!");
        }
        else{
            System.out.print("Hola mundo!");    // Función para hacer print.
        }

        System.out.print("Print normal.");
        System.out.println("Print ln.");    // println es una print con salto de linea al final.
        System.out.print("Print normal de nuevo.");
        System.out.println("\nUsando\nSaltos\nde\nlinea.");

        // Hacer cálculos en el print:
        System.out.println("3+3: ");
        System.out.println(3+3);
        System.out.println("3+3: " + (3+3));
    }
}