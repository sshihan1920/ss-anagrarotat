import java.util.Scanner;

public class Lab01 {
	

/*Anagram Checker Method*/
	public static boolean isAnagram(String str1, String str2) {	
		
		int truthVal1 = 0;
		
		char[] str1Letters = str1.toCharArray();
		char[] str2Letters = str2.toCharArray();
		
		if (str1.length() != str2.length()) {
			return false;
		}	
		
			for (int a = 0; a < str1.length(); ++a) {
				for (int b = 0; b < str2.length(); ++b) {
					if (str1Letters[a] == str2Letters[b]) {
					truthVal1++;
					str2Letters[b] = '\0';
					str1Letters[a] = '\0';
					}
				}
			}
		
		if (truthVal1 >= str1.length()) {
		return true;
		} 
		return false;
	}	
		
/*Rotation Checker Method*/
	public static boolean isRotation(String str1, String str2) {
		
		int truthVal2 = 0;
		
		char[] str1Letters = str1.toCharArray();
		char[] reverseString1 = new char [str1.length()];
		char[] str2Letters = str2.toCharArray();
		
		
		if (str1.length() != str2.length()) {
			return false;
		}
		
		int length = str1.length(); 
	       for (int x = 0; x < length; x++) { 
	            reverseString1[length - x - 1] = str1Letters[x];  
	        } 
	       
	       for (int y = 0; y < length; y++) { 
			if (reverseString1[y] == str2Letters[y]) {
				truthVal2++;
			}
		}	
	       
		if (truthVal2 == str1.length()) {
				return true;
				} 
		else 	{	
			return false;
		}	
}
	
/*Main Method*/
	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		String str1 = scnr.next();
		String str2 = scnr.next();
		
		if (isAnagram(str1, str2)) {
			System.out.println("Anagram: True");
		}
		else {
			System.out.println("Anagram: False");
		}
		
		if (isRotation(str1, str2)) {
			System.out.println("Rotation: True");
		}
		else {
			System.out.println("Rotation: False");
		}
}
}
