package LambdaExamole;


public class lambdaDemoWithThread {

	public static void main(String[] args) {
		// TODO Auto-generated metho
		Runnable r = ()->{
			for(int i = 0; i< 9; i++) {
			System.out.println("hi");
			}
		};
		
		Runnable r2 = () ->{
			for(int j = 0; j < 9; j++) {
			System.out.println(" hello ");
			}
		};
		
		Thread t = new Thread(r);
		Thread t2 = new Thread(r2);
		t.start();
		t2.start();
		

	}

}
