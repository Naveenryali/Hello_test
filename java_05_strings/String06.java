package java_05_strings;

import java.util.Scanner;

public class String06 {
public static void main(String[] args) {
	System.out.println("Enter a string");
	Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();
	sc.close();
	String[] s1=s.split(" ");//split function

	String s5=" ";

	for(String s2:s1) {

	String s3=s2.substring(0,1).toUpperCase();
	System.out.println(s3);
	String s4=s2.substring(1);
	System.out.println(s4);

	s5=s5+s3+s4+" ";

	

	}

	System.out.println(s5);


	
}
}
