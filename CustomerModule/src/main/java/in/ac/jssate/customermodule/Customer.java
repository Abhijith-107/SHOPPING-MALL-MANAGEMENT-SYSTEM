package in.ac.jssate.customermodule;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
//C:\Users\ABHIJITH\Documents\workspace-spring-tool-suite-4-4.24.0.RELEASE\CustomerModule
@Entity
public class Customer {
	
	// constructor
	private Integer id;
	private String name;
	private Integer order_id;
	private Double phone;
	private String email;
	
	public Customer() {
		super();
	}

	// constructor with parameters
	public Customer(Integer id, String name, Integer order_id, Double phone, String email) {
		super();
		this.id = id;
		this.name = name;
		this.order_id = order_id;
		this.phone = phone;
		this.email = email;
	}

	//getters and setters
	
	@Id
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getOrder_id() {
		return order_id;
	}

	public void setOrder_id(Integer order_id) {
		this.order_id = order_id;
	}

	public Double getPhone() {
		return phone;
	}

	public void setPhone(Double phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	// to string
	
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", order_id=" + order_id + ", phone=" + phone + ", email="
				+ email + "]";
	}
	
	

}
