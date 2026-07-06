package ders9;

public class MainClass {
	public static void main(String[] args) {
		Person p=new Person();
		p.name="Gulustan";
		p.surname="Budagova";
		p.experienceYear=6;
		p.phone="0557226222";
		
		SalaryCalculate calculator=new SalaryCalculate();
		
		calculator.calculateSalary(p);
		
		p.printInfo();
		
		
		
		
		
		Circle c=new Circle();
		c.radius=6;
		
		Calculator calc=new Calculator();
		calc.calculateCircleLength(c);
		System.out.println(c.length);
		
	}
	

}
