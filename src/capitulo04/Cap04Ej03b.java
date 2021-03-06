package capitulo04;

/** Clase que implementa el ejercicio 3 del capítulo 4 punto b, del libro Empezar a Programar
 * Usando Java. Cuyo enunciado es: 
 * 
 * Clase que implementa el ejercicio 3 del capítulo 4punto c, del libro Empezar a Programar
 * Usando Java. Cuyo enunciado es:
 * 
 * Para estudiar el comportamiento en ejecución de los siguientes programas se sugiere
 * utilizar la representación de registro de activación y pila de llamadas vista en el
 * capítulo.
 * 
 * b) ¿Qué se escribe en la salida estándar cuando se ejecuta el programa? Se supone la
 *  existencia de la clase Punto de la sección 4.5.
 * public class Ejemplo2 {
 * 	public static void main(String[] args) {
 * 		Punto p1 = new Punto(1.0, -1.0);
 * 		Punto p2 = new Punto();
 * 		System.out.print("Antes de la llamada ");
 * 		System.out.println("los puntos son: " + p1 + " y " + p2);
 * 		cambioPunto(p1, p2);
 * 		System.out.print("Después de la llamada ");
 * 		System.out.println("los puntos son: " + p1 +" y "+ p2);
 * 	}
 *	private static void cambioPunto(Punto a, Punto b) {
 *		Punto aux = a;
 *		a = b;
 *		b = aux; 
 *	}
 *}
*/
public class Cap04Ej03b {
	public static void main(String[] args) {
		Punto p1 = new Punto(1.0, -1.0);
		Punto p2 = new Punto();
		System.out.print("Antes de la llamada ");
		System.out.println("los puntos son: " + p1 + " y " + p2);
		cambioPunto(p1, p2);
		System.out.print("Después de la llamada ");
		System.out.println("los puntos son: " + p1 + " y " + p2);
	}

	private static void cambioPunto(Punto a, Punto b) {
		Punto aux = a;
		a = b;
		b = aux;
	}
}
