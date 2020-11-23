package Question3And4;

public class DemoThread1Main {

	public static void main(String[] args) {
		
		
		DemoThread1 demoThread1 = new DemoThread1();
		DemoThread1 demoThread2 = new DemoThread1();
		DemoThread1 demoThread3 = new DemoThread1();
		
		demoThread1.run();
		demoThread2.run();
		demoThread3.run();
	}
}
