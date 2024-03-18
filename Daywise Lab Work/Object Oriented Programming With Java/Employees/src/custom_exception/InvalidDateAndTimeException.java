package custom_exception;

@SuppressWarnings("serial")
public class InvalidDateAndTimeException extends Exception 
{	public InvalidDateAndTimeException(String errMesg)
	{
		super(errMesg);
	}

}
