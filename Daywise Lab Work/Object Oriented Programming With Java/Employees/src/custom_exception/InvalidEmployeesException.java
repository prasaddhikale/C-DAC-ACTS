package custom_exception;

@SuppressWarnings("serial")
public class InvalidEmployeesException extends Exception 
{
	public InvalidEmployeesException (String errMesg)
	{
		super(errMesg);
	}

}
