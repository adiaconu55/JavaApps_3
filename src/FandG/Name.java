package FandG;

public class Name {

	public static void f() throws Andrei{
		try {
			g();
		}catch (Exception e) {
			System.out.print(e);
			throw new Andrei();
		}
	}
	
	public static void g() throws Bogdan{
		throw new Bogdan();
	}
	
}
