/**
2 * Clase ProgramaTri: define un triángulo en el plano cartesiano,
3 * a partir de sus vértices y muestra su perímetro en la salida estándar.
4 * @author Libro IIP-PRG
5 * @version 2016
6 */

package capitulo04;

import capitulo03.Punto;

public class ProgramaTri {
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
	
		double dx = p1.x - p2.x;
		double dy = p1.y - p2.y;
		double lado12 = Math.sqrt(dx * dx + dy * dy);

		dx = p2.x - p3.x;
		dy = p2.y - p3.y;
		double lado23 = Math.sqrt(dx * dx + dy * dy);

		dx = p1.x - p3.x;
		dy = p1.y - p3.y;
		double lado13 = Math.sqrt(dx * dx + dy * dy);

		double perimetro = lado12 + lado23 + lado13;
		System.out.println("Perímetro: " + perimetro);
	}
}
