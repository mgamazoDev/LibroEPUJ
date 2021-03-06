/**
 * Clase que implementa el ejercicio 2 del capítulo 3 del libro Empezar a Programar
 * Usando Java. Cuyo enunciado es:
 * 
 * Escribir instrucciones de asignación en Java para:
 * a) Calcular en una variable s la superficie (4πr^2) de una esfera a partir
 * del valor del radio r (supóngase que es un valor positivo).
 * b) Calcular en una variable v el volumen (4/3πr^3) de una esfera a partir del
 * valor del radio (supóngase que es un valor positivo).
 * c) Calcular en una variable v el volumen de una esfera a partir del valor
 * de su superficie s (supóngase que es un valor positivo).
 */
package capitulo03;

/**
 * @author marce
 * 
 * @verskiokn 1.0
 */
public class Cap3Ej07 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		double s;
		double r = 5;
		double v;
		
		
		// Radio de la esfera
		r = 5;
		// Calcular la superficie
		s = 4 * Math.PI * Math.pow(r, 2);
		// Calcular el volumen
		v = (4/3) * Math.PI * Math.pow(r, 3);
		
		// Mostrar los resultados
		System.out.println("Radio de la esfera: " + r + " metros");
		System.out.println("Area de la esfera: " + s + " metros cuadrados");
		System.out.println("Volumen de la esfera: " + v + " metros cubicos");
		

	}

}
