/**
 * Clase que implementa el ejercicio 2 del capítulo 3 del libro Empezar a Programar
 * Usando Java. Cuyo enunciado es:
 * Escribe las instrucciones necesarias para obtener el dígito que representa las centenas 
 * en un número entero de más de 3 cifras.
 * 
 * @version 1.0
 */
package capitulo03;

/**
 * @author marce
 *
 */
public class Cap3Ej03 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int n = 1234;
		int millar = n / 1000;
		int centena = (n - (millar * 1000 )) / 100;
		// Para descomponer un número totalmente descomentar las siguientes 2 lineas
		//int decena = (n - (millar * 1000 + centena * 100)) / 10;
		//int unidad = n - (millar * 1000 + centena * 100 + decena * 10);
		
		System.out.println("El número de las centenas es: " + centena);
		

	}

}
