/**
 * Clase que implementa el ejercicio 2 del capítulo 3 del libro Empezar a Programar
 * Usando Java. Cuyo enunciado es:
 * 
 * Escribir una instrucción de asignación en Java tal que a partir de una temperatura 
 * en grados Fahrenheit (fahrenheit de tipo double) obtenga su equivalente en grados 
 * Celsius (celsius de tipo double), aplicando la fórmula C = (5/9) * (F−32).
 */
package capitulo03;

/**
 * @author marce
 *
 * @version 1.0
 */
public class Cap3Ej06 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		double F = 24.5;
		double C;
		
		C = ((double) 5 / (double) 9) * (F - 32);
		
		System.out.println(F + " grados Farenheit son " + String.format("%.2f", C) +  " grados Celsius.");

	}

}
