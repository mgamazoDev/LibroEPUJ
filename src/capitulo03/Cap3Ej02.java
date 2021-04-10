package capitulo03;

/**
* Clase que implementa el ejercicio 2 del capítulo 3 del libro Empezar a Programar
* Usando Java. Cuyo enunciado es:
* Escribir una instrucción en Java tal que, suponiendo que las variables x, y,
* z son de tipo double, asigne a z el valor que indica la fórmula:
* z = (1 + x² / y) / (x³ / 1 + y)
* 
* @author marce
* 
* @version 1.0
* 
*
*/
public class Cap3Ej02 {

	public static void main(String[] args) {
		
		double x = 3.0;
		double y = 5.0;
		double xE2 = x * x;
		
		
		double z;

		z = (1 + xE2 / y) / ((xE2 * x) / 1 + y);

		System.out.println("z = (1 + x² / y) / (x³ / 1 + y), es:" );
		System.out.println("z = " + z);


	}

}
