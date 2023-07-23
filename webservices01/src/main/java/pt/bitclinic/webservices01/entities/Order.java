package pt.bitclinic.webservices01.entities;

import java.io.Serializable;
import java.time.Instant;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'", timezone = "GMT")
	private Instant moment;

	private Integer orderStatus;
	
	@OneToOne
	private Payment payment;
	
	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;

	public Order() {
	}

	public Order(Long id, Instant moment, OrderStatus orderStatus, Payment payment, User user) {
		this.orderId = id;
		this.moment = moment;
		setOrderStatus(orderStatus);
		this.payment = payment;
		this.user = user;
	}

	public Long getId() {
		return orderId;
	}

	public void setId(Long id) {
		this.orderId = id;
	}

	public Instant getMoment() {
		return moment;
	}

	public void setMoment(Instant moment) {
		this.moment = moment;
	}

	public OrderStatus getOrderStatus() {
		return OrderStatus.valueOf(orderStatus);
	}

	public void setOrderStatus(OrderStatus orderStatus) {
		this.orderStatus = orderStatus.getCode();
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
		return "Order [orderId=" + orderId + ", moment=" + moment + ", orderStatus=" + orderStatus + ", payment="
				+ payment + ", user=" + user + "]";
	}

}
