package capitulo04;

/**
 * Clase Punto: define un punto en el plano cartesiano, determinado por sus
 * coordenadas x e y. Contabiliza el número de puntos creados.
 * 
 * @author Libro IIP-PRG
 * @version 2016
 */
public class Punto {
	/** Origen de coordenadas: (0.0, 0.0) */
	public static final Punto ORIGEN = new Punto();
	/** Dimensión de los Puntos de la clase: 2, abscisa y ordenada. */
	public static final int DIMENSION = 2;
	private static int contadorPuntos = 0;
	private double x;
	private double y;

	/** Crea un Punto con coordenadas (0.0, 0.0). */
	public Punto() {
		contadorPuntos++;
	}

	/** Crea un Punto con coordenadas (abs, ord). */
	public Punto(double abs, double ord) {
		this.x = abs;
		this.y = ord;
		contadorPuntos++;
	}

	/** Crea un Punto copia de p. */
	public Punto(Punto p) {
		this(p.x, p.y);
	}

	/** Devuelve la coordenada x del Punto. */
	public double getX() {
		return this.x;
	}

	/** Devuelve la coordenada y del Punto. */
	public double getY() {
		return this.y;
	}

	/** Devuelve el número de coordenadas del Punto. */
	public int getDim() {
		return DIMENSION;
	}

	/** Actualiza la coordenada x del Punto. */
	public void setX(double nuevaX) {
		this.x = nuevaX;
	}

	/** Actualiza la coordenada y del Punto. */
	public void setY(double nuevaY) {
		this.y = nuevaY;
	}

	/**
	 * Incrementa la abscisa del Punto en incX y la ordenada del Punto en incY.
	 */
	public void mover(double incX, double incY) {
		this.x += incX;
		this.y += incY;
	}

	/**
	 * Devuelve un valor entero aleatorio en el rango [0..2 * d], siendo d la
	 * distancia del Punto al origen.
	 */
	private int aleatorio() {
		return (int) (Math.random() * (2 * this.distancia(ORIGEN) + 1));
	}

	/** Mueve el Punto a unas coordenadas aleatorias. */
	public void moverAleat() {
		this.x += this.aleatorio();
		this.y += this.aleatorio();
	}

	/** Devuelve la distancia del Punto a p. */
	public double distancia(Punto p) {
		double abs = p.x - this.x;
		double ord = p.y - this.y;
		return Math.sqrt(abs * abs + ord * ord);
	}

	/**
	 * Devuelve un Punto cuya distancia al origen es r, y con ángulo a respecto al
	 * eje X.
	 */
	public static Punto polaresAPunto(double a, double r) {
		return new Punto(r * Math.cos(a), r * Math.sin(a));
	}

	/** Devuelve la dimensión de los Puntos de la clase. */
	public static int dimension() {
		return DIMENSION;
	}

	/**
	 * Devuelve el número de Puntos creados a lo largo de la ejecución.
	 */
	public static int numPuntos() {
		return contadorPuntos;
	}
}
