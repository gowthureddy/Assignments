package Question1And2;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * In the previous program remove the try{}catch(){} block surrounding the sleep 
 * method and try to execute the code. What is your observation
 * @author kiran
 *
 */
/*	If we try to remove the try catch block it requires to handle unexpected type  */
public class ThreadServiceQ2 {

	public static void main(String[] args) throws InterruptedException  {

		Thread t1 = new Thread("T1");
		t1.setName("MyThread");
		System.out.println("Name of thread: " + t1.getName());

		Date date = null;
		SimpleDateFormat simpDate = null;

		t1.start();
		date = new Date();
		simpDate = new SimpleDateFormat("dd/MMMM/yyyy hh:mm:s");
		System.out.println("Current time: " + simpDate.format(date));
		t1.sleep(1000);
		System.out.println("Current time: " + simpDate.format(date));

	}
}
