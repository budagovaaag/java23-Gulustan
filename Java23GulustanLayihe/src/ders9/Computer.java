package ders9;

public class Computer {
	Integer id;
	String brand;
	String model;
	String color;
	
	public Computer() {
		System.out.println("defoult");
	}
	public Computer(String model) {
		this.model=model;
		System.out.println("model");
	}
	public Computer(String model, String color) {
		this.model=model;
		this.color=color;
		System.out.println("model ve color");
	}

}
