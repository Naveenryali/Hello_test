package java_05_strings;

import java.util.Scanner;

public class String16 {
public static void main(String[] args) {
	//Program to replace a substring inside a string by another one ?
	System.out.println("Enter a string");
	Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();
	
	String s1=s.substring(6);
	System.out.println(s1);
	System.out.println("Enter a substring to replace");
	String s2=sc.nextLine();
	s=s.replace(s1,s2);
	System.out.println(s);
	sc.close();
}
}
