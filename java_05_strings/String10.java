package java_05_strings;

import java.util.Scanner;

public class String10 {
public static void main(String[] args) {
	System.out.println("Enter a string");
	Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();
	sc.close();
	char[] ch=s.toCharArray();
	
	String s2="";
	
	
	for(int i=ch.length-1;i>=0;i--)
	{
		if(ch[i]>='a'&&ch[i]<='z'||ch[i]>='A'&&ch[i]<='Z')
		{
			s2=ch[i]+s2;
		}
		
	}
	System.out.println(s2);
	String s3="";
	for( char c:ch)
	{
		if(Character.isAlphabetic(c)) {
		s3=c+s3;
		
		}
	}
	System.out.println(s3);
}
}
