import java.util.Scanner;

public class RepasoForyRandom{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int numero;
        int numAleatorio;

        System.out.println("Cuantos números aleatorios quieres generar: ");
        numero = sc.nextInt();

        for (int i = 0 ; i < numero ; i++){
            // Generamos un aleatorio entre 1 y 5 incluidos
            numAleatorio = (int)Math.floor((Math.random()*5)+1); // Math.random genera un número entre 0 y 1 y luego multiplicas por el limite del rango que quieres.

            System.out.println("Numero aleatorio " + (i+1) + ": " + numAleatorio);
        }
    }
}
