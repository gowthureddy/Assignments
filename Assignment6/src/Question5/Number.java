package Question5;

public class Number implements Runnable{
	
	private int value;
	public Number(int value) {
		this.value = value;
	}

	@Override
	public void run() {
		
		for(int i=1;i<100;i++) {
			if(i%value==0) {
				System.out.println("Multiple of "+value+": "+i);
			}
		}
		
	}

}
