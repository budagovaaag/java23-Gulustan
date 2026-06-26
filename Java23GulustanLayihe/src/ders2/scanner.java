package ders2;
import java.util.Scanner;
public class scanner {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Kodunuzu daxil edin");
		String code=scanner.nextLine();
		System.out.println(code);
		scanner.close();
	}
}
