package Question7;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a string");
		String string = scanner.nextLine();
		
		int result = UserMainCode.checkCharacters(string);
		if(result == 1) {
			System.out.println("Valid");
		}
		else {
			System.out.println("InValid");
		}
	}

}
