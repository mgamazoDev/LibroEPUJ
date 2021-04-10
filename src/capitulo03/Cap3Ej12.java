/**
 * Clase que implementa el ejercicio 2 del capítulo 3 del libro Empezar a Programar
 * Usando Java. Cuyo enunciado es:
 * 
 * Si se ejecuta la siguiente secuencia de instrucciones, ¿se produce una división por cero?
 * 
 *  int j = -2;
 *  boolean b = (j > 0) && (1 / (j + 2) > 10);
 */
package capitulo03;

/**
 * @author marce
 *
 */
public class Cap3Ej12 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 int j = -2;
         boolean b = (j > 0) && (1 / (j + 2) > 10);
         
         // no se produce una división por 0. Produce false
         System.out.println("b = " + b);
		

	}

}
