package Countries;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Country> list1 = new ArrayList<Country>();
		ArrayList<Country> list2 = new ArrayList<Country>();
		
		Country c1 = new Country("Romania", 2000, "Europe");
		Country c2 = new Country("China", 22200, "Asia");
		Country c3 = new Country("Peru", 100, "South America");
		
//		list1.add(c1);
//		list1.add(c2);
//		list1.add(c3);
//		
//		list2.add(c1);
//		list2.add(new Country("England", 12333, "Europe"));
//		
//		Collections.sort(list1);
//		System.out.print(list1+"\n");
//		
//		list1.add(1,new Country("Belarus",1,"Europe"));
//		System.out.print(list1);
		
		TreeMap<String,Country> tree =new TreeMap();
		TreeMap<String,Country> tree2 =new TreeMap();
		tree.put(c1.name, c1);
		tree.put(c2.name,c2);
		tree.put(c3.name, c3);
		
		System.out.print(tree);
		System.out.print(tree.get("China"));
		System.out.print(tree.higherKey("Peru"));
		tree2.putAll(tree);
		System.out.print(tree2);
		
//		list1.retainAll(list2);
//		System.out.print(list1);
//		
		
	}
	
}
