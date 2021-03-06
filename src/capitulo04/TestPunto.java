package capitulo04;

import java.util.Locale;
import java.util.Scanner;

/**
 * Clase TestPunto: clase programa que prueba la funcionalidad de la clase
 * Punto.
 * 
 * @author Libro IIP-PRG
 * @version 2016
 */
public class TestPunto {
	/** Método principal que prueba la clase Punto. */
	public static void main(String[] args) {
		System.out.println("Prueba de la clase Punto: " + "puntos de dimensión " + Punto.dimension());
		@SuppressWarnings("resource")
		Scanner tec = new Scanner(System.in).useLocale(Locale.US);
		System.out.println("Introduce las coordenadas de un punto: ");
		System.out.print("Abscisa? ");
		double abs = tec.nextDouble();
		System.out.print("Ordenada? ");
		double ord = tec.nextDouble();
		Punto p = new Punto(abs, ord);
		System.out.println(
				"Se ha creado un punto de " + p.getDim() + " dimensiones: (" + p.getX() + "," + p.getY() + ")");
		System.out.println("Distancia entre el punto y el origen de " + " coordenadas: " + p.distancia(Punto.ORIGEN));
		System.out.println("Introduce las coordenadas de otro punto:");
		System.out.print("Abscisa? ");
		abs = tec.nextDouble();
		System.out.print("Ordenada? ");
		ord = tec.nextDouble();
		Punto q = new Punto(abs, ord);
		System.out.println("Puntos creados: " + Punto.numPuntos());
		System.out.print("Distancia entre los puntos introducidos: ");
		System.out.println(p.distancia(q));
	}
}