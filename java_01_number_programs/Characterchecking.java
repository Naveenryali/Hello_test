package java_01_number_programs;

import java.util.Scanner;

public class Characterchecking {

	public static void main(String[] args) {
		System.out.println("Enter a character");
		Scanner sc=new Scanner(System.in);
		char ch=sc.next().charAt(0);
		if(ch>='A'&&ch<='Z')
		{
			System.out.println("Enter character is upper case");
		}
		else if(ch>='a'&&ch<='z')
		{
			System.out.println("Enter character is lower case");
			
		}
		else if(ch>='0'&&ch<='9')
		{
			System.out.println("Enter character is digit");
		}
		else
		{
			System.out.println("Enter character is special character");
		}
		sc.close();
		

	}

}
