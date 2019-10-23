package ajedrez.piezas;

import ajedrez.piezas.Peon;
import ajedrez.piezas.Posicion;
/**
 * Clase de prueba de movimientos posibles de la clase peon.
 * @author Martinez Peralta Jose Manuel
 * @version 22/10/2019 
 */

public class PruebaPeon {
    public static void main(String[] args) {

        Peon peon = new Peon((args[0].toUpperCase().equals("B")) ? Color.BLANCO : Color.NEGRO,
                new Posicion(Integer.parseInt(args[1]), Integer.parseInt(args[2])));
        for (Posicion p : peon.obtenerJugadasLegales()) {
            System.out.println("(" + p.obtenerFila() + ", " + p.obtenerColumna() + ")");
        }

    }
}