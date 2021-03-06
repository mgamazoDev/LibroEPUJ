package capitulo04;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

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

	/** Devuelve la hora actual del sistema. */
	public Hora() {
		//this.horas = 0;
		//this.minutos = 0;
		// modificado en el ejercico 6 del capitulo 4
		long fechaTiempoActual = System.currentTimeMillis();
		Date currentDate = new Date(fechaTiempoActual);
		DateFormat df = new SimpleDateFormat("HH:mm:ss");
		System.out.print(df.format(currentDate));
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
	 * Devuelva el número de minutos que han transcurrido del día hasta la hora en curso. 
	 * Por ejemplo, para las 07:45 debe devolver 465, y para las 17:18 debe devolver 1038. 
	 * @return
	 */
	public int minTotales() {
	
		long miliSegundos = System.currentTimeMillis();
		
		return minutos = (int) ((miliSegundos / (1000*60)) % 60);
	}
	
	/**
	 * Devuelve alor negativo si la hora en curso es anterior a h, 0 si son iguales, 
	 * y un valor positivo si h es anterior.
	 * @param h
	 * @return valor negativo si la hora en curso es anterior a h,
	 * 		   0 si son iguales, y un valor positivo si h es anterior.
	 */
	
	public int comparar(Hora h) {
		
		// Método creado por indicación del ejercicio 6 apartado c.
		
		long miliSegundos = System.currentTimeMillis();
		
		int hora = (int) ((miliSegundos / (1000 * 60 * 60)) % 24);
		
		this.setHoras(hora);
		
		if(h.equals(hora)) {
			return 0;
		} else if (h.anterior(h)) {
			return -1;
		} else {
			return 1;
		}
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