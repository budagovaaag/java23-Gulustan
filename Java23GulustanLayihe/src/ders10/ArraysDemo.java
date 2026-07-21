package ders10;

public class ArraysDemo {
	public static void main(String[] args) {
		int [] numbers= {22, 24, 15, 13, 12};
		int sum=0;
		int min=numbers[0];
		for (int i=1; i<numbers.length; i++) {
			sum+=numbers[i];
			if (numbers[i]< min) {
				min=numbers[i];
			}
			if(numbers[i]%2!=0) {
				System.out.println(numbers[i]);
			
			}
			
			
		}
		System.out.println(sum);
		System.out.println(sum/numbers.length);
		System.out.println(min);
		
		
		
		
		
		
		
		
		
		
		
		
		
		int[] numbersss= {15,18,23,97};
		int summ=0;
		int minn=numbersss[0];
		
		for(int i=0; i<numbersss.length; i++) {
			int say=0;
			summ+=numbersss[i];
			for(int j=1; j<=numbersss[i]; j++) {
				if(numbersss[i]%j==0) {
					say++;
				}
							
			}
			if(say==2) {
				System.out.println("sade:"+numbersss[i]);
//			if (numbersss[i]<minn) {
//				minn=numbersss[i];
//				
//			}
		}
//		for(int n:numbersss) {
//			System.out.println(n);
//		}
//		System.out.println(sum/numbersss.length);
//		System.out.println(minn);
//		
//		
	}

}
}
