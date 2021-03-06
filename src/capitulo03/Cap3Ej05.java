/**
 * Clase que implementa el ejercicio 2 del capítulo 3 del libro Empezar a Programar
 * Usando Java. Cuyo enunciado es:
 * 
 * Escribir una instrucción de asignación en Java tal que a partir de una temperatura
 * en grados Celsius (celsius de tipo double) obtenga su equivalente en grados Fahrenheit
 * (fahrenheit de tipo double), aplicando la fórmula F = (9/5) ∗ C + 32.
 */
package capitulo03;

/**
 * @author marce
 *
 *@version 1.0
 */
public class Cap3Ej05 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		double celsius = 24.5;
		double farenheit;
		
		farenheit = (9 / 5) * celsius + 32;
		
		System.out.println(String.format("%.2f",celsius) + " grados Celsius son "
				+ String.format("%.2f",farenheit) + " grados Farenheit");
	}

}
