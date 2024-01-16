import java.util.Scanner;

class EjerBucles{
    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);

        int numero;

        // String letraString; 
        char letra;

        /* Solicita por consola un número natural. Vuelve a solicitar el número hasta que efectivamente sea un número natural. */
        do{
            System.out.println("Escribe un número que sea natural: ");
            numero = sc.nextInt();
        }while (numero<0 || numero>9);

        sc.nextLine();

        /*Solicita una letra. Asegurate de que es una letra. 
        Si el dato introducido no es una letra vuelve a pedirlo (a in lista)*/

        /*
        System.out.println("Introduce una letra: ");

        // letraString = sc.nextLine();
        // letra = letraString.charAt(0);
        
        letra = sc.nextLine().charAt(0);

        System.out.println(letra);

        if(letra >= 'a' && letra <= 'z'){
            System.out.println("Es una letra.");
        }
        */
        do{
            System.out.println("Introduce una letra: ");
            letra = sc.nextLine().charAt(0);
        }while (!(letra >= 'a' && letra <= 'z'));

        /* Solicita un número entre 0 y 100. Asegurate de que está comprendido entre 0 y 100. */
        do{
            System.out.println("Escribe un número comprendido entre 0 y 100: ");
            numero = sc.nextInt();
        }while (numero<0 || numero>100);

        /* Solicita por consola una hora, unos minutos y unos segundos. Vuelve a solicitar los datos 
        en caso de no estar comprendidos entre los valores correctos. */

    }
}
