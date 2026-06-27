package ders5;

public class Sadeeded {
	public static void main(String[] args) {
		for (int i=2; i<=20; i++) {
			int k=0;
			for (int j=1; j<=i; j++) {
				if (i%j==0) {
					k++;
				
				}
			}
			if (k==2) {
				System.out.println(i);
		}
		
		}
	}
}
