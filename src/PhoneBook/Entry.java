package PhoneBook;

public class Entry {

	String phoneNumber;
	String name;
	String address;
	
	
	public Entry(String phoneNumber, String name, String address) {
		this.phoneNumber = phoneNumber;
		this.name = name;
		this.address = address;
	}


	@Override
	public String toString() {
		return "Entry [phoneNumber=" + phoneNumber + ", name=" + name + ", address=" + address + "]\n";
	}
	
}
