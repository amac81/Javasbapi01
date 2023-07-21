package pt.bitclinic.webservices01.entities;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;

import pt.bitclinic.webservices01.entities.enums.OrderStatus;

public class Order implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Long id;
	private LocalDateTime moment;
	private OrderStatus orderstatus;
	private Payment payment;
	private User user;
	//private List<OrderItem> items = new ArrayList<>();

	public Order() {
	}

	public Order(Long id, LocalDateTime moment, OrderStatus orderstatus, Payment payment, User user) {
		super();
		this.id = id;
		this.moment = moment;
		this.orderstatus = orderstatus;
		this.payment = payment;
		this.user = user;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDateTime getMoment() {
		return moment;
	}

	public void setMoment(LocalDateTime moment) {
		this.moment = moment;
	}

	public OrderStatus getOrderstatus() {
		return orderstatus;
	}

	public void setOrderstatus(OrderStatus orderstatus) {
		this.orderstatus = orderstatus;
	}

	public Payment getPayment() {
		return payment;
	}

	public void setPayment(Payment payment) {
		this.payment = payment;
	}

		
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	/*public void addItem(OrderItem item) {
		items.add(item);
	}

	public void removeItem(OrderItem item) {
		items.remove(item);
	}
	

	public List<OrderItem> getItems() {
		return items;
	}
	*/
	public double total() {
	/*	Double sum = 0.0;

		for (OrderItem oi : items) {
			sum += oi.subTotal();
		}
		return sum;*/
		return 0.0;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Order other = (Order) obj;
		return id == other.id;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", moment=" + moment + ", orderstatus=" + orderstatus + ", payment=" + payment
				+ ", user=" + user + "]";
	}


}
