import java.util.ArrayList;

public class BombillaRGB extends Bombilla{
    // private String colorR;
    // private String colorG;
    // private String colorB;

    ArrayList<Integer> colorRGB;

    public BombillaRGB(){
        super();
        this.colorRGB = new ArrayList<Integer>();
        this.colorRGB.add(000);
        this.colorRGB.add(000);
        this.colorRGB.add(000);
    }

    public BombillaRGB(String color){
        super();
        this.colorRGB=new ArrayList<Integer>();
        this.setColorRGB(color);
    }

    public ArrayList<Integer> getColorRGB() {
        return this.colorRGB;
    }

    public void setColorRGB(String colorHex) {
        
        this.colorRGB.add(colorHex);
    }

    public String iluminar(){
        String respuesta="No es apropiado para estudiar.";
        if (this.getLuminosidad() >= 1000 && this.getColorRGB().equals(000,000,000)) respuesta = "Apropiada para estudiar.";
        
        return respuesta;
    }

    public String toString(){
        return "Es una bombilla de " + this.getLuminosidad() + " lúmenes y color " + this.getColor();
    }
}
