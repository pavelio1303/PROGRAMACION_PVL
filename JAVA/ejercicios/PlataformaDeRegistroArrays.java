import java.util.Scanner;
import java.util.ArrayList;

public class PlataformaDeRegistroArrays{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        ArrayList<String> arrayIntegrantes = new ArrayList<String>();

        String nombreEquipo = "";
        // String nombreIntegrantes = "";
        String pedirNombres = "";
        String nombreJefe = "";

        int numIntegrantes = 0;
        int posicionJefe = 0;

        nombreEquipo = args[0];

        numIntegrantes = Integer.parseInt(args[1]);

        for (int i = 0 ; i < numIntegrantes ; i++){

                System.out.println("El nombre del integrante " + (i+1) + " es: ");
                pedirNombres = sc.nextLine();

                arrayIntegrantes.add(pedirNombres);
            }

        posicionJefe = (int)Math.floor(Math.random()*numIntegrantes);
        nombreJefe = arrayIntegrantes.get(posicionJefe);

        System.out.println("El equipo " + nombreEquipo + " está compuesto por " + numIntegrantes + " integrantes, a saber: " + arrayIntegrantes + ", siendo el lider: " + nombreJefe);
    }
}