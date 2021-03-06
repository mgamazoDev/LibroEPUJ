/**
 * Clase que implementa el ejercicio 2 del capítulo 3 del libro Empezar a Programar
 * Usando Java. Cuyo enunciado es:
 * 
 * Escribir una instrucción de asignación en Java tal que a partir de una cantidad (positiva) 
 * en pesetas (pesetas de tipo int) obtenga su equivalente en euros (euros de tipo double), 
 * sabiendo que 1 euro son 166.386 pesetas.
 */
package capitulo03;

/**
 * @author marce
 *
 * @version 1.0
 */
public class Cap3Ej08 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int ptas = 100;
		double euros = 166.386;
		double conv;
		
		conv = ptas / euros;
		
		System.out.println(ptas + " pesetas, son " + String.format("%.2f", conv) + " €");
		

	}

}
