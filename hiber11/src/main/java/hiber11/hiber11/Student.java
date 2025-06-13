package hiber11.hiber11;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {	
	@Id 
	int roll;
	String name;
	float cgpa;
	String branch;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int roll, String name, float cgpa, String branch) {
		super();
		this.roll = roll;
		this.name = name;
		this.cgpa = cgpa;
		this.branch = branch;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getCgpa() {
		return cgpa;
	}
	public void setCgpa(float cgpa) {
		this.cgpa = cgpa;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", cgpa=" + cgpa + ", branch=" + branch + "]";
	}
	
	
}