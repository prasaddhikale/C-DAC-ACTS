package tester;

import java.util.HashMap;
import java.util.Scanner;
import static utils.ListUtils.checkForDup;
import static utils.ListUtils.parseLocalDateTime;
import static utils.populateEmployeeList.*;
import core.Employees;

public class TestEmployees {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)) {
			HashMap<String, Employees> map = populateGroceryList(getAll());
			{
				try
				{
					boolean exit=false;
					while(!exit)
					{
						System.out.println("Option");
						System.out.println("1.Add Employee \n2.Display All Employees\n3.Sallary Update\n4.remove Emploees ");
						switch(sc.nextInt())
						{
							case 1:
							{
								System.out.println("Enter the Employee name,id,sallary ,DateAndTime,place:");
								Employees emp = new Employees(checkForDup(sc.next(),map),sc.nextInt(),sc.nextInt(),parseLocalDateTime(sc.next()),sc.next());
								map.put(emp.getName(),emp);
								map.values().stream().forEach(p->System.out.println(p));
								System.out.println("---------------------------");
								System.out.println("Successfull Added");
								System.out.println("---------------------------");
								break;
							
								
							}
							case 2:
							{
								System.out.println("---------------------------");
								map.values().stream().forEach(p->System.out.println(p));
								System.out.println("---------------------------");
							}
							break;
							case 3:
							{
								System.out.println("Enter the name of Employees want update sallary");
								String Emp1 =sc.next();
								int updateSal = sc.nextInt();
								if(map.containsKey(Emp1))
								{
									map.get(Emp1).setSallary(updateSal);
									System.out.println("Successfully Updated");
								}
							}break;
							case 4:
							{
								System.out.println("Remove Employees");
								String ename = sc.next();
								
								
								if(map.containsKey(ename))
								{
									map.remove(ename);
									System.out.println("Employee with name " + ename + " has been removed.");
								}else {
						            System.out.println("Employee with name " + name + " not found.");
						        }
								 
								
								
							}
						}
					}
					
				}catch(Exception e)
				{
					e.printStackTrace();
				}
			}
					
					
		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
