package java_01_number_programs;

import java.util.Scanner;

public class String_occurance {

	public static void main(String[] args) {
		System.out.println("Enter a string");
		Scanner sc =new Scanner(System.in);
		String s=sc.nextLine();
		System.out.println("Enter a character to check frequency");
		char t =sc.next().charAt(0);
		sc.close();
		int count =0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==t)
			{
				count++;
			}
			
		}
		System.out.println("number of occurances of character"+" "+t+" "+count);

	}

}
