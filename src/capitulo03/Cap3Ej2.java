package capitulo03;

import java.util.InputMismatchException;
import java.util.Scanner;

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
public class Cap3Ej2 {

	//private static Scanner sc = new Scanner(System.in); 
	
	public static void main(String[] args) {
		
		int x = 1;
		int y = 1;
		int z;// = 1;
		try {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca la variable x: ");
		x = sc.nextInt();
		
		System.out.println("Introduzca la variable y: ");
		y = sc.nextInt();
		
		z = 1 + (x * x);

		z = (1 + (x * x) / y) / ((x * x * x)/ 1 + y);
		
		System.out.println("z = (1 + x² / y) / (x³ / 1 + y), es:" );
		System.out.println("z = " + z);
		
		sc.close();
		} catch(InputMismatchException e) {
			System.out.println("Error " + e);
		} 
		
	}

}
