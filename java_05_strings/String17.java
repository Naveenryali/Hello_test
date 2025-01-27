package java_05_strings;

import java.util.Scanner;

public class String17 {
public static void main(String[] args) {
	//Program to search a word inside a string?
	System.out.println("Enter a string");
	Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();

	System.out.println("Enter a word to search");
	String w=sc.nextLine();
	
	if(s.contains(w))
	{
		System.out.println("Word is found");
	}
	
	else
	{
		System.out.println("Word is not found");
	}
	System.out.println("Enter a string");
	
	String s2=sc.nextLine();
	System.out.println("Enter a word to search");
	String s1=sc.nextLine();
	
	String []sa=s2.split(" ");
	
	boolean found=false;
	for(String word:sa)
	{
		if(word.contains(s1))
		{
				System.out.println(" word found :"+word);
				found=true;
		}
	}
	
	if(!found)
	{
		System.out.println("Word not found");
	}
	sc.close();
			
}
}
