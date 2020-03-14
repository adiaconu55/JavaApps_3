package Coffee;

import java.util.Random;
import java.util.Scanner;

public class CoffeeApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int temp;
		
		while(true) {
			System.out.print("\nInsert temp of coffee: ");
			temp = sc.nextInt();
			try {
				if(temp<35)
					throw new Lower35();
				if(temp>70)
					throw new Higher70();
			}
			catch(Lower35 e) {
				System.out.print(e);
				if(0==(int)(Math.random()*4))
					break;
			}
			catch(Higher70 e) {
				System.out.print(e);
				if(0==(int)(Math.random()*4))
					break;
			}
		}
		System.out.print("\nCustomer left the shop :<");
		sc.close();
	}
	
	
		
	
}
