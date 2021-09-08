package util;

public class CurrencyConverter {
	
	public static double dolarPrice;
	public static double quantityDolar;
	
	public static double dolarFinal() {
		return dolarPrice * quantityDolar;
	}
	
	public static double iof() {
		return 6 * dolarFinal() / 100;
	}
	
	public static double finalPrice() {
		return dolarFinal() + iof();
	}
}
