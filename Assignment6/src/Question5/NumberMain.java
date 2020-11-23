package Question5;

public class NumberMain {

	public static void main(String[] args) {

		Number number1 = new Number(2);
		Number number2 = new Number(5);
		Number number3 = new Number(8);

		Thread thread = new Thread();

		System.out.println("Begininng of the Thread...");

		System.out.println(thread.currentThread().getState());
		number1.run();
		System.out.println(thread.currentThread().getState());
		number2.run();
		System.out.println(thread.currentThread().getState());
		number3.run();

		System.out.println("End of the Thread...");

	}

}
