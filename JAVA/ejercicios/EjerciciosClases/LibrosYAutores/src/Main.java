import java.util.ArrayList;

public class Main{
    public static void main(String[] args){
        Libro libro1 = new Libro("Las tempestálidas","Georgi Gospodinov", 841761,2020,400);
        Libro libro2 = new Libro("Como matar a tu familia","Bella Mackie",849129,2021,400);
        Libro libro3 = new Libro("Oso","Marian Engel",841597,1976,168);
        ArrayList<Libro> librosAutor1 = new ArrayList<Libro>();
        librosAutor1.add(libro1);
        librosAutor1.add(libro2);
        librosAutor1.add(libro3);

        Libro libro4 = new Libro("El sanatorio de las almas perdidas","Elena Montufo", 841761,2020,400);
        Libro libro5 = new Libro("Orgullo y Prejuicio","Jane Austen",546852,1813,300);
        Libro libro6 = new Libro("Gideon, la novena","Tansym Muir",841597,1976,168);
        ArrayList<Libro> librosAutor2 = new ArrayList<Libro>();
        librosAutor2.add(libro4);
        librosAutor2.add(libro5);
        librosAutor2.add(libro6);

        Libro libro7 = new Libro("Crimen y castigo","Dostoyevski", 456836,1800,800);
        Libro libro8 = new Libro("La cantina de media noche","Yaro Abe",566821,2020,296);
        Libro libro9 = new Libro("El proceso","Kafka",365985,1800,250);
        ArrayList<Libro> librosAutor3 = new ArrayList<Libro>();
        librosAutor3.add(libro7);
        librosAutor3.add(libro8);
        librosAutor3.add(libro9);
        
        Autor autor1 = new Autor("Georgi Gospodinov","bulgaro",1970,0,librosAutor1);
        Autor autor2 = new Autor("Jane Austen","inglesa",1790,1850,librosAutor2);
        Autor autor3 = new Autor("Kafka","alemana",1884,1924,librosAutor3);
    
        System.out.println(autor1);
        System.out.println(autor2);
        System.out.println(autor3);

        ArrayList<Autor> listaAutores = new ArrayList<Autor>();
        listaAutores.add(autor1);
        listaAutores.add(autor2);
        listaAutores.add(autor3);

        // Muestra el nombre de los autores que no están muertos.
        // La fecha de muerte es 0;

        System.out.println("Muestra el nombre de los autores que no están muertos:");
        for(Autor autor : listaAutores){
            if(autor.getAnioMuerte() == 0) System.out.println(autor.getNombre());
        }

        System.out.println("Muestra el nombre de los libros que tengan más de 200 páginas:");
        for(Autor autor : listaAutores){
            for(Libro libro : autor.getLibrosEscritos());
                if(libro.getNumPaginas() == 0) System.out.println(libro.getTitulo());
        }

        System.out.println("Muestra el nombre de los libros que fueron escritos...");
        for(Autor autor : listaAutores){
            for(Libro libro : autor.getLibrosEscritos());
                if (libro.getFechaPublicacion() - autor.getAnioNacimiento() < 30)
                    System.out.println(libro.getTitulo());
        }
    }
}