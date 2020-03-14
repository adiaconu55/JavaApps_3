package Countries;

public class Country implements Comparable<Country>{

	String name;
	int population;
	String contName;
	
	public Country(String name, int population, String contName) {
		this.name = name;
		this.population = population;
		this.contName = contName;
	}

	@Override
	public String toString() {
		return "Country [name=" + name + ", population=" + population + ", contName=" + contName + "]\n";
	}
	
	@Override
	public int compareTo(Country c) {
		return this.name.compareTo(c.name);
	}
}
