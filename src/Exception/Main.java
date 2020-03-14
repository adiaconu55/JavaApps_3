package Exception;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int n;
		Scanner sc = new Scanner(System.in);
		try {
			n=sc.nextInt();
			sc.close();
			if(n<10)
				throw new Trigger();
		}catch(Exception e) {
			System.out.print(e);
		}
		
		
	}
	
}
