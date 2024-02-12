import java.util.Scanner;

public class Nube {

    public enum TiposDeNube{   // Se escribe con Mayus la primera letra porque es una clase chiquita en la que ponemos tipos de cosas.
        CIRROS,
        CUMULOS,
        ESTRATOS,
        NIMBOS,
        DESCONOCIDO;

        public static String mostrar(){     // Al tratarse de una clase podemos hacer diversas cosas dentro.
            return "[CIRROS, CUMULOS, ESTRATOS, NIMBOS]";
        }
    }

    private TiposDeNube tipo;
    private double altura;
    private double tamanio; //cm3

    public Nube(){
        this.tipo = TiposDeNube.CIRROS;
        this.altura = 3000;
        this.tamanio = 1000;
    }

    public Nube(TiposDeNube tipo, double altura, double tamanio){
        this.tipo = tipo;
        this.altura = altura;
        this.tamanio = tamanio;
    }

    public Nube(Nube n){
        this.tipo = n.tipo;
        this.altura = n.altura;
        this.tamanio = n.tamanio;
    }

    public double getAltura() {
        return this.altura;
    }

    public double getTamanio() {
        return this.tamanio;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setTamanio(double tamanio) {
        this.tamanio = tamanio;
    }

    public static void main(String[] args) {
        Nube nube1 = new Nube(TiposDeNube.NIMBOS, 10, 30);
        //Nube nube1 = new Nube(NIMBOS, 10, 30);    - ERROR -
        //Nube nube1 = new Nube("NIMBOS", 10, 30);  - ERROR -

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el tipo de nube " + TiposDeNube.mostrar() + " : ");

        String tipoString = sc.nextLine();
        tipoString = tipoString.toUpperCase();

        TiposDeNube tipoFormatoEnum = TiposDeNube.valueOf(tipoString);


        Nube nube2 = new Nube(tipoFormatoEnum, 10, 30);
    }
}
