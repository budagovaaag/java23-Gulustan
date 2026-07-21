package ders11;

public class sstringg {
	public static void main(String[] args) {
		String result= replaceWord(
				"Java strong lang",
				"strong",
				"perfect");
		
		System.out.println(result);
			
	}
	
	public static String replaceWord(String text,
                                 String oldWord,
                                 String newWord) {
		
		return text.replace(oldWord, newWord);
	}

}
