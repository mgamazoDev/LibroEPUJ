/**
  * Clase que implementa el ejercicio 4 del capítulo 4, del libro Empezar a Programar
  * Usando Java. Cuyo enunciado es:
  * 
  * Se tiene definida la clase Hora que se muestra en la figura 4.14.
  * Reescribir el código de la figura 4.7 a partir de la línea 18 utilizando únicamente métodos de
  * la clase Hora.
  * 
  * Figura 4.7:
  * 
  * public class PruebaMetodos {
  * 	public static void main(String[] args) {
  * 		Scanner tec = new Scanner(System.in);
  * 		
  * 		System.out.println("Introduce una hora: hora minutos");
  * 		int h1 = tec.nextInt(), m1 = tec.nextInt();
  * 		
  * 		System.out.println("Introduce otra hora: hora minutos");
  * 		int h2 = tec.nextInt(), m2 = tec.nextInt();
  * 		// a partir de aquí hay que modificar el codigo.
  * 		String s1 = displayHora(h1, m1);
  * 		String s2 = displayHora(h2, m2);
  * 		
  * 		System.out.print(s1 + " es anterior a " + s2 + "? ");
  * 		System.out.println(anterior(h1, m1, h2, m2));
  * 	}
  * 	
  * 	public static boolean anterior(int h1, int m1, int h2, int m2) {
  * 		return h1 < h2 || (h1 == h2 && m1 < m2);
  * 	}
  * 
  * 	public static String displayHora(int hora, int minutos) {
  * 		String h = "0" + hora; h = h.substring(h.length() - 2);
  * 		String m = "0" + minutos; m = m.substring(m.length() - 2);
  * 		return h + ":" + m;
  * 	}
  * }
 */
package capitulo04;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;
//import java.util.Scanner;

/**
 * @author marce
 *
 */
public class Cap04Ej04 {
	
	// Hora dameHora = new Hora();
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int h1;
		int m1;
		int h2;
		int m2;

		try {
			@SuppressWarnings("resource")
			Scanner tec = new Scanner(System.in);

			System.out.println("Introduce una hora: hora minutos");
			h1 = tec.nextInt();
			m1 = tec.nextInt();

			@SuppressWarnings("resource")
			Scanner tec1 = new Scanner(System.in);

			System.out.println("Introduce otra hora: hora minutos");
			h2 = tec1.nextInt();
			m2 = tec1.nextInt();

			Hora dameHora1 = new Hora(h1, m1);
			Hora dameHora2 = new Hora(h2, m2);

			System.out.println(dameHora1.toString());
			System.out.println(dameHora2.toString());

			if (dameHora1.anterior(dameHora1)) {
				System.out.println(dameHora1 + " es mayor que " + dameHora2);
			} else {
				System.out.println(dameHora2 + " es mayor que " + dameHora1);
			}
			

		} catch (NoSuchElementException e) {
			System.out.println("Error: " + e + "\n" + errorScanner());
		}

	}

	public static String errorScanner() throws InputMismatchException {
		String msg = "Error Scanner: no coincide con la expresión regular <i>Integer</i>, o está fuera de rango.";
		return msg;
	}

}
