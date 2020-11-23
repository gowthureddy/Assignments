package Question6;

import java.time.Month;
import java.util.Scanner;

import Question5.NumberOfDays;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int year = scanner.nextInt();
		int month = scanner.nextInt();
		
		Month month1 = Month.of(month+1);
		int days = UserMainCode.getNumberOfDays(year, month);
		System.out.println(days);

	}

}
