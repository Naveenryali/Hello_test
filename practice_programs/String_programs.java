package practice_programs;

import java.util.Scanner;

public class String_programs {

	public static void main(String[] args) {
		System.out.println("Enter a string");
		Scanner sc= new Scanner(System.in);
		
		String s=sc.nextLine();
		System.out.println(s.length());
		int length =0;
		for(int i=0;i<s.length();i++)
		{
			length++;
		}
		System.out.println(length);
		sc.close();
		
		}
}
