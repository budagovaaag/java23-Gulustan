package ders11;

public class derPrak1 {
	public static void main(String[] args) {
		String name="Cavid";
		System.out.println(name);
		
		String message="Java dili guclu ve efektli bir prog dilidir";
		System.out.println(message);
		
		System.out.println(message.length());
		System.out.println(message.charAt(1));
		System.out.println(message.indexOf('i'));
		System.out.println(message.toLowerCase());
		System.out.println(message.toUpperCase());
		System.out.println(message.contains("dili"));
		System.out.println(message.endsWith("dir"));
		System.out.println(message.startsWith("ja"));
		
		String full=name+"  Adil  ";
		System.out.println(full);
		System.out.println(full.trim());
		String full1=full+"Bextiyar";
		System.out.println(full1);
		System.out.println(name.substring(0, 4));
		
		String[] arr=full1.split(" ");
		System.out.println(full1.length());
		
		
		
	}

}
