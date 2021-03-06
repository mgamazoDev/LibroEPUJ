package capitulo04;

/** Clase que implementa el ejercicio 3 del capítulo 4 punto a, del libro Empezar a Programar
  * Usando Java. Cuyo enunciado es:
  * 
  * Para estudiar el comportamiento en ejecución de los siguientes programas se sugiere
  * utilizar la representación de registro de activación y pila de llamadas vista en el
  * capítulo.
  * 
  * a) ¿Qué escribe en la salida estándar la ejecución del programa?
  * 
  * public class Ejemplo {
  * 	public static void cambio(int j, int k) {
  * 		int aux = j;
  *			j = k;
  *			k = aux;
  *			System.out.println("Dentro: " + j + " " + k);
  *		}
  *
  *		public static void inc(int j, int k) {
  *			j++;
  *			k++;
  *			System.out.println("Dentro: " + j + " " + k);
  *		}
  *		
  *		public static void main(String[] args) {
  *			int j = 1335;
  *			int k = 3672;
  *			System.out.println("Antes: " + j + " " + k);
  *			cambio(j, k);
  *			inc(k, j);
  *			System.out.println("Después: " + j + " " + k);
  *		}
  * }
*/	
public class Cap04Ej03a {
	public static void cambio(int j, int k) {
		int aux = j;
		j = k;
		k = aux;
		System.out.println("Dentro: " + j + " " + k);
	}

	public static void inc(int j, int k) {
		j++;
		k++;
		System.out.println("Dentro: " + j + " " + k);
	}

	public static void main(String[] args) {
		int j = 1335;
		int k = 3672;
		System.out.println("Antes: " + j + " " + k);
		cambio(j, k);
		inc(k, j);
		System.out.println("Después: " + j + " " + k);
	}
}
