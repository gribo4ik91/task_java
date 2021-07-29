package Collections;

import java.util.Map;

public class User {

	private long id;
	private String userName;
private Map<String, Address> addresses;


	public User(long id, String userName, Map<String, Address> addresses) {
		this.id = id;
		this.userName = userName;
		this.addresses = addresses;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}


	public Map<String, Address> getAddresses() {
		return this.addresses;
	}


	public void setAddresses(Map<String, Address> addresses) {
		this.addresses = addresses;
	}


	@Override
	public String toString() {
		return  "\n" +"{ "+
				"id = " + id +
				", Name = '" + userName + " }"+
				"Addresses details "+ addresses ;
	}
}
