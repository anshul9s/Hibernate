package hib_mapping.hib_mapping;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Person {
	@Id
	int id;
	@OneToOne
	Aadhaar aadhaarCard;
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(int id, Aadhaar aadhaarCard) {
		super();
		this.id = id;
		this.aadhaarCard = aadhaarCard;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Aadhaar getAadhaarCard() {
		return aadhaarCard;
	}
	public void setAadhaarCard(Aadhaar aadhaarCard) {
		this.aadhaarCard = aadhaarCard;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", aadhaarCard=" + aadhaarCard + "]";
	}

	
}