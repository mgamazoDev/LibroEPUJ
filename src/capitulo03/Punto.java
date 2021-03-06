/**
  *  Clase Punto: define puntos en un espacio bidimensional entero
  *  con la funcionalidad que se indica a continuacion.
  *  
  *  Clase que implementa el ejercicio 2 del capítulo 3 del libro Empezar a Programar
  * Usando Java. Cuyo enunciado es:
  * 
  * Modificar la clase Punto del texto para poder determinar:
  * El número de objetos de puntos que se han creado utilizando el constructor sin argumentos.
  * El número de objetos de puntos que se han creado utilizando el constructor con argumentos.
  * 
  *  @author marce
  *  @version 1.0
  */
package capitulo03;

public class Punto {
	// abscisa del punto
	public double x;
	// ordenada del punto
	public double y;
	
	
	private static int contadorArgs;
	private static  int contadorSinArgs;

	/** Crea un Punto (abs, ord). */
	public Punto(int abs, int ord) {
		x = abs;
		y = ord;
	}

	/** Crea un punto (0, 0). */
	public Punto() {
		this(0, 0);
	}
	
	/** Devuelve el número de puntos creados por la clase con argumentos */
	public int ptosConArg() {
		return Punto.contadorArgs;
	}

	/** Devuelve el número de puntos creados por la clase sin argumentos */
	public int ptosSinArg() {
		return Punto.contadorSinArgs;
	}
	
	/** Devuelve la abscisa del Punto. */
	public double getX() {
		return x;
	}

	/** Devuelve la ordenada del Punto. */
	public double getY() {
		return y;
	}

	/** Actualiza la abscisa del Punto a nuevaX. */
	public void setX(int nuevaX) {
		x = nuevaX;
	}

	/** Actualiza la ordenada del Punto a nuevaY. */
	public void setY(int nuevaY) {
		y = nuevaY;
	}

	/** Actualiza las cooordenadas del Punto a nuevaX y nuevaY. */
	public void asignar(int nuevaX, int nuevaY) {
		x = nuevaX;
		y = nuevaY;
	}

	/** Devuelve la distancia del Punto al origen. */
	public double distOrigen() {
		return Math.sqrt(x * x + y * y);
	}

	/**
	 * Devuelve un String con las coordenadas del punto en el formato matemático
	 * habitual: (abscisa, ordenada).
	 */
	public String toString() {
		return "(" + x + ", " + y + ")";
	}
}
