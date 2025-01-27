package java_05_strings;

import java.util.Scanner;

public class String14 {

	
	public static void main(String[] args) {
		
		
System.out.println("Enter a string");
		
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		
		String s1[]=s.split(" ");
		
		String s2="";
		String s3="";
		String s4="";
		for( String word:s1)
		{
			 s2=word.substring(1);
			 s3=s2.substring(0,1);
			 s4=s4+s3+s2+" ";	
		}
		
		System.out.println(s4);
		sc.close();
		
	}
}
