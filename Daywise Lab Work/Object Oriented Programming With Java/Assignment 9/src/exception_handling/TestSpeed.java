package exception_handling;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import custom_exceptions.SpeedOutOfRangeException;
import utils.VehicleValidationRules;
import static utils.VehicleValidationRules.validateSpeed;
import static utils.VehicleValidationRules.validateLicense;

public class TestSpeed {
	private static SimpleDateFormat sdf;
	static {
		sdf = new SimpleDateFormat("dd-MM-yyyy");
	}
	public static void main(String[] args)  /* throws SpeedOutOfRangeException */ {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter curnt speed : ");
			// invoke a static method for speed validation.
			validateSpeed(sc.nextInt());
			System.out.println("Enter the license expiry date :");
			Date expDate = sdf.parse(sc.next());
			validateLicense(expDate);
			System.out.println("end of try...");
		} // JVM : sc.close()
		catch (Exception e) {
		//	System.out.println(e.getMessage());
			e.printStackTrace();
		}
		System.out.println("main cntd....");

	}

}
