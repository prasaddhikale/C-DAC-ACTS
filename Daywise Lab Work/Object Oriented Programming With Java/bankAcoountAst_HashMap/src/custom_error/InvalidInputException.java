package custom_error;

public class InvalidInputException extends Exception {
	public InvalidInputException(String errMsg) {
		super(errMsg);
	}

}
