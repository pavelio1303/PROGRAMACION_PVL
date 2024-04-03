import java.time.LocalDateTime;

public class Pajaro extends Mascota{
    public Pajaro(){
        super();
    }

    public Pajaro(String nombre, LocalDateTime fechaNacimiento, String microchip, String nombreDuenio){
        super(nombre, fechaNacimiento, microchip, nombreDuenio);
    }

    public String volar(){
        return "volando";
    }
    public String onomatopeyar(){
        return "Piola! Piola!";
    }

    public static void main(String[] args){
    
    }
}
