public interface Sofa {
    /**
     * No puede ser un atributo privado porque no tiene sentido que 
     * solo pueda utilizarse dentro la interfaz.
     * Tiene que estar siempre inicializado a un valor por defecto.
     * Como el atributo es de la interfaz es final y estático.
     */
    int numPlazas = 2;

    /**
     * @return el texto "Me siento..."
     */
    public String sentarse();
}
