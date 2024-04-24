import java.time.LocalDateTime;

public class Pajaro extends Mascota{
    public Pajaro(){
        super();
    }
    public Pajaro(String nombre, LocalDateTime fechaNacimiento, String microchip, String nombreDuenio){
        super(nombre,fechaNacimiento,microchip,nombreDuenio); // Llama al constructor  con parámetros del padre.
    }

    public String volar(){
        return "Volando...";
    }

    //@Override
    public String onomatopeyar(){
        return /*super.onomatopeyar() +*/ ": Pio! Pio!";
    }

    @Override
    public String toString() {
        return "El pájaro: " + super.toString();
    }
}
