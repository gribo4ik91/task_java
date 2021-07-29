package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {

		Item item = new Item(1, "yuhjjj", ClothesGroup.CLOTHES);
		Item item1 = new Item(2, "TTT", ClothesGroup.GADGET);
		Item item2 = new Item(3, "qqqq", ClothesGroup.CLOTHES);
		Item item3 = new Item(4, "RRRR", ClothesGroup.TOY);

		List<Item> itemList = new ArrayList<>();
		itemList.add(item);
		itemList.add(item1);
		itemList.add(item2);
		itemList.add(item3);



		Address address = new Address(10,"Moldova", "Chisinau", "Stefan");
		Address address1 = new Address(3,"Moldova", "Orhei", "Stefan");
		Address address2 = new Address(24,"Moldova", "Chisinau", "Stefan");
		Address address3 = new Address(1, "Moldova", "Balt", "Stefan");




		User user = new User(1255, "Test", Collections.singletonMap(" Addresses details ", address));
		User user1 = new User(1256, "Alex", Collections.singletonMap(" Addresses details1 ", address1));
		User user2 = new User(1257, "Oleg", Collections.singletonMap(" Addresses details2 ", address2));
		User user3 = new User(1258, "Feel", Collections.singletonMap(" Addresses details3 ", address3));
	//	User user4 = new User(12345, "lex", "user4",address);


		HashMap<String, Address> addressMap = new HashMap<>();
		addressMap.put("Addresses details ", address);
		addressMap.put("Addresses details1 ", address1);
		addressMap.put("Addresses details2 ", address2);
		addressMap.put("Addresses details3 ", address3);
	//	addressMap.put("Addresses details", address4);
		//System.out.println(addressMap);
		List<User> userList = new ArrayList<>();
		userList.add(user);
		userList.add(user1);
		userList.add(user2);
		userList.add(user3);
	//	System.out.println(user);

/*
		List<Order> orders = Arrays.asList(
				new Order(user, itemList.get(0)),
				new Order(user1, itemList.get(1)),
				new Order(user2, itemList.get(2)),
				new Order(user3, itemList.get(3))
		);

*/

		Order order = new Order(user, itemList.subList(0,2));
		Order order1 = new Order(user1, itemList.subList(3,4));
		Order order2 = new Order(user2, itemList.subList(0,1));
		Order order3 = new Order(user3, itemList.subList(1,2));

		List<Order> orderList = new ArrayList<>();
		orderList.add(order);
		orderList.add(order1);
		orderList.add(order2);
		orderList.add(order3);



		List<Order> filteredOrders = getFilteredOrders(orderList);

		//System.out.println(filteredOrders);



		List<User> addressToFilter = userList.stream().filter(a -> a.getAddresses().get("Addresses details").getCity().equals("Chisinau")).collect(Collectors.toList());


		System.out.println(addressToFilter);




	}


	private static List<Order> getFilteredOrders(List<Order> orderList) {
		List<Order> filteredOrders = new ArrayList<>();
		for (Order orderToFilter : orderList) {
			for (Item itemToFilter : orderToFilter.getItems()) {
				if(itemToFilter.getGroup().equals(ClothesGroup.CLOTHES)) {
					filteredOrders.add(orderToFilter);
					break;
				}
			}
		}
		return filteredOrders;
	}

}
