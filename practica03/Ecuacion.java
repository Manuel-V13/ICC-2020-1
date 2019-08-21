public class Ecuacion {

	public static void main(String[] args) {
		double a = 3, b = 17, c = 10, d = -5.7, e = 3.5;
		int i = 1, n = 10;
		double suma = 0;
		while (i <= n) {
			/* Escribe en la línea 9 */
			double m = ((i*(b - a)) / n);
			double v = -(500)*(m)*(m);
			double z = m *= 2992;
			double l = - (49*c*(d + e)) / (34*(3d + c));
			suma = v + z + l + suma;
			/* ************************ */
			i++;
		}
		System.out.println("Resultado = " + (((b - a) / n) * suma));
	}

}