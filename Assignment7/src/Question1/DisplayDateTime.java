package Question1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DisplayDateTime {

	
	public static void main(String[] args) {
		
		Date date = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss"); 
		
		System.out.println("Date and Time in the format:  "+dateFormat.format(date));
	}
}
