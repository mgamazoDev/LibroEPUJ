/**
 *  Clase ProgramaTri: define un triángulo en el plano cartesiano,
 *  a partir de sus vértices y muestra su perímetro en la salida estándar.
 *  @author Libro IIP-PRG
 *  @version 2016
 */
package capitulo04;

import capitulo03.Punto;

public class ProgramaTri01 {
	public static void main(String[] args) {
		Punto p1 = new Punto();
		p1.x = 2.5;
		p1.y = 3;
		Punto p2 = new Punto();
		p2.x = 2.5;
		p2.y = -1.2;
		Punto p3 = new Punto();
		p3.x = -1.5;
		p1.y = 1.4;
		System.out.println("Triángulo de vértices: ");
		System.out.println("(" + p1.x + "," + p1.y + ")");
		System.out.println("(" + p2.x + "," + p2.y + ")");
		System.out.println("(" + p3.x + "," + p3.y + ")");

		double lado12 = distancia(p1, p2);
		double lado23 = distancia(p2, p3);
		double lado13 = distancia(p1, p3);
		double perimetro = lado12 + lado23 + lado13;
		System.out.println("Perímetro: " + perimetro);
	}

	public static double distancia(Punto p, Punto q) {
		double dx = p.x - q.x;
		double dy = p.y - q.y;
		return Math.sqrt(dx * dx) + Math.sqrt(dy * dy);
	}
}