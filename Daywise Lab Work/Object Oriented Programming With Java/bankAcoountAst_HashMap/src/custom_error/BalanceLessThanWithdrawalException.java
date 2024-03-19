package custom_error;

public class BalanceLessThanWithdrawalException extends Exception{
	public BalanceLessThanWithdrawalException(String msg) {
		super(msg);
	}

}
