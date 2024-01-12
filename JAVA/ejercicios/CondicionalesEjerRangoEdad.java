/*
    Comprendido entre
 */

import java.util.Scanner;

public class CondicionalesEjerRangoEdad {   // El nombre de la clase SIEMPRE va en mayúsculas !!!!!

    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);

        int numero;
        int mini = 1, maxi = 100;

        if (args.length < 3){
            System.out.println("No has introduido el número de argumentos necesarios.");
            System.out.println("Necesitamos 3 enteros: El valor minimo, el máximo y el que queremos comprobar si está comprendido entre ellos.");
            System.out.println("Dame un número comprendido entre 1 y 100 y compruebo si está en el rango.");
            numero = sc.nextInt();
        } else {
            mini = Integer.parseInt(args[0]);
            maxi = Integer.parseInt(args[1]);
            numero = Integer.parseInt(args[2]);
        }

        if (numero >= mini && numero <= maxi){
            System.out.println("El número " + numero + " está comprendido entre " + mini + " y " + maxi);
        } else {
            System.out.println("El número " + numero + " no está comprendido entre " + mini + " y " + maxi);
        }
    } 
}