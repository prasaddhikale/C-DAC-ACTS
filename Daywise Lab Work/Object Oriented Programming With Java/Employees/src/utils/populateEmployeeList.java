package utils;
import static utils.ListUtils.*;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import core.Employees;
import custom_exception.InvalidDateAndTimeException;


public interface populateEmployeeList 
{
	public static List<Employees> getAll() throws  InvalidDateAndTimeException
	{
		return Stream.of(new Employees("Tejas",1,21000,parseLocalDateTime("2023-03-04T02:52:25"),"Nashik"),
							new Employees("Rohit",2,30000,parseLocalDateTime("2021-02-03T01:15:12"),"MIDC"),
							new Employees("Nagesh",3,13000,parseLocalDateTime("2022-09-04T05:52:54"),"Pune"),
							new Employees("Deepak",4,25000,parseLocalDateTime("2020-01-06T01:23:45"),"Goregaov")).collect(Collectors.toList());
	}

	public static HashMap<String , Employees > populateGroceryList(List<Employees>list)
	
	{
		HashMap<String ,Employees > newEmployees =  new HashMap<>();
		for (Employees i : list)
		{
			newEmployees.put(i.getName(),i);
		}return newEmployees;
		
	}

}
