package ajedrez.piezas;

/**
 * Clase que representa la posición el el tablero de cada pieza.
 *
 * @author Martinez Peralta Jose Manuel 
 * @version 22/10/2019 
 */
public class Posicion {
	private int fila;
	private int columna;

	/**
	 * Crea una matriz de mxn donde todas las entradas son cero.
	 *
	 * @param fila donde ese encuentra la pieza
	 * @param columna donde se encuentra l apieza
	 */
	public Posicion(int fila, int columna) {
		this.fila = fila;
		this.columna = columna;
	}

	/**
	 * Metodo para obtener la fila de la Pieza
	 * @return fila donde se encuentra la Pieza
	 */
	public int obtenerFila() {
		return fila;
	}

	/**
	 * Metodo para obtener la columna de la Pieza
	 * @return columna donde se encuentra la Pieza
	 */
	public int obtenerColumna() {
		return columna;
	}

	/**
	 * Metodo para obtener la columna de la Pieza
	 * @param obj El objeto a comparar
	 * @return Verdadero si son iguales, falso si no 
	 */
	@Override
	public boolean equals(Object obj) {
      if (this == obj) {
         return true;
      }

		if (obj == null || getClass() != obj.getClass()) {
         return false;
      }
		Posicion otra = (Posicion) obj;
		return fila == otra.fila && columna == otra.columna;
	}

}
