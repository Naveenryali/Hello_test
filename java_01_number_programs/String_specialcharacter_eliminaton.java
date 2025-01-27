package java_01_number_programs;

import java.util.Scanner;

public class String_specialcharacter_eliminaton {

	public static void main(String[] args) {
		System.out.println("Enter a string");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		sc.close();
		String s1="";
		 for(int i=0;i<s.length();i++)
		 {
			 if(s.charAt(i)>64 && s.charAt(i)<122)
			 {
				 s1=s1+s.charAt(i);
			 }
			 
		 }
		 System.out.println(s1);

	}

}
