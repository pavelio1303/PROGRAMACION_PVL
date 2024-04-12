public abstract class Bombilla {
    private int luminosidad;

    public Bombilla() {
        this.luminosidad=800;
    }

    public Bombilla(int luminosidad){
        this.luminosidad=800;
        this.setLuminosidad(luminosidad);
    }

    public int getLuminosidad() {
        return this.luminosidad;
    }

    public void setLuminosidad(int luminosidad) {
        if (luminosidad >= 800 && luminosidad <= 1100) this.luminosidad = luminosidad;
    }

    abstract public String iluminar();

    public String toString(){
        return "Es una bombilla de " + this.getLuminosidad() + " lúmenes.";
    }
}
