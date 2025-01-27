package java_01_number_programs;

import java.util.Scanner;

public class String_removeacharacter {

	public static void main(String[] args) {
		System.out.println("Enter a string");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		System.out.println("Enter a character to remove");
		char ch=sc.next().charAt(0); 
		String t=String.valueOf(ch);
		System.out.println(s.replace(t,""));
		sc.close();
		
		
	}

}
