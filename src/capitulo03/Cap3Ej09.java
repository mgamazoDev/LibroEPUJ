/**
 * Clase que implementa el ejercicio 2 del capítulo 3 del libro Empezar a Programar
 * Usando Java. Cuyo enunciado es:
 * 
 * Hacer una traza del siguiente programa:
 * public class TestOperador {
 * 	public static void main(String[] args) {
 * 		int a = 12, b = 8, c = 6;
 * 		System.out.println(a + " " + b + " " + c);
 * 		a = c;
 * 		System.out.println(a + " " + b + " " + c);
 * 		c += b; 
 * 		System.out.println(a + " " + b + " " + c);
 * 		a = b + c;
 * 		System.out.println(a + " " + b + " " + c); 
 * 		a++;
 * 		b++;
 * 		System.out.println(a + " " + b + " " + c);
 * 		c = a++ + ++b;
 * 		System.out.println(a + " " + b + " " + c);
 * 	} 
 * }
 */
package capitulo03;

/**
 * @author marce
 *
 * @version 1.0
 *
 */
public class Cap3Ej09 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a = 12, b = 8, c = 6;
		System.out.println("a = " + a + " " + "b= " + b + " " + "c= "+ c);
		a = c;
		System.out.println("a = " + a + " " + "b= " + b + " " + "c= "+ c);
		c += b;
		System.out.println("a = " + a + " " + "b= " + b + " " + "c= "+ c);
		a = b + c;
		System.out.println("a = " + a + " " + "b= " + b + " " + "c= "+ c);
		a++;
		b++;
		System.out.println("a = " + a + " " + "b= " + b + " " + "c= "+ c);
		c = a++ + ++b;
		System.out.println("a = " + a + " " + "b= " + b + " " + "c= "+ c);

	}

}
