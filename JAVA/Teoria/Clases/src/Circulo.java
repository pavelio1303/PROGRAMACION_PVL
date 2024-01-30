import java.util.Scanner;

/**
 * Estamos en la clase círculo.
 * 
 * @author Pablo Jiménez
 * @version 1.0
 */

public class Circulo {

    // Atributos del circulo (de la clase). El 99% de las veces (por no decir siempre) los atributos son privados.
    private int radio = 5;
    private String color;

    // Metodos de la clase:

    // Constructor() -> Se definen los parámetros por defecto. (Siempre se llama al constructor igual que la clase)

    /**
     * Cosntructor por defecto.
     * Crea un círculo blanco con radio 1.
     */
    public Circulo(){
        this.radio = 1;
        this.color = "blanco";
    }

    // Constructor(int radio, String color) -> Con parámetros.

    /**
     * Constructor con parámetros.
     * Crea un círculo con un radio y color especificados.
     * @param radio El radio del círculo.
     * @param color El color del círculo. 
     * @see Circulo#setRadio(int radio)
     */
    public Circulo(int radio, String color){
        this.setRadio(radio);
        this.color = color;
    }

    // Constructor(Circulo c) -> De copia.

    /**
     * Constructor de copia.
     * Crea un círculo con un radio y color obtenidos a partir de otro círculo.
     * @param c El círculo a copiar.
     */
    public Circulo(Circulo c){
        this.radio = c.radio;
        this.color = c.color;
    }

    // Get -> Conseguir la información de los atributos.
    /**
     * Obtener el radio actual del círculo.
     * @return el radio del círculo.
     */
    public int getRadio(){
        return this.radio;
    }

    /**
     * Obtener el color actual del círculo.
     * @return el color del círculo.
     */
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

    /**
     * Calcular el area del círculo.
     * @return area del círculo. Calculada como -> pi*r^2
     */
    public double calcularArea(){ 
        return Math.PI*this.radio*this.radio; //Math.pow(this.radio, 2) -> para elevar a X algún dato   
    }

    /**
     * Calcular el perímetro.
     * @return perímetro del círculo. Calculado como -> 2*pi*r
     */
    public double calcularPerimetro(){
        return 2*Math.PI*this.radio;
    }

    // Siempre se tiene que llamar 'toString' la función de imprimir, 
    //  porque Java asume que cuando queremos mostrar por pantalla (print) tiene que llamar a toString(). 

    /**
     * Devolver la representación en formato de cadena (String) del objeto círculo.
     * @return Una cadena que representa el objeto círculo.
     */

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

        System.out.println("El area del círculo ( " + circulitoDeCopia + " ) es " + circulitoDeCopia.calcularArea());

    }
}