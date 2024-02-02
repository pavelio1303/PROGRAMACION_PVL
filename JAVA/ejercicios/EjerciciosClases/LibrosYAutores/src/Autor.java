import java.util.ArrayList;

public class Autor{
    private String nombre;
    private String nacionalidad; 
    private int anioNacimiento;
    private int anioMuerte;
    // No hace falta la clase Libro porque está en el mismo paquete. LIBROSYAUTOR
    private ArrayList<Libro> librosEscritos;

    public Autor(String nombre, ArrayList<Libro> librosEscritos){
        this.nombre = nombre;
        this.nacionalidad = "";
        this.anioNacimiento = 0;
        this.anioMuerte = 0;
        this.librosEscritos = (ArrayList)librosEscritos.clone();
    }

    public Autor(String nombre, String nacionalidad, int anioNacimiento, int anioMuerte, ArrayList<Libro> librosEscritos){
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.anioNacimiento = anioNacimiento;
        this.anioMuerte = anioMuerte;
        this.librosEscritos = (ArrayList)librosEscritos.clone();
    }

    public Autor(Autor a){
        this.nombre = a.nombre;
        this.nacionalidad = a.nacionalidad;
        this.anioNacimiento = a.anioNacimiento;
        this.anioMuerte = a.anioMuerte;
        this.librosEscritos = (ArrayList)a.librosEscritos.clone();
    }

    public Autor(String nombre, String nacionalidad, int anioNacimiento, int anioMuerte, Libro libro){
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.anioNacimiento = anioNacimiento;
        this.anioMuerte = anioMuerte;
        this.librosEscritos.add(libro);
    }

//=================================================================================

    public String getNombre(){
        return this.nombre;
    }

    public String getNacionalidad(){
        return this.nacionalidad;
    }

    public int getAnioNacimiento(){
        return this.anioNacimiento;
    }

    public int getAnioMuerte(){
        return this.anioMuerte;
    }

    public ArrayList<Libro> getLibrosEscritos(){
        return this.librosEscritos;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setNacionalidad(String nacionalidad){
        this.nacionalidad = nacionalidad;
    }

    public void setAnioNacimiento(int anioNacimiento){
        this.anioNacimiento = anioNacimiento;
    }

    public void setAnioMuerte(int anioMuerte){
        this.anioMuerte = anioMuerte;
    }

    // Falta set de libros escritos...

    public String toString(){
        return  "El autor " + this.nacionalidad + " " + this.nombre + 
                ", nacido en " + this.anioNacimiento + 
                " ha escrito los siguientes libros: " + this.librosEscritos;
    }

//=================================================================================
    public static void main (String[] args){
       
    }
}