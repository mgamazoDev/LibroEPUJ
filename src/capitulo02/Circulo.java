package capitulo02;

/**
 * 2 * Clase Circulo: define un círculo de un determinado radio, color y 3 *
 * posición de su centro, con la funcionalidad que aparece a continuación. 4
 * * @author Libro IIP-PRG 5 * @version 2016 6
 */
public class Circulo {
	private double radio;
	private String color;
	private int centroX, centroY;

	/** Crea un Circulo de radio r, color c y centro en (px, py). */
	public Circulo(double r, String c, int px, int py) {
		radio = r;
		color = c;
		centroX = px;
		centroY = py;
	}

	/** Crea un Circulo de radio 50, negro y centro en (100, 100). */
	public Circulo() {
		radio = 50;
		color = "negro";
		centroX = 100;
		centroY = 100;
	}

	/** Devuelve el radio del Circulo. */
	public double getRadio() {
		return radio;
	}

	/** Devuelve el color del Circulo. */
	public String getColor() {
		return color;
	}

	/** Devuelve la abscisa del centro del Circulo. */
	public int getCentroX() {
		return centroX;
	}

	/** Devuelve la ordenada del centro del Circulo. */
	public int getCentroY() {
		return centroY;
	}

	/** Actualiza el radio del Circulo a nuevoRadio. */
	public void setRadio(double nuevoRadio) {
		radio = nuevoRadio;
	}

	/** Actualiza el color del Circulo a nuevoColor. */
	public void setColor(String nuevoColor) {
		color = nuevoColor;
	}

	/** Actualiza el centro del Circulo a (nuevoCentroX, nuevoCentroY). */
	public void setCentro(int nuevoCentroX, int nuevoCentroY) {
		centroX = nuevoCentroX;
		centroY = nuevoCentroY;
	}

	/** Desplaza el centro del Circulo a la derecha 10 unidades. */
	public void aLaDerecha() {
		centroX = centroX + 10;
	}

	/** Incrementa un 30% el radio del Circulo. */
	public void crece() {
		radio = radio * 1.3;
	}

	/** Decrementa un 30% el radio del Circulo. */
	public void decrece() {
		radio = radio / 1.3;
	}

	/** Devuelve el área del Circulo. */
	public double area() {
		return 3.14 * radio * radio;
	}

	/** Devuelve el perímetro del Circulo. */
	public double perimetro() {
		return 2 * 3.14 * radio;
	}

	/**
	 * Devuelve un String con las componentes del Circulo en el siguiente formato:
	 * Circulo de radio r, color c y centro (x, y).
	 */
	public String toString() {
		return "Circulo de radio " + radio + ", color " + color + " y centro (" + centroX + ", " + centroY + ")";
	}
}