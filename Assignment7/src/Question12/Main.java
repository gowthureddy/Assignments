package Question12;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner  scanner = new Scanner(System.in);
		
		System.out.println("Enter Ip Address");
		String string = scanner.nextLine();
		
		int result = UserMainCode.ipValidator(string);
		if(result==1) {
			System.out.println("Valid");
		}
		else {
			System.out.println("InValid");
		}
	}

}
