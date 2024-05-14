package es.iesmz.ed.algoritmes;

/**
 * Esta clase servira para comprobar y obtener si un numero es HyperPar o no.
 * Un numero es HyperPar si todas sus cifras son pares
 *
 * @author Kevin
 */
public class Hyperpar {
    private long num;

    /**
     * Constructor de la Clase es.iesmz.ed.algoritmes.Hyperpar
     *
     * @param num numero para comprobar
     */
    public Hyperpar(long num) {
        this.num = num;
    }

    /**
     * Metodo para comprobar si es HyperPar
     *
     * @return devuelve boolean true si es hyperpar, false si no lo es
     */
    public static boolean esHyperPar(long numero){
        String numSeparado = String.valueOf(Math.abs(numero));
        long resultado;
        boolean hyperPar = false;

        for (int i = 0; i < numSeparado.length(); i++) {
            numero = Long.parseLong(String.valueOf(numSeparado.charAt(i)));
            resultado = numero % 2;
            if (numero == 0) hyperPar = true;
            else hyperPar = false;
        }
        return hyperPar;
    }
}
