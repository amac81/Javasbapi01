	package pt.bitclinic.webservices01.entities.enums;

public enum OrderStatus {
	WAITING_PAYMENT(1),  
	PAID(2), 
	SHIPPED(3), 
	DELIVERED(4), 
	CANCELED(5);
	
	private Integer number;

	OrderStatus(Integer i) {
		this.number = i;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}	
}
