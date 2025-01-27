package java_01_number_programs;

import java.util.Scanner;

public class OccurencesofaNumber {
	public static void main(String[] args) {
		
String s="645646468834";
char ch;
System.out.println("Enter a number ");
Scanner sc=new Scanner(System.in);
ch=sc.next().charAt(0);
int count=0;
for(int i=0;i<s.length();i++)
{
	if(s.charAt(i)==ch)
	{
		count++;
	}
}
System.out.println(" occurences of a " +ch+" is " +count);
sc.close();
	}
}
