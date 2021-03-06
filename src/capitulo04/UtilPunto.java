package capitulo04;

import java.util.Locale;
import java.util.Scanner;

/**
 * Clase UtilPunto: define métodos estáticos para realizar operaciones útiles
 * con puntos del plano cartesiano.
 * 
 * @author Libro IIP-PRG
 * @version 2016
 */
public class UtilPunto {
	private UtilPunto() {
	} // Se oculta el constructor por defecto

	/**
	 * Devuelve un Punto cuyas coordenadas cartesianas se leen de teclado.
	 */
	public static Punto leePunto() {
		@SuppressWarnings("resource")
		Scanner tec = new Scanner(System.in).useLocale(Locale.US);
		System.out.print("Abscisa? ");
		double abs = tec.nextDouble();
		System.out.print("Ordenada? ");
		double ord = tec.nextDouble();
		return new Punto(abs, ord);
	}

	/**
	 * Devuelve un Punto cuyas coordenadas polares se leen de teclado.
	 */
	public static Punto leePuntoPolar() {
		@SuppressWarnings("resource")
		Scanner tec = new Scanner(System.in).useLocale(Locale.US);
		System.out.print("Radio? ");
		double rad = tec.nextDouble();
		System.out.print("Angulo? ");
		double ang = tec.nextDouble();
		return Punto.polaresAPunto(rad, ang);
	}

	/** Devuelve el punto medio situado entre otros dos dados. */
	public static Punto puntoMedio(Punto a, Punto b) {
		return new Punto((a.getX() + b.getX()) / 2, (a.getY() + b.getY()) / 2);
	}

	/** Devuelve un Punto resultado de la suma de otros dos dados. */
	public static Punto suma(Punto a, Punto b) {
		return new Punto(a.getX() + b.getX(), a.getY() + b.getY());
	}

	/** Devuelve un Punto resultado de la resta de otros dos dados. */
	public static Punto resta(Punto a, Punto b) {
		return new Punto(a.getX() - b.getX(), a.getY() - b.getY());
	}

	/**
	 * Devuelve un Punto con la abscisa de a incrementada en incX, y la ordenada de
	 * a incrementada en incY.
	 */
	public static Punto desplazado(Punto a, double incX, double incY) {
		Punto p = new Punto(a);
		p.mover(incX, incY);
		return p;
	}

	/** Devuelve un Punto resultado de escalar a en un factor e. */
	public static Punto escalado(Punto a, double e) {
		return new Punto(e * a.getX(), e * a.getY());
	}

	/** Devuelve un Punto resultado de girar a un ángulo alfa. */
	public static Punto rotado(Punto a, double alfa) {
		double x = a.getX(), y = a.getY();
		double r = Math.sqrt(x * x + y * y), theta = Math.atan2(y, x);
		return Punto.polaresAPunto(r, theta + alfa);
	}
}