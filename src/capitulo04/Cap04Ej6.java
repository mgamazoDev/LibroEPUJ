/**
 * Clase que implementa el ejercicio 6 del capítulo 4, del libro Empezar a Programar
 * Usando Java. Cuyo enunciado es:
 * 
 * Añadir los siguientes métodos a la clase Hora del problema 4:
 * 
 * a) Método constructor public Hora() en lugar del constructor por defecto, que inicie la Hora 
 * creada a la hora actual (Greenwich, o UTC). Se sugiere utilizar el método
 * static long currentTimeMillis() de la clase predefinida System, que devuelve el número de milisegundos
 * transcurridos desde el 1 de Enero de 1970 (UTC).
 * 
 * b) Método public int minTotales(), que devuelva el número de minutos que han transcurrido del día hasta 
 * la hora en curso. Por ejemplo, para las 07:45 debe devolver 465, y para las 17:18 debe devolver 1038.
 * 
 * c) Método public int comparar(Hora h), que devuelva un valor negativo si la hora en curso es anterior a h,
 *  0 si son iguales, y un valor positivo si h es anterior. En valor absoluto, el valor devuelto debe ser
 *  el número de minutos de diferencia que hay entre ambas horas.
 * 
 * @author marce
 * 
 */
package capitulo04;

public class Cap04Ej6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("Ver la clase Hora");


	}

}
