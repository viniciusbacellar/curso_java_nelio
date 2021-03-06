package entitesExercicios;

public class ProductPoli {

	private String name;
	protected double price;
	
	public ProductPoli() {
	}

	public ProductPoli(String name, double price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public String priceTag() {
		return String.format("%s $%.2f", name, price);
	}
	
	
}
