public class Ventanilla {

    private boolean transparencia;  // Lo que no es transparente es tintado.
    private double tamanio;
    private boolean estado; // Subida o bajada.

    public Ventanilla(){
        this.transparencia = True;
        this.tamanio = 15;
        this.estado = True;
    }

    public Ventanilla(boolean transparencia, double tamanio){
        this.transparencia = transparencia;
        this.tamanio = tamanio;
        this.estado = True;
    }

    public Ventanilla(Ventanilla v){
        this.transparencia = v.transparencia;
        this.tamanio = v.tamanio;
        this.estado = v.True;
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

    public void setTransparencia(boolean transparencia){
        this.transparencia = transparencia;
    }

    public void setTamanio(double tamanio){
        this.tamanio = tamanio;
    }

    public void setEstado(boolean estado){
        this.estado = estado;
    }
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
}