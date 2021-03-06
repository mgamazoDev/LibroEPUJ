/**
 * Clase que implementa el ejercicio 2 del capítulo 3 del libro Empezar a Programar
 * Usando Java. Cuyo enunciado es:
 * 
 * Considerando la definición de la clase Punto con los atributos declarados como públicos,
 * 1) ¿Qué se escribe en la pantalla cuando se ejecuta el programa siguiente?
 * 
 * public class XPunto {
 * 	public static void main(String[] args) {
 * 		Punto p1 = new Punto(), p2 = new Punto(), p3 = new Punto();
 * 		p1.x = 1.0;
 * 		p1.y = 1.0;
 * 
 * 		p2 = p1;
 * 		p2.x = 2.0 * p1.x;
 * 		p2.y = -2.0 * p1.y;
 * 		p3 = p1;
 * 		
 * 		System.out.println("(" + p2.x + "," + p2.y + ")");
 * 		System.out.println("(" + p3.x + "," + p3.y + ")");
 * 	}
 * }
 * 
 * 2) ¿Qué sucedería si se usa la clase Punto con los atributos declarados privados?
 * El programa no se ejecutaría.
 * 
 * 3) Simplificar el código del programa anterior eliminando del mismo todas aquellas 
 * instrucciones que se consideren irrelevantes, pero manteniendo la misma salida.
 * 
 * 4) ¿Qué se escribe en la pantalla cuando se ejecuta el programa siguiente?
 * public class XPunto2 {
 * 	public static void main(String[] args) {
 * 		Punto p1 = new Punto(), p2 = new Punto(), p3 = new Punto();
 * 		p1.x = 1.0;
 * 		p1.y = 1.0;
 * 		
 * 		p2 = p1;
 * 		p2.x = 2.0 * p1.x;
 * 		p2.y = -2.0 * p1.y;
 * 
 * 		p3.x = p1.x;
 * 		p3.y = p1.y;
 * 		
 * 		System.out.println(p1 == p2);
 * 		System.out.println(p1 == p3);
 * 		System.out.println(p2 == p3);
 * 	}
 * }
 */
package capitulo03;

import capitulo02.Punto;

/**
 * @author marce
 *
 */
public class Cap3Ej13 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Punto p1 = new Punto(), p2 = new Punto(), p3 = new Punto(); // punto 3) del
		// ejercicio
		Punto p1 = new Punto(), p2 = new Punto();
		p1.x = (int) 1.0;
		p1.y = (int) 1.0;

		p2 = p1; // punto 3) del ejercicio
		p2.x = (int) 2.0 * p1.x;
		p2.y = (int) -2.0 * p1.y;
		// p3 = p1; // punto 3) del ejercicio

		System.out.println("Puntos 1 y 2 del ejercicio");
		System.out.println("(" + p2.x + "," + p2.y + ")");
		System.out.println("(" + p1.x + "," + p1.y + ")");

		System.out.println("punto 4 del ejercicio");
		// redefino las variables por estar declaradas más arriba
		// Punto p1 = new Punto(), p2 = new Punto(), p3 = new Punto();
		Punto p3 = new Punto();
		p1.x = (int) 1.0;
		p1.y = (int) 1.0;

		p2 = p1;
		p2.x = (int) 2.0 * p1.x;
		p2.y = (int) -2.0 * p1.y;

		p3.x = p1.x;
		p3.y = p1.y;

		System.out.println(p1 == p2);
		System.out.println(p1 == p3);
		System.out.println(p2 == p3);

	}

}
