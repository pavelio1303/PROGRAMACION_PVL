import java.util.Scanner;

public class CondicionalesEjer {   // El nombre de la clase SIEMPRE va en mayúsculas !!!!!

    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);

        int numero = 0;

        System.out.print("Introduce un número: ");

        numero = sc.nextInt();
        
        if (numero < 5){
            System.out.println("El número es menor que 5.");
        } else if (numero == 5){
            System.out.println("El número es igual a 5.");
        } else {
            System.out.println("El número es mayor que 5.");
        }
    } 
}