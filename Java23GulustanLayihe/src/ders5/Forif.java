package ders5;

public class Forif {
	public static void main(String[] args) {
		int c=0;
		for(int i=1; i<101; i++) {
			if (i%2==0 ) {
				c+=i;
			}
		}
		System.out.println(c);

	}

}
