package hib_mapping2.hib_mapping2;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Company {
	@Id
	int cId;
	@OneToMany
	List<Employee> empList;
	public Company() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Company(int cId, List<Employee> empList) {
		super();
		this.cId = cId;
		this.empList = empList;
	}
	public int getcId() {
		return cId;
	}
	public void setcId(int cId) {
		this.cId = cId;
	}
	public List<Employee> getEmpList() {
		return empList;
	}
	public void setEmpList(List<Employee> empList) {
		this.empList = empList;
	}
	@Override
	public String toString() {
		return "Company [cId=" + cId + ", getcId()=" + getcId() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	
}
