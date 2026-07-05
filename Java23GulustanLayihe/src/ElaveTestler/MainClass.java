package ElaveTestler;

public class MainClass {
	public static void main( String[] args) {
	Computer c=new Computer();
	c.brand="Asus";
	c.ram=8;
	c.price=1200.0;
	
	DiscountCalculator calculate=new DiscountCalculator();
	calculate.calculateDiscount(c);
	
	c.showDetails();
	
	}
}
