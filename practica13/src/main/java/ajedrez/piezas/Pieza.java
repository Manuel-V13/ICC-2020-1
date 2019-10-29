package ajedrez.piezas;
import java.util.List;

/**
 * Clase pieza de tipo abstracto.
 *
 * @author Martinez Peralta Jose Manuel
 * @version 22/10/2019 
 */
public abstract class Pieza {
	private Color color;
	private Posicion posicion;

	public Pieza(Color color, Posicion posicion) {
		this.color = color;
		this.posicion = posicion;
	}

	public abstract List<Posicion> obtenerJugadasLegales();

	public Color obtenerColor() {
		return color;
	}

	public Posicion obtenerPosicion() {
		return posicion;
	}

	public void asignarPosicion(Posicion posicion) {
		this.posicion = posicion;
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
		Pieza otra = (Pieza) obj;
		return color == otra.color && posicion.equals(otra.obtenerPosicion());
	}
}