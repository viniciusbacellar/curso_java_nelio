import java.util.Locale;
import java.util.Scanner;

import entities.Quarto;

public class Pensionato {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many rooms will be rented? ");
		int n = sc.nextInt();
		Quarto[] vect = new Quarto[9];
		
		for(int i=1; i<=n; i++) {
			System.out.println("Rent #" + i + ":");
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int number = sc.nextInt();
			vect[number] = new Quarto(name, email, number);
			System.out.println();
		}
		System.out.println("Busy rooms:");
		for(int i=0; i<vect.length; i++) {
			if(vect[i] != null) {
				System.out.printf(vect[i].toString());
				System.out.println();
			}
		}
		
		
		sc.close();
	}

}
