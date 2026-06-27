package ders5;

public class Reqemcemi {
	public static void main(String[] args) {
		int eded=2206;
		int cem=0;
		
		for( ; eded>0; ) {
			int qaliq=eded%10;
			cem+=qaliq;
			eded=eded/10;
			
		}
		System.out.println(cem);

	}

}
