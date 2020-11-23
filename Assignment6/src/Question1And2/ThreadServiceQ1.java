package Question1And2;


/**
 * 
 * Write a program to assign the current thread to t1. Change the name of the thread to MyThread. 
 * Display the changed name of the thread. 
 * Also it should display the current time. Put the thread to sleep for 10 seconds and display the time again. 
 * 
 * 
 */

import java.text.SimpleDateFormat;
import java.util.Date;

public class ThreadServiceQ1 extends Thread {

	public static void main(String[] args) {

		Thread t1 = new Thread("T1");
		t1.setName("MyThread");
		System.out.println("Name of thread: " + t1.getName());

		Date date = null;
		SimpleDateFormat simpDate=null;
		
		try {
			t1.start();
			date = new Date();
			simpDate = new SimpleDateFormat("dd/MMMM/yyyy hh:mm:s");
			System.out.println("Current time: " + simpDate.format(date));
			t1.sleep(1000);
			System.out.println("Current time: " + simpDate.format(date));
		} catch (Exception e) {
			System.err.println(e);
		}
	}
}
