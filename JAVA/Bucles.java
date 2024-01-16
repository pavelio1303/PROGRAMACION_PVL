import java.util.Scanner;

class Bucles {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int numero;

        String palabra = "";
        boolean salir = false;

        // For each -> for num in listaNum
        String[] listaAzules = {"Azul", "Añil","Indigo","Cobalto","Klein","Celeste"};
        for (String azul : listaAzules){
            System.out.println(azul);
        }

        // For -> No existe en python (este es el 'verdadero')
        for (int contador = 0 ; contador < 10 ; contador++){
            System.out.println(contador);
        }

        // i de Iterador
        for (int i = 0 ; i < 10 ; i++){
            System.out.print(i + " ");
        }

        System.out.println();

        // bucle teniendo en cuenta la longitud de la lista
         for (int i = 0 ; i < listaAzules.length ; i++){
            System.out.println(listaAzules[i]);
        }

        // Bucles For anidados
        for (int i = 0 ; i < 3 ; i++){
            for (int j = 0 ; j < 3 ; j++){
                System.out.print("" + i + j + " ");
            }
            System.out.println();
        }

        // Bucle While
/*
        salir = false;
        int contador = 5;
        while (!salir){
            System.out.println("Escribe salir: ");
            palabra = sc.nextLine();
            if (palabra.equals("salir")){
                salir = true;
            }
        }
*/
        // Refactorización del bucle while de arriba
        while (!palabra.equals("salir")){
            System.out.println("Escribe salir: ");
            palabra = sc.nextLine();
        }

        // Bucles for como while [!] ESTO ES UNA BASURA ES SOLO POR SABER
        System.out.println("Bucle for como while");
        // OJO -> Con los huequitos en el for...
        for( palabra = "" ; !palabra.equals("salir") ; ){ 
            System.out.println("Escribe salir: ");
            palabra = sc.nextLine();
        }

        // Bucles doWhile
        System.out.println("Bucles doWhile");
        do{
            System.out.println("Escribe salir: ");
            palabra = sc.nextLine();
        }while (!palabra.equals("salir"));

        do{
            System.out.println("Escribe un número entre el 1 y el 50: ");
            numero = sc.nextInt();
        }while (numero<1 || numero>50);
    }
}