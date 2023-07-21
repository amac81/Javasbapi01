package pt.bitclinic.webservices01.entities.enums;

public enum OrderStatus {
	WAITING_PAYMENT(1),  
	PAID(2), 
	SHIPPED(3), 
	DELIVERED(4), 
	CANCELED(5);
	
	private int number;

	OrderStatus(int i) {
		this.number = i;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}	
}
