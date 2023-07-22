package pt.bitclinic.webservices01.entities;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import pt.bitclinic.webservices01.entities.enums.OrderStatus;

@Entity
@Table(name = "tb_order")
public class Order implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long orderId;
	private LocalDateTime moment;

	@Enumerated(EnumType.ORDINAL) 
	private OrderStatus orderstatus;
	
	@OneToOne
	private Payment payment;
	@OneToOne
	private User user;

	public Order() {
	}

	public Order(Long id, LocalDateTime moment, OrderStatus orderstatus, Payment payment, User user) {
		this.orderId = id;
		this.moment = moment;
		this.orderstatus = orderstatus;
		this.payment = payment;
		this.user = user;
	}

	public Long getId() {
		return orderId;
	}

	public void setId(Long id) {
		this.orderId = id;
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

	/*
	 * public void addItem(OrderItem item) { items.add(item); }
	 * 
	 * public void removeItem(OrderItem item) { items.remove(item); }
	 * 
	 * 
	 * public List<OrderItem> getItems() { return items; }
	 */
	public double total() {
		/*
		 * Double sum = 0.0;
		 * 
		 * for (OrderItem oi : items) { sum += oi.subTotal(); } return sum;
		 */
		return 0.0;
	}

	@Override
	public int hashCode() {
		return Objects.hash(orderId);
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
		return orderId == other.orderId;
	}

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", moment=" + moment + ", orderstatus=" + orderstatus + ", payment="
				+ payment + ", user=" + user + "]";
	}

}
