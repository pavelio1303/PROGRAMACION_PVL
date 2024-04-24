import java.util.ArrayList;

public class BombillaRGB extends Bombilla{

    private ArrayList<Integer> colorRGB;

    public BombillaRGB(){
        super();
        this.colorRGB = new ArrayList<Integer>();
        this.colorRGB.add(000);
        this.colorRGB.add(000);
        this.colorRGB.add(000);
    }

    public BombillaRGB(String hex){
        super();
        this.colorRGB = new ArrayList<Integer>();
        this.setColorRGB(rgbDado);
    }

    public ArrayList<Integer> getColorRGB() {
        return this.colorRGB;
    }

    public void setColorRGB(ArrayList<Integer> rgb) {
        
        this.colorRGB = (ArrayList<Integer>) rgb.clone();
    }

    private void setValor(int posicion, int valor){
        if(valor >= 0 && valor <= 255) colorRGB.set(posicion, (Integer)valor);
    }

    public void setR(int r){
        setValor(0, r);
    }

    public void setG(int g){
        setValor(1, g);
    }

    public void setB(int b){
        setValor(2, b);
    }

    private boolean esLuzBlanca(){
        boolean esBlanca = true;
        // for (int valor : this.colorRGB){
        //     if (valor != 255) esBlanca = false;
        // }                                            MEJOR COMO ABAJO PONIENDO UNA CONDICION

        for (int i = 0 ; i < this.colorRGB.size() && esBlanca ; i++){
            if (i != 255) esBlanca = false;
        }
        return esBlanca;
    }

    public String iluminar(){
        String salida="No es apropiado para estudiar.";

        if (this.getLuminosidad() >= 1000 && esLuzBlanca()) salida = "Apropiada para estudiar.";
        
        return salida;
    }

    public String toString(){
        return super.toString() + "y color " + this.getColorRGB();
    }
}
