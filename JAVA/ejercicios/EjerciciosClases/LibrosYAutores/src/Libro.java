public class Libro {

    // [!] ATRIBUTOS [!]
    private String titulo;
    private String autor;
    private final int ISBN;
    private int numPaginas;

    // [!] CONSTRUCTORES [!]
    /**
     * Constructor con parámetros faltantes.
     * Crea un libro con un título y un ISBN especificados, el resto los especificamos nosotros.
     * @param titulo El título del libro.
     * @param ISBN El ISBN del libro.
     */
    public Libro(String titulo, int ISBN){
        this.titulo = titulo;
        this.autor = "desconocido";
        this.ISBN = ISBN;
        this.numPaginas = 0;
    }

    /**
     * Constructor con parámetros.
     * Crea un libro con un título y un ISBN especificados.
     * @param titulo El título del libro.
     * @param autor El autor del libro.
     * @param ISBN El ISBN del libro.
     * @param numPaginas El numero de páginas del libro.
     */
    public Libro(String titulo,String autor, int ISBN, int numPaginas){
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
        this.numPaginas = numPaginas;
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
    }

    /**
     * Establecer el autor del libro.
     * @param autor El nuevo autor del libro.
     */
    public void setAutor(String autor){
        this.autor = autor;
    }

    /**
     * Establecer el número de páginas del libro.
     * @param numPaginas El nuevo número de páginas del libro.
     */
    public void setNumPaginas(int titulo){
        this.numPaginas = numPaginas;
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
        Libro libro1 = new Libro("Las tempestalidad",123456789);
        Libro libro2 = new Libro("Juego de Tronos", "R. R. Martin", 987654321, 568);

        System.out.println("El libro 1 es: " + libro1);
        System.out.println("El libro 2 es: " + libro2);
    }
}
