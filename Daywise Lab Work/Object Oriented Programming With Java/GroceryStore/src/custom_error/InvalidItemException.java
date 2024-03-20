package custom_error;

public class InvalidItemException extends Exception {
	public InvalidItemException(String errMsg) {
		super(errMsg);
	}

}
