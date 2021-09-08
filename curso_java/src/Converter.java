import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class Converter {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What is the dollar price? ");
		CurrencyConverter.dolarPrice = sc.nextDouble();
		System.out.print("How many dollars will be bought? ");
		CurrencyConverter.quantityDolar = sc.nextDouble();
		System.out.printf("Amount to be paid in reais = %.2f%n", CurrencyConverter.finalPrice());
		
		
		sc.close();

	}

}
