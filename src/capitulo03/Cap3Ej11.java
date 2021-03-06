/**
 * Clase que implementa el ejercicio 2 del capítulo 3 del libro Empezar a Programar
 * Usando Java. Cuyo enunciado es:
 * 
 * Determinar el valor, true o false, de cada una de las siguientes expresiones lógicas,
 * asumiendo que el valor de la variables cont y limite (de tipo int) es 10 y 20, respectivamente.
 *
 * a) (cont == 0) && (limite < 20)
 * b) (limite >= 20) || (cont < 5)
 * c) ((limite / (cont - 10)) > 7) || (limite < 20)
 * d) (limite <= 20) || ((limite / (cont - 10)) > 7) 
 * e) ((limite / (cont - 10)) > 7) && (limite < 0) 
 * f) (limite < 0) && ((limite / (cont - 10)) > 7)
 * 
 */
package capitulo03;

public class Cap3Ej11 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int cont = 10;
		int limite = 20;
		
		System.out.println((cont == 0) && (limite < 20));
		System.out.println((limite >= 20) || (cont < 5));
		// Las siguiente líne provoca una division por 0 y la detención del programa.
		//System.out.println(((limite / (cont - 10)) > 7) || (limite < 20));
		System.out.println("Divisón por cero.");
		System.out.println((limite <= 20) || ((limite / (cont - 10)) > 7) );
		System.out.println((limite < 0) && ((limite / (cont - 10)) > 7));
	}

}
