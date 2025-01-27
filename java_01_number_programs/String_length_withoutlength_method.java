package java_01_number_programs;

import java.util.Scanner;

public class String_length_withoutlength_method {

	public static void main(String[] args) {
		System.out.println("Eter a string");
		Scanner sc = new Scanner(System.in);
		String s =sc.nextLine();
		sc.close();
		int length =0;
		
		char[] a=s.toCharArray();
		for(char c:a )
		{
			System.out.println(c);
			length++;
		}
		System.out.println(length);
		
	}

}
