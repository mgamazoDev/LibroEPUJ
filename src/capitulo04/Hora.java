package capitulo04;

/**
 * Clase Hora: representa una hora formada por horas y minutos.
 * 
 * @author Libro IIP-PRG
 * @version 2016
 */
public class Hora {

	private int horas;
	private int minutos;

	public void setHoras(int horas) {
		this.horas = horas;
	}

	public void setMinutos(int minutos) {
		this.minutos = minutos;
	}

	/** Crea una Hora con 0 horas y 0 minutos. */
	public Hora() {
		this.horas = 0;
		this.minutos = 0;
	}

	/**
	 * Crea una Hora con las horas y minutos indicados.
	 * 
	 * @param h int, las horas.
	 * @param m int, los minutos.
	 */
	public Hora(int h, int m) {
		this.horas = h;
		this.minutos = m;
	}

	/**
	 * Devuelve las horas.
	 * 
	 * @return int, las horas.
	 */
	public int getHora() {
		return this.horas;
	}

	/**
	 * Devuelve los minutos.
	 * 
	 * @return int, los minutos.
	 */
	public int getMinutos() {
		return this.minutos;
	}

	/**
	 * Comprueba si la Hora es anterior a h.
	 * 
	 * @param h Hora, la hora a comparar.
	 * @return boolean, true si la Hora es anterior a h; false en caso contrario.
	 */
	public boolean anterior(Hora h) {
		return this.horas < h.horas || (this.horas == h.horas && this.minutos < h.minutos);
	}

	/**
	 * Devuelve la Hora en el formato "hh:mm".
	 * 
	 * @return String, representación de la Hora.
	 */
	@Override
	public String toString() {
		String h = "0" + this.horas;
		h = h.substring(h.length() - 2);
		String m = "0" + this.minutos;
		m = m.substring(m.length() - 2);
		return h + ":" + m;
	}

	/**
	 * Comprueba que dos horas son iguales
	 * 
	 * @return boolean, true si las horas son iguales; false en caso contrario.
	 */
	@Override
	public boolean equals(Object obj) {
		Hora tmpHoras = (Hora) obj;
		if (horas == tmpHoras.horas && minutos == tmpHoras.minutos) {
			return true;
		} else {
			return false;
		}

	}

}