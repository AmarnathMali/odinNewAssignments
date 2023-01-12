package week5exceptionHandling;

public class FinallyDemo {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Starting of main method");
		try {
			System.out.println(10/2);
			System.exit(0);
		}catch(ArithmeticException ex) {
			System.out.println("exception occured");
		}finally {
			System.out.println("excutes compaulserially");
			
		}

	}

}
