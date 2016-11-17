package utilpackage;

import java.time.LocalDateTime;

public class AgeCalculator {
	
	public static int toAge (int year){
			
			LocalDateTime now = LocalDateTime.now();
			int currentYear = now.getYear();
			
			int age = currentYear - year;
			
			return age;
		} 
}
