public class Puerta {
    private boolean pestillo;  // Lo que no es transparente es tintado.
    private boolean estado; // abierta o cerrada.
    private Ventanilla ventanilla;

    /**
     * Constructor por defecto, está cerrada con pestillo.
     */
    public Puerta(){
        this.pestillo = true;   // Pestillo echado.
        this.estado = true; // Puerta cerrada.
        this.ventanilla = new Ventanilla();
    }

    /**
     * Constructor con parámetro pestillo, por defecto cerrada
     * @param pestillo
     */
    public Puerta(boolean pestillo){
        this.pestillo = pestillo;
        this.estado = true;
        this.ventanilla = new Ventanilla();
    }

    /**
     * Constructor de copia.
     * @param p
     */
    public Puerta(Puerta p){
        this.pestillo = p.pestillo;
        this.estado = p.estado;
        this.ventanilla = new Ventanilla(p.ventanilla);
    }

    public boolean getPestillo(){
        return this.pestillo;
    }

    public boolean getEstado(){
        return this.estado;
    }

    public Ventanilla getVentanilla(){
        return this.ventanilla;
    }

    private void setPestillo(boolean pestillo){
        this.pestillo = pestillo;
    }

    private void setEstado(boolean estado){
        this.estado = estado;
    }

    public void abrirPuerta(){
        if(!pestillo) this.setEstado(false);   // Si no está echado el pestillo podemos abrir la puerta.
    }

    public void cerrarPuerta(){
        this.setEstado(true);
    }

    public void quitarPestillo(){
        this.setPestillo(false);
    }

    public void echarPestillo(){
        if(this.estado) this.setPestillo(true);    // Si la puerta esta cerrada podemos echar el peestillo.
    }

    public String toString(){
        String salida = "La Puerta está ";

        if(this.estado) salida += "cerrada. ";
        else salida += "abierta. ";

        salida += "El pestillo está ";

        if(this.pestillo) salida += "echado. ";
        else salida += "sin echar. ";

        salida += this.ventanilla.toString();

        return salida;
    }
    public static void main(String[] args){
        Puerta puerta1 = new Puerta();
        System.out.println(puerta1);
        puerta1.quitarPestillo();
        puerta1.abrirPuerta();
        System.out.println(puerta1);
        puerta1.getVentanilla().bajarVentanilla();
        System.out.println(puerta1);
        puerta1.getVentanilla().tintarCristales();
        System.out.println(puerta1);
    }
}
