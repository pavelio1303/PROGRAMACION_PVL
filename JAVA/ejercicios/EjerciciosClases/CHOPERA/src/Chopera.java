import java.util.ArrayList;

public class Chopera {
    private int numFilas;
    private int numColumnas;
    private int edadChopera;
    private ArrayList<Chopo>[][] matrizDeChopos;

    public ArrayList<Chopo>[][] getMatrizDeChopera() {
        return this.matrizDeChopos;
    }

    public int getNumColumnas() {
        return this.numColumnas;
    }

    public int getNumFilas() {
        return this.numFilas;
    }

    public int edadChopera(){
        return this.edadChopera;
    }

    public void setEdadChopera(int edadChopera) {
        if (edadChopera > 0) this.edadChopera = edadChopera;
    }

    public void setMatrizDeChopera(ArrayList<Chopo>[][] matrizDeChopera) {
        this.matrizDeChopos = matrizDeChopera;

        this.matrizDeChopos = (ArrayList<Chopo>[][])matrizDeChopos.clone();
    }

    public void setNumColumnas(int numColumnas) {
        if (numColumnas > 0) this.numColumnas = numColumnas;
    }

    public void setNumFilas(int numFilas) {
        if (numFilas > 0) this.numFilas = numFilas;
    }
}
