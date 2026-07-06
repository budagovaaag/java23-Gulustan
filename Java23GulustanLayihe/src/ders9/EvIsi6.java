package ders9;

import java.util.Random;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class EvIsi6 {
	public static void main(String[] args) {
		Random rd=new Random();
		int ed=rd.nextInt(21)+30;
		System.out.println(ed);
		
		
		int k=64;
		System.out.println(Math.sqrt(k));
		
		int l=5;
		System.out.println(Math.pow(5, 3));
		
		double m=7.86;
		BigDecimal bd=new BigDecimal(Double.toString(m));
		bd=bd.setScale(1, RoundingMode.HALF_UP);
		System.out.println(bd);
	}
	

}
