import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import com.stem.*;
import com.stem.Nube.TiposDeNube; //Lo hemos metido aqui porque por algún motivo el com.stem.* no ha cogido TiposDeNube.

public class NubeTest {
    
    @Test
    public void testUnir(){
        Nube nube1 = new Nube(TiposDeNube.NIMBOS,10,30);
        Nube nube2 = new Nube(TiposDeNube.CIRROS,10,30);
        Nube nube3 = new Nube(TiposDeNube.NIMBOS,20,45);
        assertEquals(60, nube1.unir(nube2));
        assertEquals(-1, nube1.unir(nube3));
    }

    @Test
    public void testCrecer(){
        Nube nube1 = new Nube(TiposDeNube.NIMBOS,10,30);
        assertEquals(45, nube1.crecer());
        nube1.setTamanio(60);
        assertEquals(90, nube1.crecer());
        nube1.setTamanio(123);
        assertEquals(184.5, nube1.crecer());
    }

    @Test
    public void testSubir(){
        Nube nube1 = new Nube(TiposDeNube.NIMBOS,10,30);
        assertEquals(20, nube1.sube(10));
        assertEquals(53.3, nube1.sube(33.3));
        assertEquals(71, nube1.sube(17.7));
        // Como indicamos en Nube que si se introduce un valor negativo no hace nada, al hacerlo la nube se queda como está.
        assertEquals(2, nube1.sube(-69));
    }

    @Test
    public void testBajar(){
        Nube nube1 = new Nube(TiposDeNube.CUMULOS,75,40);
        assertEquals(65, nube1.baja(10));
        assertEquals(39.5, nube1.baja(25.5));
        assertEquals(0.5, nube1.baja(39));
        assertEquals(0, nube1.baja(10));
    }

    @Test
    public void testPuedeLlover(){
        Nube nube1 = new Nube(TiposDeNube.CUMULOS,2000,300);
        assertTrue(nube1.puedeLlover());
        assertEquals(100, nube1.llover());

        nube1.setTamanio(10);
        assertFalse(nube1.puedeLlover());
        assertEquals(10, nube1.llover());  // No cambia porque no llueve al tener un tamaño menor que 200

        nube1.setAltura(900);
        assertFalse(nube1.puedeLlover());
        assertEquals(10, nube1.llover());

        nube1.setTamanio(200);
        assertFalse(nube1.puedeLlover());
        assertEquals(200, nube1.llover());

        nube1.setAltura(1000);
        assertTrue(nube1.puedeLlover());
        assertEquals(200/3.0, nube1.llover());
    }
}
