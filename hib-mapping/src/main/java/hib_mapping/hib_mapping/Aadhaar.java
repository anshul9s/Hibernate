package hib_mapping.hib_mapping;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
@Entity
public class Aadhaar {
	@Id
	int aadhaarNum;
	String name;
	String address;
	String gender;
	String dob;
	@OneToOne
	Person person;
	public Aadhaar() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Aadhaar(int aadhaarNum, String name, String address, String gender, String dob, Person person) {
		super();
		this.aadhaarNum = aadhaarNum;
		this.name = name;
		this.address = address;
		this.gender = gender;
		this.dob = dob;
		this.person = person;
	}
	public int getAadhaarNum() {
		return aadhaarNum;
	}
	public void setAadhaarNum(int aadhaarNum) {
		this.aadhaarNum = aadhaarNum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	@Override
	public String toString() {
		return "Aadhaar [aadhaarNum=" + aadhaarNum + ", name=" + name + ", address=" + address + ", gender=" + gender
				+ ", dob=" + dob + ", person=" + person + "]";
	}
	
}
