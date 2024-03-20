package utils;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import static utils.ItemUtils.*;
import core.Item;
import custom_error.InvalidDateAndTimeException;
import custom_error.InvalidItemException;

public interface PopulateGroceryStore {
	public static List<Item> getAll() throws InvalidDateAndTimeException {
		return Stream
				.of(new Item("Vegetable", 50, 100, parseLocalDateTime("2023-10-22T04:07:12")),
						new Item("Fruits", 100, 75, parseLocalDateTime("2023-09-22T11:11:03")),
						new Item("Dairy", 25, 20, parseLocalDateTime("2023-10-12T05:09:19")),
						new Item("Meat", 200, 10, parseLocalDateTime("2023-10-20T09:59:28")),
						new Item("Organic", 210, 15 , parseLocalDateTime("2023-05-20T09:59:28")),
						new Item("Exotic Fruits", 250, 0, parseLocalDateTime("2023-01-22T12:59:59")))
				.collect(Collectors.toList());

	}

	public static HashMap<String, Item> populateGroceryList(List<Item> list) {
		HashMap<String, Item> groceryMap = new HashMap<>();
		for (Item i : list) {
			groceryMap.put(i.getName(), i);
		}
		return groceryMap;
	}
}
