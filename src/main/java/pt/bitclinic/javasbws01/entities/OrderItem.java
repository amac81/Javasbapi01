package pt.bitclinic.javasbws01.entities;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import pt.bitclinic.javasbws01.entities.pks.OrderItemPK;

@Entity
@Table(name = "tb_order_item")
public class OrderItem {
	

	@EmbeddedId
	private OrderItemPK id = new OrderItemPK();
	private Integer quantity;
	private Double productPrice;
	private Double discount;

	public OrderItem() {
	}

	public OrderItem(Order order, Product product, Integer quantity, Double productPrice, Double discount) {
		id.setOrder(order);
		id.setProduct(product);		
		this.discount = discount;
		this.quantity = quantity;
		this.productPrice = productPrice;
	}
	
	//in JEE what matters is the get method; to avoid "loop"
	@JsonIgnore
	public Order getOrder() {
		return id.getOrder();
	}
	
	public void setOrder(Order order) {
		id.setOrder(order);
	}
	

	public Product getProduct() {
		return id.getProduct();
	}

	public void setProduct(Product product) {
		id.setProduct(product);
	}
	
	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	
	public Double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(Double productPrice) {
		this.productPrice = productPrice;
	}

	public Double getDiscount() {
		return discount;
	}

	public void setDiscount(Double discount) {
		this.discount = discount;
	}
	
	public double getSubTotal() {		
		return quantity * productPrice * (1 - discount);		
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
		OrderItem other = (OrderItem) obj;
		return Objects.equals(id, other.id);
	}



}