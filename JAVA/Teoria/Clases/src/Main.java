import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void imprimirArray (ArrayList<Circulo> lista){
        for (Circulo elemento : lista){
            System.out.println(elemento);
        }
    }

    public static void main(String[] args) throws Exception {
        // Solicita 3 círculos y los mete en un arrayList de Circulos y muestre por pantalla los círculos introducidos

        ArrayList<Circulo> listaCirculos = new ArrayList<Circulo>();

        Scanner sc = new Scanner(System.in);
        Circulo circulo;

        int radioCirc = 0;
        String colorCirc = ""; 

        for (int i = 0 ; i < 3 ; i++){
            System.out.println("El radio del circulo " + (i+1) + " :");
            radioCirc = Integer.parseInt(sc.nextLine());

            System.out.println("El color del circulo " + (i+1) + " :");
            colorCirc = sc.nextLine();

            circulo = new Circulo(radioCirc,colorCirc);

            listaCirculos.add(circulo);
        }

        imprimirArray(listaCirculos);
    }
}
