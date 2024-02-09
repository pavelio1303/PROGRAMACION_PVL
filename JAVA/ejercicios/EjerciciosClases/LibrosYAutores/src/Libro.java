import java.util.ArrayList;

public class Libro {

    // [!] ATRIBUTOS [!]
    // [!] Atributos de instancia [!]
    private String titulo;
    private String autor;
    private final int ISBN;
    private int numPaginas= 0;
    private int fechaPublicacion; // año.

    // [!] Atributos de clase [!]
    // Es propio de la clase y no de cada uno de los objetos que la componen.
    private static int numMaximoLetras = 15;

    // [!] CONSTRUCTORES [!]
    /**
     * Constructor con parámetros faltantes.
     * Crea un libro con un título y un ISBN especificados, el resto los especificamos nosotros.
     * @param titulo El título del libro.
     * @param ISBN El ISBN del libro.
     */
    public Libro(String titulo, int ISBN){
        this.setTitulo(titulo);
        this.autor = "desconocido";
        this.ISBN = ISBN;
        this.numPaginas = 0;
        this.fechaPublicacion = fechaPublicacion;
    }

    /**
     * Constructor con parámetros.
     * Crea un libro con un título y un ISBN especificados.
     * @param titulo El título del libro.
     * @param autor El autor del libro.
     * @param ISBN El ISBN del libro.
     * @param numPaginas El numero de páginas del libro.
     */
    public Libro(String titulo,String autor, int ISBN, int numPaginas, int fechaPublicacion){
        this.setTitulo(titulo);
        this.setAutor(autor);
        this.ISBN = ISBN;
        // Opción 1:
        this.numPaginas = 0;
        this.setNumPaginas(numPaginas); //if (numPaginas > 0) this.numPaginas = numPaginas;
        /*
        // Opción 2:
        this.numPaginas = numPaginas;
        if (numPaginas <= 0)  this.numPaginas = 0;
        // Opción 3:
        if (numPaginas <= 0) numPaginas = 0;
        this.numPaginas = numPaginas;
        */
        this.fechaPublicacion = fechaPublicacion;
    }

    // [!] GET [!]
    /**
     * Obtener el título actual del libro.
     * @return el título del libro.
     */
    public String getTitulo(){
        return this.titulo;
    }

    /**
     * Obtener el autor actual del libro.
     * @return el autor del libro.
     */
    public String getAutor(){
        return this.autor;
    }

    /**
     * Obtener el ISBN actual del libro.
     * @return el ISBN del libro.
     */
    public int getISBN(){
        return this.ISBN;
    }

    /**
     * Obtener el número de páginas actual del libro.
     * @return el número de páginas del libro.
     */
    public int getNumPaginas(){
        return this.numPaginas;
    }

    // [!] SET [!]
    /**
     * Establecer el título del libro.
     * @param titulo El nuevo título del libro.
     */
    public void setTitulo(String titulo){
        this.titulo = titulo;
       if (titulo.length() > this.numMaximoLetras) this.titulo = titulo.substring(0, this.numMaximoLetras);
    }

    /**
     * Nuestro SPLIT()
     */
    private static void nuestroSplit(String frase, char separador){
        ArrayList<String> listaPalabras = new ArrayList<String>();
        String palabra = "";
        for(int i = 0; i < frase.length() ; i++){
            if (frase.charAt(i) != separador){
                palabra += frase.charAt(i);
            } else {
                listaPalabras.add(palabra);
                palabra = "";
            }
        }
        if (!palabra.equals("")) listaPalabras.add(palabra);

        System.out.println(listaPalabras);
    }

    /**
     * Establecer el autor del libro.
     * @param autor El nuevo autor del libro.
     */
    public void setAutor(String autor){
        this.autor = autor;
        if (autor.length() > this.numMaximoLetras){
            this.autor = "";
            String[] autorPorPalabras = autor.split(" ");
            for (int i = 0 ; i < autorPorPalabras.length ; i++){
                this.autor += autorPorPalabras[i].charAt(0) + ".";
            }
        }
    }

    /**
     * Establecer el número de páginas del libro. 
     * @param numPaginas El nuevo número de páginas del libro.
     */
    public void setNumPaginas(int numPaginas){
        if (numPaginas >= 0 ) this.numPaginas = numPaginas;
    }
    // Asumo que el dato es correcto.
    public void setFechaPublicacion(int fechaPublicacion){
        this.fechaPublicacion = fechaPublicacion;
    }

    // [!] TOSTRING [!]
    /**
     * Devolver la representación en formato de cadena (String) del objeto libro.
     * @return Una cadena que representa el objeto libro.
     */
    public String toString(){
        return "El libro " + this.titulo + ", de " + this.autor + ", con ISBN: " + this.ISBN + ". Tiene " + this.numPaginas + " páginas.";
    }

    // [!] MAIN [!]
    public static void main(String[] args){
        // Prueba los dos constructores.
        Libro libro1 = new Libro("Las tempestálidas","Georgi Gospodinov", 841761,2020,400);
        Libro libro2 = new Libro("Como matar a tu familia","Bella Mackie",849129,2021,400);
        Libro libro3 = new Libro("Oso","Marian Engel",841597,1976,168);
 
        System.out.println("libro1 -> " + libro1);
        System.out.println("libro2 -> " + libro2);
        System.out.println("libro3 -> " + libro3);
        // Prueba setNumPaginas con un valor válido.
        libro1.setNumPaginas(400);
        System.out.println("libro1 -> " + libro1);
        // Prueba setNumPaginas con un valor inválido.
        libro1.setNumPaginas(-200);
        System.out.println("libro1 -> " + libro1);
        /*// Prueba setAutor con un nombre largo.
        libro1.setAutor("Gabriel García Marquez");
        System.out.println("libro1 -> " + libro1);*/

        nuestroSplit("la casa verde",' ');
    }
}

/**
 * El número de páginas introducidas no puede ser menor que 0. 
 * Si al crear el objeto, se introduce un número de páginas negativa, se cambia a 0.
 * Si al cambiar el valor del número de páginas es negativa, se deja el que estaba.
 * 
 * Tanto el título como el autor no pueden tener más de 20 carácteres.
 * En caso de que tengan más, el título se trunca y en el autor se ponen las iniciales.
 */