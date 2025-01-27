package java_01_number_programs;

import java.util.Arrays;
import java.util.Scanner;

public class String_Ascendingorder {

	public static void main(String[] args) {
		System.out.println("Enter a string");
		Scanner sc =new Scanner(System.in);
		
		String s =sc.nextLine();
		
		sc.close();
		s=s.toLowerCase();
		char[] ch = s.toCharArray();
		Arrays.sort(ch);
		System.out.println(ch);
	}

}
