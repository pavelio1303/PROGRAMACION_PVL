import java.util.ArrayList;

public class Arrays{

    // Sobrecarga de funciones: Se pueden tener varias funciones con el mismo nombre y FUNCIONALIDAD siempre 
    // y cuando los atributos de entrada sean distintos. Para poder cambiar los tipos de datos pero mantener la funcionalidad.

    public static void imprimirArray (String[] lista){
        for (String elemento : lista){
            System.out.println(elemento);
        }
    }

    public static void imprimirArray (int[] lista){
        for (int elemento : lista){
            System.out.println(elemento);
        }
    }

    public static void imprimirArray (char[] lista){
        for (char elemento : lista){
            System.out.println(elemento);
        }
    }


    public static void main (String[] args){

        // [!] ARRAYs ESTÁTICAS (LISTAS aunque realmente estamos hablando de vectores). [!]
        // Creación de arrays estáticas:
        String[] colores = {"Azul","Amarillo","Rojo","Verde"};
        System.out.println(colores);    // Para mostrarlas por pantalla saliendo los datos y no la
                                        // dirección, tendríamos que hacer un bucle.
        int[] numeros;
        numeros = new int[10];      // Array vacio con 10 huecos.
        
        char[] letras = new char[10];

        String color;

        imprimirArray(colores);

        // [!] ARRAYs DINÁMICAS (LISTAS) [!] 
        // Creación de arrays dinámicas

        ArrayList<String> arrayColores = new ArrayList<String>();

        // Añadir elementos:
        arrayColores.add("Verde");
        arrayColores.add("Rojo");
        arrayColores.add("Azul");
        arrayColores.add("Amarillo");
        arrayColores.add("Morado");
        arrayColores.add("Blanco");
        arrayColores.add("Negro");

        System.out.println("Mostramos la lista e colores: ");
        System.out.println(arrayColores);

        // Mostrar o recoger un valor del ArrayList:
        color = arrayColores.get(0);
        System.out.println("El primer color de la lista es: " + color);

        // Cambiar un valor del ArrayList:
        arrayColores.set(1, "A4m4r1ll0");

        System.out.println("Mostramos la lista e colores modificando la segunda posición por '4m4r1ll0': ");
        System.out.println(arrayColores);

        // Eliminar elementos:
        arrayColores.remove(1);
        System.out.println("Mostramos la lista e colores eliminando el segundo elemento: ");
        System.out.println(arrayColores);
    }
}