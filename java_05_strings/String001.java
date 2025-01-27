package java_05_strings;

import java.util.Scanner;

public class String001 {
public static void main(String[] args) {
	String s1="Naveen ";
	String s2 ="Ryali";
	System.out.println(s1.concat(s2));
	System.out.println(s1.charAt(1));
	System.out.println(s2.length());
	String str="Sai Venkat";
	System.out.println(str.substring(4));
	System.out.println(str.replace(" ", "_"));
	
	String s3=" Hi my name is naveen,how aimport util;re you";
	String regex="[,\\s]";
	String[] strarray=s3.split(regex);
	for(String s:strarray)
	{
		System.out.println(s);
	}
	System.out.println();
	String s4="my world is small";
	System.out.println(s4.indexOf("world"));
	
	String s5="Sai venkat naveen";
	System.out.println(s5.toUpperCase());
	System.out.println(s5.toLowerCase());
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a character to check");
	 char ch=sc.next().charAt(0);
	 String s="Naveen";
	 s=s.toLowerCase();
	 
	 
	 int count =0;
	 for(int i=0;i<s.length();i++)
	 {
		 if(s.charAt(i) == ch)
		 {
			 System.out.println(ch+" is appeared at index "+i);
			 count++;
		 }
		
	 }
	 System.out.println();
	 if(count >0) {
	 System.out.println(ch+" is appeared in the sentence "+count+" times");
	 }
	 else
	 {
		 System.out.println(ch+" is not found");
	 }
	 sc.close();
	 
}
}
