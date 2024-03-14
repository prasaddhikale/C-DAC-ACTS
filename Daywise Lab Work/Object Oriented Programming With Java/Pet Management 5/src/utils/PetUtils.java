package utils;

import java.util.HashMap;

import core.Order;
import core.Pet;
import exception.InvalidInputException;

public class PetUtils {
	public static boolean checkAdmin(String id,String pass)throws InvalidInputException{
		if(id.equals("a")&&pass.equals("a"))
			return true;
		return false;
	}
	public static boolean checkUser(String id1,String pass1)throws InvalidInputException{
		if(id1.equals("c1")&&pass1.equals("c1"))
			return true;
		return false;
	}
	public static void checkduppetId(Integer petId,HashMap<Integer, Pet>pet)throws InvalidInputException{
		if(pet.containsKey(petId))
			throw new InvalidInputException("Duplicate pet id found");
	  return;
	}
public static Order checkduporderId(Integer orderId,HashMap<Integer, Order>order)throws InvalidInputException{
	if(order.containsKey(orderId))
		throw new InvalidInputException("Duplicate order id found");
	return order.get(orderId);
}
public static Pet checkPetid(Integer petId,HashMap<Integer, Pet>pet)throws InvalidInputException{
	if(pet.containsKey(petId)) {
		System.out.println("pet id found");
		return pet.get(petId);
	}
 throw new InvalidInputException("Pet not found!");
}
}
