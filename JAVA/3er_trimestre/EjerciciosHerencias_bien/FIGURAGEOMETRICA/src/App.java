import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class App {
    public static void main(String[] args) throws Exception {
        TrianguloRegular t1 = new TrianguloRegular(5);
        TrianguloRegular t2 = new TrianguloRegular(13);
        Cuadrado c1 = new Cuadrado(3);
        Cuadrado c2 = new Cuadrado(4);

        System.out.println(c1);
        System.out.println("El perímetro es: " + c1.perimetro());
        System.out.println("El área es: " + c1.area());
        System.out.println(t1);
        System.out.println("El perímetro es: " + t1.perimetro());
        System.out.println("El área es: " + t1.area());

        // Sobrecarga del .equals.
        if (c1.equals(c2))
        System.out.println("Son iguales");

        ArrayList<FiguraGeometricaRegular> listaFiguras = new ArrayList<FiguraGeometricaRegular>();
        listaFiguras.add(c1);
        listaFiguras.add(c2);
        listaFiguras.add(t1);
        listaFiguras.add(t2);
        System.out.println(listaFiguras);

        Comparator<FiguraGeometricaRegular> comparadorPorArea = Comparator.comparingDouble(FiguraGeometricaRegular::area).reversed(); 
        Collections.sort(listaFiguras,comparadorPorArea);
        System.out.println(listaFiguras);

        Comparator<FiguraGeometricaRegular> comparadorPorPerimetro = Comparator.comparingDouble(FiguraGeometricaRegular::perimetro);
        Collections.sort(listaFiguras,comparadorPorPerimetro);
        System.out.println(listaFiguras);

        Comparator<FiguraGeometricaRegular> comparadorPorNumLados = Comparator.comparingInt(FiguraGeometricaRegular::getNumLados);
        Collections.sort(listaFiguras,comparadorPorNumLados);
        System.out.println(listaFiguras);
    }
}
