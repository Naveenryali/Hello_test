package java_01_number_programs;

import java.util.Arrays;

public class String_Angaram {

	public static void main(String[] args) {
		String str1 = "listen";
		
		String str2 = "silent";
		char[] charArray1=str1.toCharArray();
		char[] charArray2=str2.toCharArray();
		Arrays.sort(charArray1);
		Arrays.sort(charArray2);
		boolean isAngaram =Arrays.equals(charArray1,charArray2);
		System.out.println("Are Angarams :"+isAngaram);
		

	}

}
