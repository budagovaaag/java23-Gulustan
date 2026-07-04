package ders9;

public class Methods {
	public void printName(int count,String name) {
		for (int i = 1; i <= count; i++) {
			System.out.println(name);
		}
	}

	public static void main(String[] args) {
		Methods obj = new Methods();
		
	    obj.printName(22, "Gulustan");
	    System.out.println();

	    obj.printName(19, "Aytac");
	    System.out.println();

	    obj.printName(8, "Sadig");
	    System.out.println();

	
}
}