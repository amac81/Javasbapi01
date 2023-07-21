package pt.bitclinic.webservices01.entities;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;

public class Order implements Serializable{

	private static final long serialVersionUID = 1L;
	private long id;
	private LocalDateTime moment;
	private OrderStatus orderstatus;
	
	public Order() {}

	public Order(long id, LocalDateTime moment, OrderStatus orderstatus) {
		super();
		this.id = id;
		this.moment = moment;
		this.orderstatus = orderstatus;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
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
		return "Order [id=" + id + ", moment=" + moment + ", orderstatus=" + orderstatus + "]";
	}
	

}
