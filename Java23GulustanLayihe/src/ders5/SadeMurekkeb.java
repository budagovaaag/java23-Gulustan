package ders5;

public class SadeMurekkeb {
	public static void main(String[] args) {
		int i=22;
		int k=0;
		for (int j=1; j<=i; j++) {
			if(i%j==0) {
				k++;
				
			}
		}
		if (k==2) {
			System.out.print("sadedir");
		}else {
			System.out.print("murekkebdir");
		}
		
	}

}
