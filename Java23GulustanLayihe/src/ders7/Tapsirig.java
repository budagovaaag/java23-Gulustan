package ders7;

public class Tapsirig {
	public static void main(String[] args) {
		
	//1den n e qeder cem
		int a=1;
		int cem=0;
		
		for (int n=22; n>=a; a++) {
			cem+=a;
		}
		System.out.println(cem);
		
	//faktorial
		int f=1;
		int q=1;
		
		for (int m=6; m>=q; q++) {
			f*=q;
		}
		System.out.println(f);
		
	//1 den 100 e cut
		int b=1;
		 while (b<=100) {
			 if (b%2==0) {
				 System.out.println(b);
			 }
		 b++;
		 }
		
	// 1 den 50 ye 3e bolunenler
		 int g=1;
		 
		 while (g<50) {
			 if (g%3==0) {
				 System.out.println(g);
			 }
		 g++;
		 }
		 
	//sade kalkulyator
		 int l=12;
		 int j=22;
		 char op='*';
		 
		 if (op=='+') {
			 System.out.println(l + "op" + j);
		 }else {
			 System.out.println(l+ op +j );
		 }
		 
	//maas
		 double salary=2500;
		 int ExpYear=6;
		 boolean hasCert=true;
		 
		 if (ExpYear>5) {
			 salary*=1.2;
		 }
		 if (hasCert==true) {
			 salary+=200;
		 }
		 System.out.println(salary);
		 
	//reqem sayi
		 int numb=25067;
		 int say=0;
		 
		 while (numb>0) {
			 say++;
			 numb/=10;
		 }
		 System.out.println(say);
		 
	//reqemler hasili
		 int nu=2266;
		 int has=1;
		 int qaliq=0;
		 
		 while (nu>0) {
			 qaliq=nu%10;
			 has*=qaliq;
			 nu/=10;
		 }
		 System.out.println(has);
		 
	//ededin tersi
		 int nb=2365;
		 int ters=0;
		 int qali=0;
		 
		 while (nb>0) {
			 qali=nb%10;
			 ters=ters*10+qali;
			 nb/=10;
		 }
		 System.out.println(ters);
		 
	//palindrom
		 int ed=1221;
		 int terss=0;
		 int qal=0;
		 int km=ed;
		 
		 while (ed>0) {
			 qal=ed%10;
			 terss=terss*10+qal;
			 ed/=10;
		 }
		 System.out.println(terss);
		 if (terss==km) {
			 System.out.println("Polindrom");
		 }else {
			 System.out.println("Polindrom deyil");
		 }
		 
	//1 den 100 sade eded sayi
		 int gs=2;
		 int cm=0;
		 
		 while (gs<=100) {
			 int s=0;
			 for(int jk=1; jk<=gs; jk++) {
				 if (gs%jk==0) {
					 s++; 
				 }
			 }
			 if(s==2) {
				 cm++;
			 }
			 
		 gs++;
		 }
		 System.out.println(cm);
		 
	//en boyuk reqem ve sayi
		 int nmb=912899;
		 int max=0;
		 int qalliq=0;
		 int cq=0;
		 
		 while (nmb>0) {
			 qalliq=nmb%10;
			 if (max<=qalliq) {
				 max=qalliq;
				 cq++;
			 }
		 nmb/=10;
		 }
		 System.out.print(max+","+cq);
		 
		 
	//Maaş statistikası
//		 int s1=1200;
//		 int s2=1400;
//		 int s3=1700;
//		 int s4=1000;
//		 int s5=2000;
//		 int or=0;
//		 int sy=0;
//		 int ebq=0;
//		 int ekq=0;
		 
		 
		 
		 
	//ebob
		 int a1=36;
		 int b1=60;
		 
		 if (a1<b1) {
			 for (int sd=1; sd<=a1; sd++) {
				 if (a1%sd==0 && b1%sd==0) {
					 System.out.println(sd);
				 }
			 } 
			 }else {
				 for (int sd=1; sd<=b1; sd++) {
					 if (a1%sd==0 && b1%sd==0) {
						 System.out.println(sd);
				 
		 }
	}

	 }
		 
	//ekob
		 int h=36;
		 int m=60;
		 
		 int ekob= (h>m) ? h:m;
		 while(true) {
			 if (ekob%h==0 && ekob%m==0 ) {
				 System.out.println(ekob);
				 break;
			 }
			ekob++;
		 }
		 
		 
			 
		 
		 
	//kod check
		 
		 String pass="Java123";
		 int uz=pass.length();
		 
		 if (uz>8) {
			 System.out.println("true");
		 }else {
			 System.out.println("false");
		 }
		 
		 
}
}
