package java_05_strings;

import java.util.Scanner;

public class String12 {
public static void main(String[] args) {
	//Program to count the number of vowels and consonants in a given string.
	System.out.println("Ente a string");
	Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();
	sc.close();
	int count=0;
	int cons=0;
	s=s.toLowerCase();
	for(int i=0;i<s.length();i++)
	{
		if(Character.isAlphabetic(s.charAt(i))) {
		if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
		{
			count++;
		}
		else
		{
			cons++;
		}
		}
		
	}
	System.out.println("vowels :"+count);
	System.out.println("consonants:"+cons);
}
}
