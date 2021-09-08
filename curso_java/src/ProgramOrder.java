import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entitesExercicios.Client;
import entitesExercicios.Order;
import entitesExercicios.OrderItem;
import entitesExercicios.Product;
import entitesExercicios.Status;



public class ProgramOrder {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date moment = new Date();
		
		System.out.println("Enter client data:");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.nextLine();
		System.out.print("Birth date (DD/MM/YYYY): ");
		Date date = sdf.parse(sc.next());
		System.out.println("Enter order data:");
		System.out.print("Status: ");
		sc.nextLine();
		String status = sc.nextLine();
		Order order = new Order(Status.valueOf(status), new Client(name, email, date));
		
		System.out.print("How many items to this order? ");
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			System.out.println("Enter #" + i + 1 + " item data");
			System.out.print("Product name: ");
			sc.nextLine();
			String productName = sc.nextLine();
			System.out.print("Product price: ");
			Double productPrice = sc.nextDouble();
			System.out.print("Quantity: ");
			Integer quantity = sc.nextInt();
			OrderItem item = new OrderItem(quantity, productPrice, new Product(productName, productPrice));
			order.addItem(item);
		}
		
		System.out.println();
		System.out.println("ORDER SUMMARY:");
		System.out.println("Order moment: " + sdf2.format(moment));
		System.out.println("Order status: " + order.getStatus());
		System.out.println("Client: " + order.getClient().getName() + " (" + sdf.format(order.getClient().getBirthDate()) + ") - " + order.getClient().getEmail());
		System.out.println("Order items:");
		for (OrderItem i : order.getOrderItem()) {
			System.out.printf("%s, $%.2f, Quantity: %d, Subtotal: $%.2f%n", i.getProduct().getName(), i.getPrice(), i.getQuantity(), i.subTotal());
		}
		
		System.out.println("Total price: " + "$" + order.total());
		
		
		sc.close();
	}

}
