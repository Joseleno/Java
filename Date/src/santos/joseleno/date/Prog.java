package santos.joseleno.date;

import java.time.LocalDate;

public class Prog {

	static LocalDate dateLieu;
	
	public static void imprimeDateLieu(LocalDate dateLieu) {
		System.out.println("Jour de la semaine: " + dateLieu.getDayOfWeek().name());
		System.out.println("Mois: " + dateLieu.getMonthValue());
		System.out.println("Mois: " + dateLieu.getMonth().name());
		System.out.println("Anée: " + dateLieu.getYear());
		System.out.println(dateLieu);
	}
	
	public static void main(String[] args) {

		/**
		 * Nova API DATA JAVA 8
		 * 
		 */
		dateLieu = LocalDate.now();
		imprimeDateLieu(dateLieu);
		

	}


}
