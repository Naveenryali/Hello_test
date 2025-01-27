package java_05_strings;

import java.util.Scanner;

public class String04 {
public static void main(String[] args) {
	//Program to count the total number of Words,Numbers,Spl characters,vowels
	//and consonants in a string
	System.out.println("Enter a string");
	Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();
	s=s.toLowerCase();
	//char String[]=s.toCharArray();
	sc.close();
	int tw=0,tn=0,ts=0,tv=0,tc=0;
	String[] w=s.split(" ");
	
	for(int i=0;i<w.length;i++)
	{
		tw++;
	}
//	for(String i:w)
//	{
//		tw++;
//	}
//	System.out.println(tw);
	
	for(int i=0;i<s.length();i++)
	{
		char ch=s.charAt(i);
		if(Character.isAlphabetic(ch))
		{
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{
				tv++;
			}
			else 
			{
				tc++;
			}
			
		}
		else if(Character.isDigit(ch))
		{
			tn++;
		}
		else if(!Character.isDigit(ch)&&!Character.isAlphabetic(ch)&& ch!=' ')
		{
			ts++;
		}	
		
	}
	System.out.println("Total no of digits "+tn);
	System.out.println("Total number of vowels "+tv);
	System.out.println("Total number of consonants "+tc);
	System.out.println("Total number of special characters "+ts);
	System.out.println("Total number of words "+tw);
	
}
}
