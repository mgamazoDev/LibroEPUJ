package capitulo04;

/**
 * Clase que implementa el ejercicio 3 del capítulo 4 pun to c, del libro
 * Empezar a Programar Usando Java. Cuyo enunciado es:
 * 
 * c) Escribir de nuevo el método cambioPunto(Punto, Punto) para que en el
 * programa anterior se efectúe realmente el intercambio de los valores de los
 * atributos de los dos objetos Punto que se reciben como parámetros.
 */
public class Cap04Ej03c {

	public static void main(String[] args) {

		Punto p1 = new Punto(1.0, -1.0);
		Punto p2 = new Punto();

		System.out.print("Antes de la llamada ");
		System.out.println("los puntos son: " + p1 + " y " + p2);
		cambioPunto(p1, p2);
		System.out.print("Después de la llamada ");
		System.out.println("los puntos son: " + p1 + " y " + p2);
	}

	public static void cambioPunto(Punto a, Punto b) {
		Punto aux = a;
		a = b;
		b = aux;
	}
}
