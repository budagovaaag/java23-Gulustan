package ders9;

public class Calculator {
	public double average(int a, int b) {
		return (a+b)/2.0;
	}

	public static void main(String[] args) {
		Calculator obj=new Calculator();
		System.out.println(obj.average(22, 6));
		System.out.println(obj.average(18, 22));
	}
	public void calculateCircleLength(Circle circle) {
		circle.length=circle.radius*2*3.14;
	}
}
