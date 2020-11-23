package Question5;

import java.time.Month;
import java.util.Scanner;

public class DaysMainClass {

	public static void main(String[] args) {
		
			Scanner scanner = new Scanner(System.in);
			int year = scanner.nextInt();
			int month = scanner.nextInt();
			
			NumberOfDays ofDays = new NumberOfDays();
			
			Month month1 = Month.of(month+1);
			int days = ofDays.getDays(year, month);
			System.out.println(month1 +" :"+ days);
	}
	
}

