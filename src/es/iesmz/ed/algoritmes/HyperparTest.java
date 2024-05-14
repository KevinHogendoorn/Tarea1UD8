package es.iesmz.ed.algoritmes;

import es.iesmz.ed.algoritmes.Hyperpar;
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
    public void negativoEsHyperPar(){
        long num = -240;
        assertTrue(Hyperpar.esHyperPar(num));
    }

    @Test
    public void negativoNoEsHyperPar(){
        long num = -382;
        assertFalse(Hyperpar.esHyperPar(num));
    }

    @Test
    public void ceroEsHyperPar(){
        long num = 0;
        assertTrue(Hyperpar.esHyperPar(num));
    }
}