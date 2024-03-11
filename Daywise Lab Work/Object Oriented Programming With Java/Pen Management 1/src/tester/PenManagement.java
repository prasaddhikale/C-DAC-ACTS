package tester;

import java.time.LocalDate;
import java.time.Period;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import com.app.core.Pen;

import custom_exceptions.PenHandlingExceptions;
import static utils.PenUtils.populatePenMap;
import static utils.PenValidatationRules.validateAll;

public class PenManagement {

    public static void main(String[] args) {
        Map<Integer, Pen> penMap = populatePenMap();
        boolean flag = false;

        try (Scanner sc = new Scanner(System.in)) {
            while (!flag) {
                System.out.println("Enter the Options :\n" + "1. Add new Pen\r\n" + "2. Update stock of a Pen\r\n"
                        + "3. Set discount of 20% for all the pens which are not at all sold in the last 3 months\r\n"
                        + "4. Remove Pens which are never sold once listed in 9 months\n" + "5. Display all pens details\n"
                        + "6. Exit\n");

                try {
                    switch (sc.nextInt()) {
                        case 1: // Add new Pen
                            System.out.println("Enter brand, color, inkColor, material, stock, listing date, price of a pen");
                            Pen p1 = validateAll(sc.next(), sc.next(), sc.next(), sc.next(), sc.nextInt(), sc.next(),
                                    sc.nextDouble());
                            penMap.put(p1.getPenID(), p1); // Use getId() instead of getPenID()
                            System.out.println("Pen is added");
                            break;

                        case 2: // Update stock of a Pen
                            System.out.println("Enter the penId and count of stock");
                            p1 = penMap.get(sc.nextInt());
                            if (p1 == null)
                                throw new PenHandlingExceptions("Invalid Id!!!!");
                            else
                                p1.setStock(p1.getStock() + sc.nextInt());
                            System.out.println("Stock is updated");
                            break;

                        case 3: // Set discount of 20% for all the pens which are not at all sold in the last 3 months
                            LocalDate today = LocalDate.now();
                            Iterator<Pen> penItr = penMap.values().iterator();

                            while (penItr.hasNext()) {
                                Pen pen1 = penItr.next();
                                if ((Period.between(pen1.getStockListingDate(), today)).toTotalMonths() > 3) {
                                    pen1.setDiscount(20);
                                    pen1.setPrice(pen1.getPrice() - pen1.getDiscount());
                                }
                            }
                            System.out.println("Discount is added");
                            break;

                        case 4: // Remove Pens which are never sold once listed in 9 months
                            today = LocalDate.now();
                            penItr = penMap.values().iterator();
                            while (penItr.hasNext()) {
                                Pen pen1 = penItr.next();
                                if ((Period.between(pen1.getStockListingDate(), today)).toTotalMonths() > 9) {
                                    penItr.remove();
                                }
                            }
                            System.out.println("Pens are removed");
                            break;

                        case 5: // Display all pens details
                            System.out.println("Pen Details");
                            for (Pen p : penMap.values())
                                System.out.println(p);
                            break;

                        case 6: // Exit
                            flag = true;
                            System.out.println("Exit !!!!!");
                            break;
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    sc.nextLine();
                }
            }
        } // sc.close()

    }
}
