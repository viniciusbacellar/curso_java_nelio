package entitesExercicios;

public class ImportedProduct extends ProductPoli{

	private double customsFee;
	
	public ImportedProduct() {
		super();
	}

	public ImportedProduct(String name, Double price, double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}

	public double getCustomsFee() {
		return customsFee;
	}

	public void setCustomsFee(double customsFee) {
		this.customsFee = customsFee;
	}
	
	public double totalPrice() {
		return price + customsFee;
	}
	
	@Override
	public String priceTag() {
		return String.format("%s $%.2f (Customs fee: $%.2f)", getName(), totalPrice(), customsFee);
	}
	
}
