package java_05_strings;

import java.util.Scanner;

public class String05 {
public static void main(String[] args) {
	System.out.println("Enter a string ");
	Scanner sc=new Scanner(System.in);
	String str =sc.nextLine();
	System.out.println("Enter a character to remove from the string");
	char ch=sc.next().charAt(0);
	String ans=" ";
	sc.close();
	
	for(int i=0;i<str.length();i++)
	{
		if(str.charAt(i)!=ch)
		{
			ans=ans+str.charAt(i);
		}
		
	}
	System.out.println(ans);
	
}
}