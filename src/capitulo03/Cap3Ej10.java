/**
 											* Clase que implementa el ejercicio 2 del capítulo 3 del libro Empezar a Programar
 * Usando Java. Cuyo enunciado es:
 * 
 * Una empresa de transporte por carretera ha adquirido vehículos nuevos que viajan más 
 * rápido que los antiguos. Les gustaría conocer cómo afectará esto a la duración de los viajes. 
 * Supóngase que la reducción media que se consi- gue del tiempo total de viaje es del 15%. 
 * Escribir las instrucciones necesarias en Java tales que a partir de ciertos valores dados de 
 * horario de salida (horaSalida y minSalida de tipo int) y llegada antiguo (horaLlegada y 
 * minLlegada de tipo int) –siendo la salida anterior a la llegada y suponiendo horas (de 0 a 23)
 * y minutos (de 0 a 59) correctos–, para trayectos realizados en el mismo día, calcule el nuevo 
 * horario de llegada y muestre en pantalla el nuevo tiempo de viaje y la nueva hora de llegada. 
 * Un ejemplo de ejecución considerando como hora de salida 4:55 y hora de llegada 6:30 sería:
 * 
 *              Salida Estándar
 *    Duración inicial: 95 minutos (1h y 35m)
 *    Nueva hora de llegada: 6
 *    Nuevos minutos de llegada: 15
 *    Duración del viaje: 80 minutos (1h y 20m)
 */
package capitulo03;

/**
 * @author marce
 *
 */
public class Cap3Ej10 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int mSalida;
		int reduccion;
		int hLlegada;
		int mLlegada;
		int nMinLlegada;
		int calculoH;
		int calculoM;
		int hAmSalida;
		int hAmLlegada;

		hLlegada = 6;
		
		// inicializar los minutos
		mSalida = 55;		
		mLlegada = 30;
		
		// pasar las horas a minutos
		hAmSalida = 4 * 60;
		hAmLlegada = 6 * 60;
		
		
		// minutos totales del viaje con los antiguos vehiculos
		calculoM = (hAmLlegada + mLlegada) - (hAmSalida + mSalida);
		// horas totales del viaje
		calculoH = calculoM / 60;
		// minutos totales del viaje
		nMinLlegada = calculoM % 60;
		
		System.out.println("Duración inicial: " + calculoM + " minutos " + "(" + calculoH + " h y " + nMinLlegada + "m)");
		System.out.println("Nueva hora de llegada: " + hLlegada);
		System.out.println("Nuevos minutos de llegada: " + mLlegada);
		
		reduccion = (int) (calculoM * (0.15));
		// minutos totales del viaje con los nuevos vehiculos
		calculoM -= reduccion;
		// horas totales del viaje
		calculoH = calculoM / 60;
		// minutos totales del viaje
		nMinLlegada = calculoM % 60;
		
		System.out.println("Duración del viaje: " + calculoM + " minutos " + "(" + calculoH + " h y " + nMinLlegada + "m)");
		
	}

}
