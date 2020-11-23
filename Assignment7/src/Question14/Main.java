package Question14;

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the date: ");
		String date= scanner.nextLine();
		
		System.out.println("DateConvertFormat : "+ UserMainCode.convertDateFormat(date));
		

	}

}
