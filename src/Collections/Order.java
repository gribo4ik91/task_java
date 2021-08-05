package Collections;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class Order {

	private String id;
	private String myObjDate;
	private User user;
	private List<Item> items;


	public Order(User user, List<Item> items) {
		this.id = LocalDateTime.now().atOffset(ZoneOffset.UTC).format(DateTimeFormatter.ISO_LOCAL_DATE_TIME).replaceAll("-", "").replace("T", "").replaceAll(":", "").replace(".", "");
		this.myObjDate = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
		this.user = user;
		this.items = items;
	}



	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}


	@Override
	public String toString() {
		return "\n" + '\n' + "Order {" + '\n' +
				"Order id = " + id + '\n' +
				"Date = " + myObjDate + '\n' +
				"User details: " + user + '\n' +
				"Items details: " + items +
				'}';
	}
}
