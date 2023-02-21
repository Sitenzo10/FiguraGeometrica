/**
 * Clase rectangulo que hereda de FiguraGeometrica_APG
 * @version 1.2
 * @author Andrés Penalva González
 */
public class Rectangulo_APG extends FiguraGeometrica_APG {
	private double l1;
	private double l2;

	/**
	 * Constructor de la clase Rectangulo_APG
	 *
	 * @param tipoFigura nombre del tipo de figura
	 * @param lG longitu del lado1
	 * @param lP longitud del lado2
	 */
	public Rectangulo_APG(String tipoFigura, double lG, double lP) {
		super(tipoFigura);
		l1 = lG;
		l2 = lP;
	}

	/**
	 * Calcula el area del rectangulo
	 *
	 * @return area del rectangulo
	 */

	@Override
	public double area() {
		return l1 * l2;
	}

	/**
	 * calcula el perimetro del rectangulo
	 *
	 * @return perimetro del rectangulo
	 */
	@Override
	public double perimetro() {
		return (2 * l1) + (2 * l2);
	}

}
