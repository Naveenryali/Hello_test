package java_05_strings;

import java.util.Arrays;
import java.util.Scanner;

public class String09 {
public static void main(String[] args) {
	System.out.println("Enter a string");
	Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();
	sc.close();
	s=s.toLowerCase();
	char[] ch=s.toCharArray();
	Arrays.sort(ch);
	System.out.println(ch);
	String s2="";
	for(int i=0;i<ch.length;i++)
	{
		s2=ch[i]+s2;
		
	}
	System.out.println(s2);
}
}
