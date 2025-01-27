package test;

import java.util.Scanner;

public class Ratioofnumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		
		String s=sc.nextLine();
		
		s=s.toLowerCase();
		int cc=0,vc=0,nc=0,sp=0;
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			
			if(Character.isAlphabetic(ch))
			{
				if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
				{
					vc++;
				}
				else
				{
					cc++;
				}
					
			}
			else if(Character.isDigit(ch))
			{
				nc++;
			}
			else if(!Character.isAlphabetic(ch)||!Character.isDigit(ch))
			{
				sp++;
			}
			
		}
		System.out.println((double)vc*100/s.length()+"%");
		System.out.println(cc*100/s.length()+"%");
		System.out.println(nc*100/s.length()+"%");
		System.out.println(sp*100/s.length()+"%");
		
		int vowelcount=0,consonants=0,numbers=0,specialcharacter=0;
		
		for(int i=0;i<s.length();i++)
		{
			
			char ch=s.charAt(i);
			if(ch>='a'&& ch<='z')
			{
				if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
				{
					vowelcount++;
				}
				else {
					consonants++;
				}
				
			}
			else if(ch>='0'&&ch<='9')
			{
				numbers++;
				
			}
			else
			{
				specialcharacter++;
			}
			
			
		}
			System.out.printf("Vowels %.2f%%\n",(double)vowelcount*100/s.length());
			System.out.println((double)consonants*100/s.length()+"%");
			System.out.println((double)numbers*100/s.length()+"%");
			System.out.println((double)specialcharacter*100/s.length()+"%");
			
			sc.close();
		
	}
}
