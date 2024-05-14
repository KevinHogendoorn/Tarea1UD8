import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class HyperparTest {
    @Test
    public void esHyperPar(){
        long num = 26280;
        assertTrue(Hyperpar.esHyperPar(num));
    }

    @Test
    public void noEsHyperPar(){
        long num = 1258;
        assertFalse(Hyperpar.esHyperPar(num));
    }

    @Test
    public void introduceCadenaNoEsHyperPar(){
        long num = Long.parseLong("adasfd");
        assertFalse(Hyperpar.esHyperPar(num));
    }

    @Test
    public void parametroNuloNoEsHyperPar(){
        long num = Long.parseLong(null);
        assertFalse(Hyperpar.esHyperPar(num));
    }

    @Test
    public void cadenaVacia(){
        long num = Long.parseLong("");
        assertFalse(Hyperpar.esHyperPar(num));
    }
}