package ders9;

public class Employee {
	Integer id;
	String name;
	String surname;
	String phone;
	String address;
	int salary;

	
	
	public Employee() {
		System.out.println("default");
	}
	public Employee(String name) {
		this.name=name;
		System.out.println("name");
	}
	public Employee(String name, String surname) {
		this.name=name;
		this.surname=surname;
		System.out.println("name and surname");
	}
	public Employee(String name,String phone, int salary) {
		this.name=name;
		this.phone=phone;
		this.salary=salary;
		System.out.println("name and phone and salary");
	}
}
