package custom_error;

public class InvalidDateAndTimeException extends Exception {
	public InvalidDateAndTimeException(String errMsg) {
		super(errMsg);
	}

}
