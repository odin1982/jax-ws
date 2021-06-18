package org.jaxws.bottom.up;

public class Employee {
	private int id;
	private String firstName;
	
	public Employee() {
		this.id = 1;
		this.firstName = "Odin";
	}
	
	public Employee(int id,String firstName) {
		this.id = id;
		this.firstName = firstName;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
}
