package java_01_number_programs;

import java.util.Scanner;

public class String_commoncharacters {

	public static void main(String[] args) {
		System.out.println("Enter a string");
		Scanner sc =new Scanner(System.in);
		String s1=sc.nextLine();
		System.out.println("Enter second string s2");
		String s2=sc.nextLine();
		sc.close();
		
		String temp="";
		for(int i=0;i<s1.length();i++)
		{
			for(int j=0;j<s2.length();j++)
			{
				if(s1.charAt(i)==s2.charAt(j))
				{
					temp=temp+s1.charAt(i);
				}
			}
			
		}
		System.out.println(temp);

	}

}
