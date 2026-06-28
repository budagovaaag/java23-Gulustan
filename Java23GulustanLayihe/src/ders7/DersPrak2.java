package ders7;

public class DersPrak2 {
	public static void main(String[] args) {
		
		//1ve 5 araligi
		int a=1;
		while (a<6) {
			System.out.println(a);
			a++;
		}
		
	//iki eded cemleyen
		int k=22;
		int b=6;
		System.out.println(k+b);
		
	//iki eded vuran
		int q=22;
		int w=6;
		System.out.println(q*w);
		
	//cevrenin uzunlugu
		double r=1.2;
		System.out.println(2*3.14*r);
		
	//reqemler cemi
		long l=22062008L;
		int v=0;
		while (l>0) {
			int qaliq=(int)l%10;
			v+=qaliq;
			l/=10;
			
		}
		System.out.println(v);
		
		
		//sade true 
		int t=1;
		int c=0;
		for (int j=29; t<=j ; t++) {
			if (j%t==0) {
				c++;
			}
		}
		if (c==2) {
			System.out.println("sadedir");
		}else {
			System.out.println("murekkeb");
		}
		
		
	//1 den 100 e cem
		int d=1;
		int cem=0;
		while (d<101) {
			cem+=d;
			d++;
		}
		System.out.println(cem);
		
	//1den 100e 7e qaliqsiz
		int n=1;
		while (n<101) {
			if (n%7==0) {
				System.out.println(n);
			}
			n++;
		}
		
		
	//cut tek
		int mm=26;
		if (mm%2==0) {
			System.out.println("Cutdur");
		}else {
			System.out.println("Tekdir");
		}
		
	//1den200e hem3 hem7
		int e1=1;
		while(e1<=200) {
			if(e1%3==0 && e1%7==0) {
				System.out.println(e1);
			}
		e1++;
		}
		
	//ilk 20 sade eded
		int e2=2;
		int y1=1;
		while (y1<=20) {
			int xx=0;
			for (int e3=1; e2>=e3; e3++ ) {
				if(e2%e3==0) {
					xx++;
				}
			}
			if(xx==2) {
				System.out.println(e2);
				y1++;
			}
			e2++;
		}
	}

}
