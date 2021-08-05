package Collections;

public class Address {


	private int home;
	private String country;
	private String city;
	private String street;


	public Address(String country, String city, String street) {
		this.country = country;
		this.city = city;
		this.street = street;
	}

	public Address(int home, String country, String city, String street ) {

		this.home = home;
		this.country = country;
		this.city = city;
		this.street = street;

	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public int getHome() {
		return home;
	}

	public void setHome(int home) {
		this.home = home;
	}

/*	@Override
	public String toString() {
		return " Address {" + '\n' +
				"country = '" + country + "'\n" +
				"city = '" + city + "'\n" +
				"street = '" + street +
				" ";
	}*/

	@Override
	public String toString() {
		return " {" +
				" home = " + home +
				", country ='" + country + '\'' +
				", city = '" + city + '\'' +
				", street = '" + street + '\'' +
				'}'+"\n";
	}

/*	public Object getId(int i) {
		return home;
	}*/
}
