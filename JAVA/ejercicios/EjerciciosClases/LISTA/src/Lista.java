import array.util.ArrayList;

public class Lista {

    private ArrayList<Integer> listaNumeros;

    public Lista(){
        this.listaNumeros = new ArrayList<Integer>();
    }

    public java.util.ArrayList<Integer> getListaNumeros() {
        return this.listaNumeros;
    }

    public void setListaNumeros(ArrayList<Integer> listaNumeros) {
        this.listaNumeros = (ArrayList<Integer>)listaNumeros.clone();
    }

    public toString(){
        return this.listaNumeros.toString();
    }

    public void aniadirNumeroaALista(int numero){
        //...
    }

    public int buscarNumeroEnLista(int numero){
        // Devuelve la posicion en la que lo ha encontrado
        return 0;
    }

    public void eliminarNumeroDeLista(int numero){
        
    }
}
