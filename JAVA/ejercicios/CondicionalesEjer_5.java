/*
### 5.- Calculadora en Switch.
Solicita por teclado dos números y la palabra operación (suma, resta, multiplicación, división). El programa debe realizar la operación correspondiente.
Modifícalo para que pueda funcionar tanto los datos introducidos por teclado como introduciendole argumentos al main.
*/

import java.util.Scanner;

public class CondicionalesEjer_5 {   // El nombre de la clase SIEMPRE va en mayúsculas !!!!!

    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);

        String consulta;

        if (args.length < 1){
            System.out.print("Introduce 'dia' o 'mes': ");

            consulta = sc.nextLine();

        } else {
            consulta = args[0];
        }

        if (consulta.equals("dia")){
            System.out.println("Estamos a martes.");
        } else if (consulta.equals("mes")){
            System.out.println("Estamos en enero.");
        } else {
            System.out.println("Consulta no válida");
        }
    } 
}