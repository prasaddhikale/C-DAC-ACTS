package custom_error;

public class insufficientBalWarning extends Exception {
	public insufficientBalWarning(String msg) {
		super(msg);
	}
}
