package tester;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import static utils.VehicleValidationRules.*;

public class TestSpeed {
	private static SimpleDateFormat sdf;
	static {
		System.out.println("in static init block");
		sdf = new SimpleDateFormat("dd-MM-yyyy");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(Scanner sc = new Scanner(System.in)){
			System.out.println("Enter Car Speed : ");
			checkSpeed(sc.nextInt());
			
			
			System.out.println("Enter your License Expiry Date : (dd-mm-yyyy)");
			Date date = sdf.parse(sc.next());
			checkLicenseExpiry(date);
			}
		catch (Exception e) {
//			System.out.println("System.out.println(e); -");
			System.out.println(e);
			
//			System.out.println("e.printSTackTrace");
			e.printStackTrace();
		}
		finally {
			System.out.println("---EXIT---");
		}
		
	}

	

}
