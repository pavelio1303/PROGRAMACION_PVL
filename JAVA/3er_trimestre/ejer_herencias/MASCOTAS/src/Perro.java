public class Perro extends Mascota{

    // No hace falta hacer un constructor nuevo porque en perro no hay atributos nuevos, basta con los de mascota.
    @Override
    public String onomatopeyar(){
        return "Guau! Guau!";
    }

    public String pasear(){
        return "Paseando...";
    }
    public static void main(String[] args) {
        Perro miPerro = new Perro();
        System.out.println(miPerro);
        System.out.println(miPerro.dormir());
        System.out.println(miPerro.onomatopeyar());
        System.out.println(miPerro.pasear());
    }
}
