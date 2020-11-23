package Question11;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner  scanner = new Scanner(System.in);
		System.out.println("Enter the dates to find months ");
		
		String date1 = scanner.nextLine();
		String date2 = scanner.nextLine();
		
		int difference = UserMainCode.getMonthDifference(date1, date2);
		System.out.println("Difference between months "+difference);
	}

}
