package week5exceptionHandling;

public class InvalidUserCredentialException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4732900319237612260L;

	public InvalidUserCredentialException() {
		super("Please check your userId and Password");
	}
	public InvalidUserCredentialException(String message) {
		super(message);
	}

}
