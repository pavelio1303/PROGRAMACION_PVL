public class Coche {
    private boolean cierreCentralizado; // Echado o no.
    private boolean estado; // parado o arrancado.
    private Puerta puertaDer;
    private Puerta puertaIzq;

    /**
     * Constructor por defecto: Está cerrada con cierreCentralizado y apagado.
     */

    public Coche(){
        this.cierreCentralizado = true; // Es cierreCentralizado cerrado.
        this.estado = false; // Coche apagado.
        this.puertaDer = new Puerta();
        this.puertaIzq = new Puerta();
    }

    /**
     * Constructor con parámetros cierreCentralizado. Está cerrada.
     */
    public Coche(boolean cierreCentralizado){
        this.cierreCentralizado = cierreCentralizado;
        this.estado = false; 
        this.puertaDer = new Puerta();
        this.puertaIzq = new Puerta();
    }

    /**
     * Constructor de copia
     */
    public Coche(Coche c){
        this.cierreCentralizado = c.cierreCentralizado;
        this.estado = c.estado;
        this.puertaDer = new Puerta(c.puertaDer);
        this.puertaIzq = new Puerta(c.puertaIzq);
    }

    // Gets y Sets
    public boolean getcierreCentralizado() {
        return this.cierreCentralizado;
    }
    public boolean getEstado() {
        return this.estado;
    }
    public Puerta getPuertaDer() {
        return this.puertaDer;
    }
    public Puerta getPuertaIzq() {
        return this.puertaIzq;
    }


    private void setcierreCentralizado(boolean cierreCentralizado){
        this.cierreCentralizado = cierreCentralizado;
    }
    private void setEstado(boolean estado){
        this.estado = estado;
    }
    public void setpuertaDer(Puerta puertaDer) {
        this.puertaDer = puertaDer;
    }
    public void setpuertaIzq(Puerta puertaIzq) {
        this.puertaIzq = puertaIzq;
    }

    public void abrirCoche(){ // Es darle al botoncito del mando.
        this.setcierreCentralizado(false);
    }
    public void cerrarCoche(){
        // Para cerrar el coche tiene que estar las puertas cerradas.
        if (this.puertaDer.getEstado() && this.puertaIzq.getEstado()){
            this.setcierreCentralizado(true);
        }    
    }

    public void arrancar(){
        this.setEstado(true); // Si la Coche está cerrada podemos echar el cierreCentralizado.
    }
    public void apagar(){
        this.setEstado(false); // Si la Coche está cerrada podemos echar el cierreCentralizado.
    }

    /**
     * Devolver la representación en formato de cadena (String) del objeto Coche.
     * @return Una cadena que representa el objeto Coche.
     */

    public String toString(){
        String salida = "El Coche está ";

        if (this.estado) salida += "arrancado. ";
        else salida += "apagado. ";

        salida += "El cierreCentralizado está ";

        if (this.cierreCentralizado) salida += "echado. ";
        else salida += "sin echar. ";

        salida += "\nPuerta conductor: " + this.puertaIzq.toString() + " ";
        salida += "\nPuerta copiloto: " + this.puertaDer.toString() + "\n";

        return salida;
    }

    /**
     * @param args
     */
    public static void main(String[] args){
        Coche coche1 = new Coche();
        System.out.println(coche1);
        coche1.abrirCoche();
        // Abro la puerta del copiloto.
        System.out.println(coche1);
        coche1.getPuertaDer().quitarPestillo();
        coche1.getPuertaDer().abrirPuerta();
        System.out.println(coche1);
        // Bajo la ventanilla del conductor.
        coche1.getPuertaIzq().getVentanilla().bajarVentanilla();
        System.out.println(coche1);

    }
}
