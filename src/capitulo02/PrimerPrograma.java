package capitulo02;

/**
 * 2 * Clase PrimerPrograma: dibuja en una cierta pizarra un circulo y dos 3 *
 * rectangulos de características dadas; para ello, usa las clases 4 * Pizarra,
 * Circulo y Rectangulo. 5 * @author Libro IIP-PRG 6 * @version 2016 7
 */
public class PrimerPrograma {
	public static void main(String[] args) {
		// Crear la Pizarra miPizarra, de título "ESPACIO DIBUJO" y
		// tamaño 300 x 300 píxeles
		Pizarra miPizarra = new Pizarra("ESPACIO DIBUJO", 300, 300);
		// Crear un Circulo c1 de radio 50, amarillo y con centro
		// en (100, 100)
		Circulo c1 = new Circulo(50, "amarillo", 100, 100);
		// Crear un Rectangulo r1 30 x 30, azul y con centro
		// en (125, 125)
		//Rectangulo r1 = new Rectangulo(30, 30, "azul", 125, 125);
		// Crear un Rectangulo r2 100 x 10, rojo y con centro
		// en (50, 155)
		//Rectangulo r2 = new Rectangulo(100, 10, "rojo", 50, 155);

		// Añadir c1 a miPizarra, dibujándolo
		miPizarra.add(c1);
		// Añadir r1 a miPizarra, dibujándolo
		//miPizarra.add(r1);
		// Añadir r2 a miPizarra, dibujándolo
		//miPizarra.add(r2);
	}
}
