package ders11;

public class DersPrak2 {
	public static void main(String[] args) {
		char[] arr= {'a','b', '2' ,'c','6','d','A' };
		String text=new String(arr);
		System.out.println(text);
		System.out.println(text.matches("[a-zA-Z]{5}"));
		System.out.println(text.isEmpty());
		System.out.println(text.isBlank());
		
		
		
	}
	
}
