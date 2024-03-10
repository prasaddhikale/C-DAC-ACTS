package custom_exception;

public class LicenseExpiredException extends Exception {
	public LicenseExpiredException(String erromessage) {
		super(erromessage);
	}
}
