package tesster;

import static utils.AccountUtils.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import bankAcoountAst.Account;
import bankAcoountAst.BankAccount;
import custom_error.InvalidInputException;
import custom_error.insufficientBalWarning;

public class AccountManagement {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Scanner sc = new Scanner(System.in)) {
			HashMap<Long, BankAccount> list = new HashMap<>();
			boolean exit = false;
			while (!exit) {
				try {
					for (BankAccount v : list.values())
						System.out.println(v);
					System.out.println("-------------------------------------------------------");
					System.out.println("Options : 1. Create Bank Account\r\n" + "2. View account summary\r\n"
							+ "3. Withdraw funds\r\n" + "4. Deposit funds\r\n" + "5. Close Account\r\n"
							+ "6. Sort As Per Account Number\r\n  7. Sort Account as Per Creation Date: \r\n "
							+ "8. Sort As Per Account Type and Account Balance 0. Exit.\r\n");
					System.out.println("Choose an option");
					switch (sc.nextInt()) {
					case 0:
						exit = true;
						break;
					case 1:
						System.out.println("Enter Account number");
						long accNo = sc.nextLong();
						checkForDup(accNo, list);
						System.out.println("Create Your Bank Account:  name, pin , accountType ,"
								+ "accountBalance, date ");

						BankAccount ba = new BankAccount(accNo, sc.next(), sc.next(),
								parseAndValidateAccount(sc.next()), checkMinBal(sc.nextDouble()), parseCreationDate(sc.next()));
						list.put(accNo, ba);
						System.out.println("Account successfully created");

						System.out.println("added succesfully : ");
						break;
					case 2:
						System.out.println("Enter account number");
						ba = list.get(sc.nextLong());
						if (ba == null)
							throw new InvalidInputException("Invalid Account number, Account Not Found !!!");
						System.out.println(ba);
						break;

					case 3:
						System.out.println("Enter account no n money to be withdrawn");
						ba = list.get(sc.nextLong());
						if (ba == null)
							throw new InvalidInputException("Invalid Account number, Account Not Found !!!");
						System.out.println(ba);
						double withdrawMoney = sc.nextDouble();
						if (ba.getAccBal() < withdrawMoney) {
							throw new insufficientBalWarning("maintain Min Account BAl. requirement");

						}

						ba.setAccBal(ba.getAccBal() - withdrawMoney);
						System.out.println("updated balance : " + ba.getAccBal());
						break;
					case 4:
						System.out.println("Enter account no n money to be deposited");
						ba = list.get(sc.nextLong());
						if (ba == null)
							throw new InvalidInputException("Invalid Account number, Account Not Found !!!");
						System.out.println(ba);
						double dipMoney = sc.nextDouble();
						ba.setAccBal(ba.getAccBal() + dipMoney);
						System.out.println("updated balance : " + ba.getAccBal());
						break;
					case 5:
						System.out.println("Enter account number ");
						ba = list.remove(sc.nextLong());
						if (ba == null)
							throw new InvalidInputException("Invalid Account number, can't delete account!!!!");
						System.out.println("Cancelled Account Number For " + ba.getName());
						break;
					case 6:
						System.out.println("Sort As Per Account Number");
						List<BankAccount> acclist = new ArrayList<>(list.values());
						
						Collections.sort(acclist);
						//System.out.println(acclist);
						for (BankAccount v : acclist)
							System.out.println(v);
						break;
					case 7:
						System.out.println("Sort Account as Per Creation Date:");
						List<BankAccount> acclist1 = new ArrayList<>(list.values());
						Collections.sort(acclist1, (p1, p2) -> p1.getCreationDate().compareTo(p2.getCreationDate()));
						acclist1.forEach(p -> System.out.println("sorted account as per Account Creation date" + p));
						break;
					case 8:
						System.out.println("Sorting Bank Accounts as per Account type and bal in Ascending order");
						//List<BankAccount> acclist2 = new ArrayList<>(list.values());
						System.out.println("Enter Account type");
						String type = sc.next();
						Account mtype =Account.valueOf(type.toUpperCase());
						list.values().stream().filter(p -> p.getAccountType().equals(mtype))
								.sorted((p1, p2) -> ((Double) p2.getAccBal()).compareTo(p1.getAccBal()))
								.forEach(p1 -> System.out.println(p1));
						break;
					
					default:
						break;
					}
				} catch (Exception e) {
					System.out.println(e);
					e.printStackTrace();
					sc.nextLine();
				}
			}
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

}
/*
 * //1
nn l3 loan 7777 2222-02-02
omkar 90 saving 1000000 2012-12-12 
homasu 88 loan 12 2024-08-08 
anket 7 loan 12 2013-12-19
 bhavesh 77 loan 99999 2019-11-11 
 gaurav 777 fd 9999999 2023-02-11
 */