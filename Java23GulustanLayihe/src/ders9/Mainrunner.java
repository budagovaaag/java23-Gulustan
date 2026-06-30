package ders9;

public class Mainrunner {
	public static void main(String[] args) {
		Car bmw=new Car("e39" , "black" , 0 , 15000); 
		bmw.start();
		bmw.stop();
		
	//book
		Book book1=new Book();
		book1.id=11232;
		book1.name="Sefiller";
		book1.author="Victor Hugo";
		book1.pageCount=1200;
		book1.description="fransiz edebiyyati";
		
		Book book2=new Book();
		book2.id=11323;
		book2.name="Xosrov ve Sirin";
		book2.author="Nizami Gencevi";
		book2.pageCount=400;
		book2.description="Poema";
		
		System.out.println("Book 1");
		System.out.println("ID:" + book1.id);
		System.out.println("NAME:" + book1.name);
		System.out.println("AUTHOR:" + book1.author);
		System.out.println("PAGECOUNT:"+ book1.pageCount);
		System.out.println("DESCRIPTION:" + book1.description);
		
		System.out.println("Book 2");
		System.out.println("ID:" + book2.id);
		System.out.println("NAME:" + book2.name);
		System.out.println("AUTHOR:" + book2.author);
		System.out.println("PAGECOUNT:"+ book2.pageCount);
		System.out.println("DESCRIPTION:" + book2.description);
		
		
		
	//comp
		Computer comp1=new Computer();
		comp1.id=223311;
		comp1.brand="asus";
		comp1.model="ZenBook";
		comp1.color="Gumusu";
		
		
		Computer comp2=new Computer("MacBook");
		comp2.id=3322;
		comp2.brand="Apple";
		comp2.color="Boz";
		
		
		Computer comp3=new Computer("Victus" ,"Qara");
		comp3.id=2244;
		comp3.brand="HP";
		
		System.out.println("COMP1 " + "ID:"+ comp1.id + " BRAND:"+ comp1.brand+" MODEL:"+comp1.model+" COLOR:"+comp1.color);
		System.out.println("COMP2 " + "ID:"+ comp2.id + " BRAND:"+ comp2.brand+" MODEL:"+comp2.model+" COLOR:"+comp2.color);
		System.out.println("COMP3 " + "ID:"+ comp3.id + " BRAND:"+ comp3.brand+" MODEL:"+comp3.model+" COLOR:"+comp3.color);
	}

}
