package java_01_number_programs;

import java.util.Scanner;

public class Ifprogram {
public static void main(String[] args) {
//
//	int age = 13;
//	 
//	if (age<18)
//	{
//		System.out.println("student is not elgible for match");
//	}
//	
	// System.out.println("Enter your age");
	//System.out.println("enter a value");
	//System.out.println("enter the year");
	System.out.println("enter a value");
	Scanner sc = new Scanner(System.in);
	
	int number =sc.nextInt();
	
	
	
//	if (age>18)
//	{
//		System.out.println("You are elegible for the test");
//		
//	
//	}
//	else
//	{
//		System.out.println("you are not elgible for the test");
//		
//	}
//	sc.close();
	
	//even/odd
	
	
//	if (number%2==0)
//	{
//		System.out.println("even number");
//	}
//	else
//	{
//		System.out.println("odd number");
//	}
//	sc.close();
	
	//leap year
	
//	if(((year%4==0)&&(year%100!=0))||(year%400==0))
//	{
//		System.out.println("it is a leap year");
//	}
//	else
//	{
//		System.out.println("Common year");
//	}
	
	//using ternary operator
	
	String output=(number%2==0)?"even number":"odd number";
	System.out.println(output);
	sc.close();
}


}
