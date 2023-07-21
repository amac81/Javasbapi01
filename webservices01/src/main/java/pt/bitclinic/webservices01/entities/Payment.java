package pt.bitclinic.webservices01.entities;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;

public class Payment implements Serializable {
	private static final long serialVersionUID = 1L;
	private long id;
	private LocalDateTime moment;

	public Payment() {
	}

	public Payment(long id, LocalDateTime moment) {
		super();
		this.id = id;
		this.moment = moment;
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
		Payment other = (Payment) obj;
		return id == other.id;
	}

	@Override
	public String toString() {
		return "Payment [id=" + id + ", moment=" + moment + "]";
	}

}
