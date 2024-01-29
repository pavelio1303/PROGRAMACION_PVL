import java.util.Scanner;

public class Circulo {

    // Atributos del circulo (de la clase). El 99% de las veces (por no decir siempre) los atributos son privados.
    private int radio = 5;
    private String color;

    // Metodos de la clase:

    // Constructor() -> Se definen los parámetros por defecto. (Siempre se llama al constructor igual que la clase)
    public Circulo(){
        this.radio = 1;
        this.color = "blanco";
    }

    // Constructor(int radio, String color) -> Con parámetros.
    public Circulo(int radio, String color){
        this.setRadio(radio);
        this.color = color;
    }

    // Constructor(Circulo c) -> De copia.
    public Circulo(Circulo c){
        this.radio = c.radio;
        this.color = c.color;
    }

    // Get -> Conseguir la información de los atributos.
    public int getRadio(){
        return this.radio;
    }

    public String getColor(){
        return this.color;
    }

    // Set -> Establecer la información a los atributos.
    public void setRadio(int radio){
        this.radio = radio;
        if (radio <= 0) this.radio = 1;
    }

    public void setColor(String color){
        this.color = color;
    }

    // Siempre se tiene que llamar 'toString' la función de imprimir, 
    //  porque Java asume que cuando queremos mostrar por pantalla (print) tiene que llamar a toString(). 
    public String toString(){
        return "El radio es " + this.radio + " y el color es " + this.color;
    }

    public static void main(String[] args){
        // System.out.println(radio);   Da error porque es privado entonces hay que llamarlo.

        // Constructor por defecto.
        Circulo circulitoPorDefecto = new Circulo();

        // Constructor con parámetros.
        Circulo circulitoConParametros = new Circulo(2,"azul");

        // Constructor de copia.
        Circulo circulitoDeCopia = new Circulo(circulitoConParametros);

        System.out.println(circulitoPorDefecto);
        System.out.println(circulitoConParametros);
        System.out.println(circulitoDeCopia);

        circulitoDeCopia.setColor("rojo");
        circulitoDeCopia.setRadio(5);

        System.out.println("Cambia circulitoDeCopia:");

        System.out.println(circulitoDeCopia);

        System.out.println("El circuloPorDefecto tiene el mismo radio que el circuloDeCopia?");
        System.out.println(circulitoPorDefecto.getRadio() == circulitoDeCopia.getRadio());

    }
}