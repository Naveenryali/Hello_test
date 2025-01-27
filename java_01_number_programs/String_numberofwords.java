package java_01_number_programs;

import java.util.Scanner;

public class String_numberofwords {

	public static void main(String[] args) {
		System.out.println("Enter a string");
		Scanner sc=new Scanner(System.in);
		String s =sc.nextLine();
		sc.close();
		int len=s.length();
		int c=1;
		for(int i=0;i<len;i++)
		{
			
			if((s.charAt(i)==' ')&& (s.charAt(i+1)!=' '))
			{
				c++;
				
			}
		}
		System.out.println(c);

	}

}
