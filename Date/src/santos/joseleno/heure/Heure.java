package santos.joseleno.heure;

import java.time.Instant;
import java.time.LocalDateTime;

public class Heure {

	public static void main(String[] args) {
		Instant present = Instant.now();
		LocalDateTime time = LocalDateTime.now();
		
		
		System.out.println("Heure:"+time.getHour() + ":"+ time.getMinute() + ":"+ time.getSecond() + ":"+ time.getNano() );
		System.out.println("Date:"+time.getDayOfMonth()+"/"+time.getMonth()+"/"+time.getYear() );
		System.out.println(present +" - "+ present.getNano() + " - "+ present.getEpochSecond());
		

	}

}
