package geometria;
/**
  Clase para crear líneas rectas en el plano Cartesiano
  Objetivo: ilustrar la relación de agregación entre objetos.
  @author  Martinez Peralta Jose Manuel
  @see     Punto
*/
public class Triangulo{
	private Punto a;
	private Punto b;
	private Punto c;
	public static final int ISOSCELES = 1;
	public static final int ESCALENO = 2;
	public static final int EQUILATERO = 0;
/**
 * Metodo con parametros 
 * @param a punto (0,0)
 * @param b punto (1,0)
 * @param c punto (0.5, sin(π / 3)
 * @return 	objeto de la clase triangulo con puntos dados.
 */
	public Triangulo (){
		a = new Punto(0, 0);
		b = new Punto(1, 0);
		c = new Punto(0.5, Math.sin(Math.PI/3));
	}

/**
 * Crea un triángulo con los tres puntos dados. 
 * @param a punto a
 * @param b punto b
 * @param c punto c
 */
	public Triangulo (Punto a, Punto b, Punto c){
		this.a = a;
		this.b = b;
		this.c = c;
	}
/**
 * Metodo con parametros 	
 * Determina si los vértices de este triángulo están alineados.
 * @param a punto a
 * @param b punto b
 * @param c punto c
 * @return 	true si los vértices están alineados
 */
	public boolean tieneVerticesAlineados(){
		return a.estanAlineados(b, c);
	} 
	public int tipo(){
		if (a.distancia(b) == b.distancia(c) && b.distancia(c) == a.distancia(c)){
			return EQUILATERO;
		}else if(a.distancia(b) != b.distancia(c) && b.distancia(c) != a.distancia(c) && a.distancia(b) != a.distancia(c)){	
			return ESCALENO;
		}else{
			return ISOSCELES;
		}
	}
}