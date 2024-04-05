public class SofaCama implements Sofa,Cama{
    
    private boolean esSofa;

    public SofaCama(){
        esSofa = true;
    }

    // No podemos modificar el número de plazas porque es un atributo
    // de la interfaz.
    /*
    public SofaCama(int nPlazas){
        esSofa = true;
        numPlazas = nPlazas;
    }
    */

    // Era obligatorio implementar sentarse() por la interfaz Sofa.
    public String sentarse(){
        return "Me siento...";
    }
    // Era obligatorio implementar dormir() por la interfaz Cama.
    public String dormir(){
        return "Me duermo cómodamente..."; 
    }
    public String abrir(){
        String salida = "";
        if (esSofa) salida = "Convierto el sofá en cama";
        return salida;
    }
    public String cerrar(){
        String salida = "";
        if (!esSofa) salida = "Convierto la cama en sofá";
        return salida;
    }

    @Override
    public String toString(){
        return "Mi sofá cama tiene " + this.numPlazas + " plazas.";
    }
    public static void main(String[] args) {
        SofaCama sofaCama = new SofaCama();
        System.out.println(sofaCama);
    }
}
