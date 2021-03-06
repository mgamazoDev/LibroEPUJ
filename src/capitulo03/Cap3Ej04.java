/**
 * Clase que implementa el ejercicio 2 del capítulo 3 del libro Empezar a Programar
 * Usando Java. Cuyo enunciado es:
 * Dadas las siguientes expresiones, en donde a y b son variables enteras que toman 
 * los siguientes valores a = 5 y b = 3, indicar:
 * a) El resultado al que se evalúan actualmente.
 * b) La expresión modificada para que el resultado sea el que se indica como correcto.
 * 
 * No 	Expresión				Resultado correcto
 * 1	3 / 4 * (a * a - b)		16.5
 * 2	a / b * 1000 + 304		1970.6666666666667
 * 3	(100 / a + b / 2) * 5	107.5   
 */
package capitulo03;

/**
 * @author marce
 *
 *
 *@version 1.0
 */
public class Cap3Ej04 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int a = 5;
		int b = 3;
		
		double exp1;
		double exp2;
		double exp3;
		
		System.out.println("Los valores actuales de a = " + a + ", y de b = " + b);
		
		exp1 = (double) 3 / (double) 4 * (a * a - b);
		System.out.println("La expresión 3 / 4 * (a * a - b) para valga 16.5 es:  (double) 3 / (double) 4 * (a * a - b)");
		System.out.println("Comprbación: " + exp1);
		
		exp2 = (double) a / (double) b * 1000 + 304;
		System.out.println("La expresión a / b * 1000 + 304 para valga 1970.6666666666667 es: (double) a / (double) b * 1000 + 304");
		System.out.println("Comprobación: " + exp2);
		
		exp3 = (100 / (double) a + (double) b / 2) * 5;
		System.out.println("La expresión (100 / a + b / 2) * 5 para valga 107.5 es: (100 / (double) a + (double) b / 2) * 5");
		System.out.println("Comprobación: " + exp3);

	}

}
