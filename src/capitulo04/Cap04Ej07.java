/**
 * Clase que implementa el ejercicio 6 del capítulo 4, del libro Empezar a Programar
 * Usando Java. Cuyo enunciado es:
 * 
 * Escribir una Clase Programa que emplee la clase Hora con los métodos del ejercicio previo
 * y que en su main escriba la hora actual, pida dos horas al usuario y las escriba en la salida
 * mostrando además la diferencia en minutos entre ellas.
 * 
 * @author marce mgamazo.dev@gmail.com
 */
package capitulo04;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Cap04Ej07 {

	/**
	 * @param args
	 * 
	 */
	public static void main(String[] args) {
		
		int h1;
		int m1;
		int h2;
		int m2;
		int minutos1;
		int minutos2;
		
		System.out.print("Hora actual: " );
		@SuppressWarnings("unused")
		Hora horaActual = new Hora();
		
		System.out.println();

		try {
			@SuppressWarnings("resource")
			Scanner tec = new Scanner(System.in);

			System.out.println("Introduce una hora: hora minutos");
			h1 = tec.nextInt();
			m1 = tec.nextInt();
			minutos1 = horasAMinutos(h1) + m1;
			
			@SuppressWarnings("resource")
			Scanner tec1 = new Scanner(System.in);

			System.out.println("Introduce otra hora: hora minutos");
			h2 = tec1.nextInt();
			m2 = tec1.nextInt();
			minutos2 = horasAMinutos(h2) + m2;

			Hora dameHora1 = new Hora(h1, m1);
			Hora dameHora2 = new Hora(h2, m2);

			System.out.println("La primera hora introducida es: " + dameHora1.toString());
			System.out.println("La segunda hora introducida es: " + dameHora2.toString());
			
			// mostrar los minutos entre las fechas
			if(minutos1 > minutos2) {
				System.out.println("La diferencia en minutos: " + (minutos1 - minutos2) + " minutos");
			} else {
				System.out.println("La diferencia en minutos: " + (minutos2 - minutos1)+ " minutos");
			}
			
		} catch (NoSuchElementException e) {
			System.out.println("Error: " + e + "\n" + errorScanner());
		}
	} 

	public static String errorScanner() throws InputMismatchException {
		String msg = "Error Scanner: no coincide con la expresión regular <i>Integer</i>, o está fuera de rango.";
		return msg;
	}
	
	public static int horasAMinutos(int h) {
		return h * 60;
	}
}
