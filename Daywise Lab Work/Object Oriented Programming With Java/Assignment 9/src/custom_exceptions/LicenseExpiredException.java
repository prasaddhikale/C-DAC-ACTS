package custom_exceptions;

public class LicenseExpiredException extends Exception {
	public LicenseExpiredException(String errMesg) {
		super(errMesg);
	}
}
