package PhoneBook;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

public class PhoneBook {

	public static void main(String[] args) {
		
		Hashtable<String,Entry> phoneBook = new Hashtable<String,Entry>();
	
		Entry e1 = new Entry("0754845698", "Bogdan", "Bodesti");
		Entry e2 = new Entry("0748514895","Andrei","Horezu");
		Entry e3 = new Entry("0764721156", "Bogdan", "Bucuresti");
		
		phoneBook.put(e1.phoneNumber, e1);
		phoneBook.put(e2.phoneNumber, e2);
		phoneBook.put(e3.phoneNumber, e3);
		
		System.out.print(phoneBook+"\n");
		
		add(phoneBook,new Entry("0777777777","Iisus","Rai"));
		
		System.out.print(phoneBook+"\n");
		
		remove(phoneBook,"0777777777");
		
		System.out.print(phoneBook+"\n");
		
		search(phoneBook,"Bogdan");
	}
	
	public static void add(Hashtable h,Entry obj) {
		h.put(obj.phoneNumber, obj);
	}

	public static void remove(Hashtable h,String number) {
		h.remove(number);
	}
	
	
	public static void search(Hashtable<String, Entry> h,String name) {		
		h.forEach(
				(k,v)-> { if(v.name.equals(name))
					System.out.print(v);				
				}
			);
	}
	
}
