import java.util.ArrayList;

public class Chopera {
    private int numFilas;
    private int numColumnas;
    private int edadChopera;
    private ArrayList<ArrayList<Chopo>> matrizDeChopos;

    // Constructor por defecto.
    public Chopera(){
        this.numFilas = 0;
        this.numColumnas = 0;
        this.edadChopera = 0;
        this.matrizDeChopos = new ArrayList<ArrayList<Chopo>>();
    }
    // Constructor con parámetros. Creamos nosotros la matriz de chopos con chopos de verdad!
    public Chopera( int numFilas, int numColumnas, int edad){
        this.numFilas = 0;
        this.setNumFilas(numFilas);
        this.numColumnas = 0;
        this.setNumColumnas(numColumnas);
        this.edadChopera = 0;
        this.setEdadChopera(edad);
        this.matrizDeChopos = new ArrayList<ArrayList<Chopo>>();

        Chopo chopoNormal = new Chopo(3,30,1); // Un chopo genérico.
        for (int i = 0; i < numFilas ; i++){
            // Matriz es una ArrayList. Por cada fila de la matriz, creamos un arrayList de columnas de chopos.
            matrizDeChopos.add(new ArrayList<Chopo>());
            for (int j = 0 ; j < numColumnas ; j++){
                matrizDeChopos.get(i).add(chopoNormal);
            }
        }

    }
    // Constructor con chopos aleatorios.
    public Chopera( int numFilas, int numColumnas){
        this.numFilas = 0;
        this.setNumFilas(numFilas);
        this.numColumnas = 0;
        this.setNumColumnas(numColumnas);
        int edadChopera = 0;

        this.matrizDeChopos = new ArrayList<ArrayList<Chopo>>();

         // Un chopo genérico.
        for (int i = 0; i < numFilas ; i++){
            // Matriz es una ArrayList. Por cada fila de la matriz, creamos un arrayList de columnas de chopos.
            matrizDeChopos.add(new ArrayList<Chopo>());
            for (int j = 0 ; j < numColumnas ; j++){

                double alturaAleatoria = (Math.round(Math.random()*900)/100.0);   // Hacemos primero el redondeo por la cantidad que queremos multiplicada por 100 y después dividimos entre 100 para tenerlos.
                double diametroAleatorio = (Math.round(Math.random()*4500)/100.0);
                int edadAleatoria = (int)Math.floor((Math.random()*3)+1);

                if (edadAleatoria>edadChopera) edadChopera = edadAleatoria;

                Chopo chopoAleatorio= new Chopo(alturaAleatoria,diametroAleatorio,edadAleatoria);

                matrizDeChopos.get(i).add(chopoAleatorio);
            }
        }
        this.edadChopera = edadChopera;
    }
    // Constructor de copia.
    public Chopera(Chopera c){
        this.numFilas = c.numFilas;
        this.numColumnas = c.numColumnas;
        this.edadChopera = c.edadChopera;
        this.matrizDeChopos = (ArrayList<ArrayList<Chopo>>)c.matrizDeChopos.clone();
    }

    public int getNumFilas() {
        return this.numFilas;
    }
    public int getNumColumnas() {
        return this.numColumnas;
    }
    public int getEdadChopera() {
        return this.edadChopera;
    }
    public ArrayList<ArrayList<Chopo>> getMatrizDeChopos() {
        return this.matrizDeChopos;
    }

    public void setNumFilas(int numFilas) {
        if (numFilas > 0 ) this.numFilas = numFilas;
    }
    public void setNumColumnas(int numColumnas) {
        if (numColumnas > 0 )this.numColumnas = numColumnas;
    }
    public void setEdadChopera(int edadChopera) {
        if (edadChopera >= 0 ) this.edadChopera = edadChopera;
    }
    public void setMatrizDeChopos(ArrayList<ArrayList<Chopo>> matrizDeChopos) {
        // Está igualando las direcciones de memoria. No está copiando los datos.
        // this.matrizDeChopos = matrizDeChopos;
        this.matrizDeChopos = (ArrayList<ArrayList<Chopo>>)matrizDeChopos.clone();
        this.numFilas = matrizDeChopos.size();
        this.numColumnas = matrizDeChopos.get(0).size();
    }

    public String toString(){
        String salida = "";
        for (ArrayList<Chopo> fila : matrizDeChopos){
            for (Chopo columna : fila){
                salida += columna + "\t";
            }
            salida += "\n";
        }
        return salida;
    }
    public static void main(String[] args) {
        /*ArrayList<ArrayList<Integer>> numeros = new ArrayList<ArrayList<Integer>>();

        // Una matriz en una lista de listas.
        numeros.add(new ArrayList<Integer>()); // Tenemos una primera lista.
        numeros.get(0).add(1); // Con tres elementos.
        numeros.get(0).add(2);
        numeros.get(0).add(3);

        System.out.println(numeros.size()); // Devuelve el número de filas.
        System.out.println(numeros.get(0).size()); // Devuelve el número de elementos de la primera fila -> numero de columnas.
        */

        Chopera chopera1 = new Chopera(3,3,1);
        System.out.println(chopera1);

        Chopera chopera2 = new Chopera(3,3);
        System.out.println(chopera2);


    }
}