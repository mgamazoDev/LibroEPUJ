package capitulo02;

public class Cuadrado {
	private double lado;
    private String color;
    private double centroX;
    private double centroY;
	//private double perimetro;
	//private double area;
	//private int centroY;
	private double area;
	private double perimetro;
	
    /** Crea un Cuadrado de lado 50, negro y centro en (100, 100). */
    public Cuadrado() {  }

	/** Crea un Cuadrado de lado l, color c y centro en (px, py). */
	public Cuadrado(double l, String c, int px, int py) {
		
	}

	/** Devuelve el lado del Cuadrado. */
    public double getLado() {  
    	return lado;
    }

	/** Devuelve el color del Cuadrado. */
    public String getColor() { 
    	return color;
    }

	/** Devuelve el centro del Cuadrado. */
    public int getCentroX() {  
    	return (int) centroX;
    }

	/** Devuelve el centro del Cuadrado. */
    public int getCentroY() {  
    	return (int) centroY;
    }

	/** Actualiza el lado del Cuadrado a nuevoLado. */
    public void setLado(double nuevoLado) {  }

	/** Actualiza el color del Cuadrado a nuevoColor. */
    public void setColor(String nuevoColor) {  }

	/** Actualiza el centro del Cuadrado. */
    public void setCentro(int px, int py) {  }

	/** Desplaza el centro del Cuadrado a la derecha 10 unidades. */
    public void aLaDerecha() {  }

	/** Incrementa un 30% el lado del Cuadrado. */
    public void crece() {  }

	/** Decrementa un 30% el lado del Cuadrado. */
    public void decrece() {  }

	/** Devuelve el área del Cuadrado. */
    public double area() { 
    	return area;
    }

	/** Devuelve el perímetro del Cuadrado. */
    public double perimetro() {  
    	return perimetro;
    }

	/** Devuelve un String con las componentes del Cuadrado en el
     *  formato: Cuadrado de lado l, color c y centro (x, y). */
    public String toString() {  
    	return "Cuadrado de lado l, color c y centro (x, y)";
    }
}
