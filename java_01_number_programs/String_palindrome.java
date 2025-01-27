package java_01_number_programs;

import java.util.Scanner;

public class String_palindrome {

	public static void main(String[] args) {
		System.out.println("Enter a string");
		Scanner sc =new Scanner(System.in);
		String s=sc.nextLine();
		sc.close();
		String c="";
		for(int i=s.length()-1;i>=0;i--)
		{
			c=c+s.charAt(i);
		}
		System.out.println(c);
		if(s.equals(c))
		{
			System.out.println("It is a palindrome");
		}
		else
		{
			System.out.println("not a palindrome");
		}
	}

}
