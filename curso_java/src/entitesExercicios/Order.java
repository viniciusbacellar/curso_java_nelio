package entitesExercicios;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;



public class Order {

	private Date moment;
	private Status status;
	private Client client;
	private List<OrderItem> orderItem = new ArrayList<>();
	
	public Order() {
	}

	public Order(Status status, Client client) {
		this.status = status;
		this.client = client;
	}
	

	public Order(Date moment) {
		this.moment = moment;
	}


	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}
	
	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}


	public List<OrderItem> getOrderItem() {
		return orderItem;
	}

	public void addItem(OrderItem item) {
		orderItem.add(item);
	}
	
	public void removeItem(OrderItem item) {
		orderItem.remove(item);
	}
	
	
	public Double total() {
		double sum = 0.0;
		for (OrderItem i : orderItem) {
			sum += i.subTotal();
		}
		return sum;
	}
	
	
	
	
}
