package capitulo04;

import java.util.Scanner;

/**
 * Clase PruebaMetodos: clase programa que permite comparar y escribir en la
 * salida estándar unas horas que se leen de teclado.
 * 
 * @author Libro IIP-PRG
 * @version 2016
 */
public class PruebaMetodos {
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner tec = new Scanner(System.in);
		System.out.println("Introduce una hora: hora minutos");
		int h1 = tec.nextInt(), m1 = tec.nextInt();
		System.out.println("Introduce otra hora: hora minutos");
		int h2 = tec.nextInt(), m2 = tec.nextInt();
		String s1 = displayHora(h1, m1);
		String s2 = displayHora(h2, m2);
		System.out.print(s1 + " es anterior a " + s2 + "? ");
		System.out.println(anterior(h1, m1, h2, m2));
	}

	/**
	 * * Devuelve true sii la hora dada por h1 m1 (h y min, respectivamente) es
	 * anterior a la dada por h2 m2.
	 */
	public static boolean anterior(int h1, int m1, int h2, int m2) {
		return h1 < h2 || (h1 == h2 && m1 < m2);
	}

	/** Devuelve un String con la hora y minutos en el formato "hh:mm". */
	public static String displayHora(int hora, int minutos) {
		String h = "0" + hora;
		h = h.substring(h.length() - 2);
		String m = "0" + minutos;
		m = m.substring(m.length() - 2);
		return h + ":" + m;
	}
}