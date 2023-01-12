package week5exceptionHandling;


//public class InsufficientBalanceException extends RuntimeException{
//public class InsufficientBalanceException extends Exception{
public class InsufficientBalanceException extends Throwable{

	

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 354959930744030120L;
	public InsufficientBalanceException() {
		super("please check the balance ");
	}
	public InsufficientBalanceException(String message) {
		super(message);
	}

	
}
