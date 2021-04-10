package capitulo02;

//import java.awt.Color;
import java.awt.Container;
//import java.awt.Graphics;
import javax.swing.JFrame;
//import javax.swing.JPanel;

/**
 * Clase Pizarra: define una pizarra de determinados tamaño y título, en la que
 * se pueden dibujar objetos de tipo Circulo y Rectangulo.
 * 
 * @author Libro IIP-PRG
 * @version 2016
 */
@SuppressWarnings("serial")
public class Pizarra extends JFrame {

	public Pizarra(String t, int ancho, int alto) {
		super(t);
		setSize(ancho, alto);
		setContentPane(initPanel());
		setVisible(true);
	}

	private Container initPanel() {
		// TODO Auto-generated method stub
		return null;
	}

	public void add(Circulo c1) {
		// TODO Auto-generated method stub
		
	}

}