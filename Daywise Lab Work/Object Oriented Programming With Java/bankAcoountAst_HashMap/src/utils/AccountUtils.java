package utils;

import java.time.LocalDate;
import java.util.HashMap;

import bankAcoountAst.Account;
import bankAcoountAst.BankAccount;
import custom_error.InvalidInputException;
import custom_error.insufficientBalWarning;

public class AccountUtils {
	public static Account parseAndValidateAccount(String type) {
		return Account.valueOf(type.toUpperCase());
	}
	
	public static LocalDate parseCreationDate(String date ) {
		return LocalDate.parse(date);
	}
	
	public static void checkForDup(long accNo,HashMap<Long, BankAccount> list) 
			throws InvalidInputException{
		if(list.containsKey(accNo)) 
			throw new InvalidInputException("Duplicate Account Number !!!");
		System.out.println("Valid Account Number");
	}
	public static double checkMinBal(double bal) throws insufficientBalWarning {
		if(bal < 3000)
			throw new insufficientBalWarning("balance less than min balance");
		return bal;
	}

	}

