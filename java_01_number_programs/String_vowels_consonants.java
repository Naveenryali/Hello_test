package java_01_number_programs;

import java.util.Scanner;

public class String_vowels_consonants {

	public static void main(String[] args) {
		System.out.println("Enter a string");
		Scanner sc =new Scanner(System.in);
		String s = sc.nextLine();
		sc.close();
		s=s.toLowerCase();
		int	 lnt =s.length();
		int count =0;
		int cons =0;
		for (int i =0;i<lnt;i++)
		{
			if(s.charAt(i)=='a' ||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
			
				{
					count++;
				}
				else
				{
					cons++;
				}
				
		}
		System.out.println("number of vowels in a given string:"+" "+count);
		System.out.println("number of consonants in a given string :"+ cons);
		

	}

}
