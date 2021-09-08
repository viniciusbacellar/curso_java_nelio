import java.util.Locale;
import java.util.Scanner;
import entities.MetodBank;

public class ProgramBank {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		MetodBank metodBank;
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.print("Is there na initil deposit (y/n)? ");
		char initial = sc.next().charAt(0);
		if (initial == 'y') {
			System.out.print("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			metodBank = new MetodBank(number, holder, initialDeposit);
		}
		else {
			metodBank = new MetodBank(number, holder);
		}
		
		System.out.println();
		System.out.println("Account data: ");
		System.out.println(metodBank);
		System.out.println();
		System.out.print("Enter a deposit value: ");
		double deposit = sc.nextDouble();
		metodBank.deposit(deposit);
		System.out.println("Updated account data: ");
		System.out.println(metodBank);
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		double withdraw = sc.nextDouble();
		metodBank.withdraw(withdraw);
		System.out.println("Updated account data: ");
		System.out.println(metodBank);
		
		
		
		
		sc.close();
	}

}
