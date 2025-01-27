package java_05_strings;

import java.util.Scanner;

public class String19 {
public static void main(String[] args) {
	//Write a program to Print strings in reverse order word by word.
	System.out.println("Enter a string");
	Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();
	sc.close();
	String [] stringarray=s.split(" ");
	String res="";
	
	for(String w:stringarray)
	{
		String rew="";
	
		for(int i=w.length()-1;i>=0;i--)
		{
			rew=rew+w.charAt(i);
			
		}
		res=res+rew+" ";
			
	}
	System.out.println(res);
	
}
}
