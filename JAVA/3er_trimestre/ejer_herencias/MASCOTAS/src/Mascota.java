import java.time.LocalDateTime;

public class Mascota {
    private String nombre;
    private LocalDateTime fechaNacimiento;   // Mejor con ella así, podemos calcular la edad.
    private String microchip;
    //private Persona duenio;
    private String nombreDuenio;    // Porque todavía no hemos creado la clase persona.

    public Mascota(){
        this.nombre = "";
        this.fechaNacimiento = LocalDateTime.now();
        this.microchip = "000000000000000";
        this.nombreDuenio = "";
    }

    /*  YA ASÍ NO
    public Mascota(String nombre, LocalDateTime fechaNacimiento, String microchip,String nombreDuenio){
        this.nombre = "";
        setNombre(nombre);
        this.fechaNacimiento = LocalDateTime.now();
        setFechaNacimiento(fechaNacimiento);
        this.microchip = "000000000000000";
        setMicrochip(microchip);
        this.nombreDuenio = "";
        setNombreDuenio(nombreDuenio);
    }
    */

    // con this() al principio, llamamos al constructor por defecto y despúes sustituye sus datos.
    public Mascota(String nombre, LocalDateTime fechaNacimiento, String microchip,String nombreDuenio){
        this();
        setNombre(nombre);
        setFechaNacimiento(fechaNacimiento);
        setMicrochip(microchip);
        setNombreDuenio(nombreDuenio);
    }

    /*  YA ASÍ NO
    public Mascota(Mascota m){
        setNombre(m.nombre);
        setFechaNacimiento(m.fechaNacimiento);
        setMicrochip(m.microchip);
        setNombreDuenio(m.nombreDuenio);
    }
    */

    // Llama al constructor con parámetros e introduce los de la copia.
    public Mascota(Mascota m){
        this(m.nombre,m.fechaNacimiento,m.microchip,m.nombreDuenio);
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDateTime getFechaNacimiento() {
        return this.fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDateTime fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getMicrochip() {
        return this.microchip;
    }

    public void setMicrochip(String microchip) {
        this.microchip = microchip;
    }

    public String getNombreDuenio() {
        return this.nombreDuenio;
    }

    public void setNombreDuenio(String nombreDuenio) {
        this.nombreDuenio = nombreDuenio;
    }

    // Métodos

    public String comer(){
        return "Comiendo";
    }

    public String evacuar(){
        return "Evacuando...";
    }

    public String jugar(){
        return "Jugando...";
    }

    public String onomatopeyar(){
        return "*ruiditos de animal*";
    }

    public String dormir(){
        return "Durmiendo";
    }
    
    public static void main(String[] args) {
        
    }
}