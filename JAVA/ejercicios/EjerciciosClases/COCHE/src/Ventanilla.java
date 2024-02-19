public class Ventanilla {

    private boolean transparencia;  // Lo que no es transparente es tintado.
    private double tamanio;
    private boolean estado; // Subida o bajada.

    public Ventanilla(){
        this.transparencia = true;
        this.tamanio = 15;
        this.estado = true;
    }

    public Ventanilla(boolean transparencia, double tamanio){
        this.transparencia = transparencia;
        this.tamanio = tamanio;
        this.estado = true;
    }

    public Ventanilla(Ventanilla v){
        this.transparencia = v.transparencia;
        this.tamanio = v.tamanio;
        this.estado = v.estado;
    }

    public boolean getTransparencia(){
        return this.transparencia;
    }

    public double getTamanio(){
        return this.tamanio;
    }

    public boolean getEstado(){
        return this.estado;
    }

    private void setTransparencia(boolean transparencia){
        this.transparencia = transparencia;
    }

    private void setTamanio(double tamanio){
        this.tamanio = tamanio;
    }

    private void setEstado(boolean estado){
        this.estado = estado;
    }

    public void bajarVentanilla(){
        this.setEstado(false);   
    }

    public void subirVentanilla(){
        this.setEstado(true);
    }

    public void tintarCristales(){
        this.setTransparencia(false);
    }

    public void destintarCristales(){
        this.setTransparencia(true);
    }

    public String toString(){
        String salida = "La ventanilla es ";

        if(this.transparencia) salida += "transparente. ";
        else salida += "de cristal tintado. ";

        salida += "Es de tamaño " + this.tamanio + " y está ";

        if(this.estado) salida += "subida. ";
        else salida += "bajada. ";

        return salida;
    }
    public static void main(String[] args){
        Ventanilla ventanilla1 = new Ventanilla();
        System.out.println(ventanilla1);
        ventanilla1.bajarVentanilla();
        ventanilla1.tintarCristales();
        System.out.println(ventanilla1);
    }
}