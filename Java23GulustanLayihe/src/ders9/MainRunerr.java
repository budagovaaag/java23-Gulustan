package ders9;

public class MainRunerr {
	public static void main(String[] args) {
	Personn p1=new Personn();
	p1.id=123;
	p1.namee="Sadig";
	p1.surnamee="Bayramov";
	p1.age=18;
	
	
	System.out.println("person 1");
	System.out.println(p1.id);
	System.out.println(p1.namee);
	System.out.println(p1.surnamee);
	System.out.println(p1.age);
	
	Employee e1=new Employee();
	e1.name="ali";
	e1.id=123;
	e1.surname="budag";
	e1.phone="22335412";
	e1.salary=2500;
	
	System.out.println(e1.name);
	System.out.println(e1.id);
	System.out.println(e1.surname);
	System.out.println(e1.phone);
	
	Employee e2=new Employee("rasim");
	e2.id=321;
	e2.surname="ceferli";
	e2.phone="12335412";
	e2.salary=2300;
	System.out.println(e2.id+e2.surname+e2.phone+e2.salary);
	
	
	Methodds mh=new Methodds();
	
	mh.printNumbers(6, 22);
	mh.printNumbers(16,23);

	}
}
