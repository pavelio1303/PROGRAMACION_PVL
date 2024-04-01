import java.util.ArrayList;
import java.util.Scanner;

public class Estante {

    private double pesoMaximo;
    private ArrayList<Double> listaPesosObjetos;

    public Estante(){
        this.pesoMaximo = 35;
        this.listaPesosObjetos = new ArrayList<Double>();
    }
    public Estante(double pesoMaximo, ArrayList<Double> listaPesosObjetos){
        this.pesoMaximo = pesoMaximo;
        this.listaPesosObjetos = (ArrayList<Double>)listaPesosObjetos.clone();
    }   

    public double getPesoMaximo() {
        return pesoMaximo;
    }
    public ArrayList<Double> getListaPesosObjetos() {
        return listaPesosObjetos;
    }

    public void setPesoMaximo(double pesoMaximo) {
        this.pesoMaximo = pesoMaximo;
    }
    public void setListaPesosObjetos(ArrayList<Double> listaPesosObjetos) {
        this.listaPesosObjetos = (ArrayList<Double>)listaPesosObjetos.clone();
    }

    public double pesoTotal(){
        double pTotal = 0;
        for (double peso : this.listaPesosObjetos){
            pTotal += peso;
        }
        return pTotal;
    }

    public boolean aniadirObjeto(double peso){
        boolean aniadido = false;
        if(this.pesoMaximo >= this.pesoTotal()+peso){
            this.listaPesosObjetos.add(peso);
            aniadido = true;
        }
        return aniadido;
    }

    public String toString(){
        return "\nMi estantería puede soportar " + this.pesoMaximo + "kg y contiene " + 
                this.listaPesosObjetos.size() + " objetos. En total pesan " + this.pesoTotal() + ".";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numeroEstantes = 5;
        double pesoObjeto;
        boolean salida = false;
        int numEstanteEnEstanteria = 0;

        ArrayList<Estante> estanteria = new ArrayList<Estante>();

        // Construir estantería.
        for (int i = 0 ; i < numeroEstantes ; i++){
            Estante estante = new Estante();
            estanteria.add(estante);
        }
        System.out.println(estanteria);

        while(!salida){
            // Añadir objeto a estantería.
            System.out.println("Introduce el peso del objeto que quieras añadir a la estantería: ");
            pesoObjeto = sc.nextDouble();
            if (pesoObjeto <= 0) salida = true;
            // Añadiendo al primer estante de la estantería.
            while (!salida && !estanteria.get(numEstanteEnEstanteria).aniadirObjeto(pesoObjeto) && numEstanteEnEstanteria<estanteria.size()-1){
                numEstanteEnEstanteria++;
            }
            numEstanteEnEstanteria = 0; // Para que vuelva a intentarlo con el primer estante en la siguiente ronda.

            System.out.println(estanteria);
        }
        

    }

}