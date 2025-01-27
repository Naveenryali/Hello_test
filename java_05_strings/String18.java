package java_05_strings;

import java.util.Scanner;

public class String18 {
	public static boolean isVowel(char ch)
	{
		ch=Character.toLowerCase(ch);
		 return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
		
	}

	
	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		
		String s=sc.nextLine();
		int uc=0,lc=0,vo=0,co=0,dig=0,sp=0;
		
		for( char ch:s.toCharArray())
		{
			if(Character.isUpperCase(ch))
			{
				uc++;
				if(isVowel(ch))
				{
					vo++;
				}
				else
				{
					co++;
				}
				
			}
			else if(Character.isLowerCase(ch))
			{
				lc++;
				if(isVowel(ch))
				{
					vo++;
				}
				else
				{
					co++;
				}
			}
			else if(Character.isDigit(ch))
			{
				dig++;
			}
			else if(!Character.isWhitespace(ch))
			{
				sp++;
			}
		}
		int l=s.length();
		double upperpercent=(uc*100)/l;
		System.out.printf("Upper case percentage : %.2f%%\n",upperpercent);
		System.out.printf("lower case percentage : %.2f%%\n",(double)lc*100/s.length());
		System.out.printf("Vowels percentage : %.2f%%\n",(double)vo*100/s.length());
		System.out.printf("Consonants percentage :%.2f%%\n",(double)co*100/s.length());
		System.out.printf("Digits percentage :%.2f%%\n",(double)dig*100/s.length());
		System.out.printf("Special character percentage :%.2f%%\n",(double)sp*100/s.length());
		
		sc.close();
				
	}
}
