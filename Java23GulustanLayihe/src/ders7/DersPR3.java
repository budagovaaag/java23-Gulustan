package ders7;

public class DersPR3 {
	
	//azalan sira
	
	public static void main(String[] args) {
		
		for (int a=50; a>20; a--) {
			System.out.println(a);
		}
		
	//0 dan 5 e 0.1 artim
		for (double b=0; b<5;  ) {
			b+=0.1;
			System.out.println(b);
		}
		
	//en boyuk reqem
		int k=12324534;
		int max=0;
		int qaliq=0;
		
		while (k>0) {
			qaliq=k%10;
			if (max<=qaliq) {
				max=qaliq;
				
			}
		k/=10;
		
		}
		System.out.println(max);
		
		
	//en kiciy reqem
		int l=12324534;
		int min=9;
		int qalq=0;
		
		while (l>0) {
			qalq=l%10;
			if (min>=qalq) {
				min=qalq;
				
			}
		l/=10;
		}
		System.out.println(min);
		
	}
	
	
}
