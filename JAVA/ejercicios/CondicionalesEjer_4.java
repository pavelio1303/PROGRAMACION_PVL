/*
    ### 4.- Varios argumentos introducidos al ejecutar.
    A la hora de ejecutar el código, añade dos números que pasarán como argumento del main.
    Gestiona que realmente introduce dos argumentos, ni más ni menos.
    Hay que imprimir por pantalla el número que sea mayor.
    Gestiona para que, si el número de argumentos es incorrectos, los solicite desde teclado. 
*/

import java.util.Scanner;

public class CondicionalesEjer_4 {   // El nombre de la clase SIEMPRE va en mayúsculas !!!!!

    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);

        int numero1,numero2;

        if (args.length < 2){
            System.out.println("Introduce dos números: ");

            numero1 = sc.nextInt();
            numero2 = sc.nextInt();
        } else {
            numero1 = Integer.parseInt(args[0]);
            numero2 = Integer.parseInt(args[1]);
        }

        if (numero1 == numero2){
            System.out.println("Tienen el mismo valor.");
        } else if (numero1 > numero2){
            System.out.println(numero1 + " es el número de mayor valor entre ambos.");
        } else {
            System.out.println(numero2 + " es el número de mayor valor entre ambos.");
        }
    } 
}