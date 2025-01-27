package java_01_number_programs;

import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {
		System.out.println("Enter the age ");
		Scanner sc = new Scanner(System.in);
		/* int number = sc.nextInt();
		 if (number%2==0)
		 {
			 System.out.println("given number is even");
			 
		 }
		 else
		 {
			 System.out.println("given number is odd");
		 }
*/
		
		
		
	/*	int number =sc.nextInt();
		if((number<40) && (number>=0))
		{
			System.out.println("obtained grade is F ");
		}
		else if((number<=50) && (number>=40))
		{
			System.out.println("obtained grade is  D ");
		}
		else if ((number>50) && (number<=70))
		{
			System.out.println("obtained grade is c ");
		}
		else if ((number >70)&&(number<=90))
		{
			System.out.println("obtained grade is B ");
		}
		else if ((number>90)&&(number<=100))
		{
			System.out.println("obtained grade is A ");
		}
		else
		{
			System.out.println("enter value is in correct");
		}*/
		
		
	/*	int year = sc.nextInt();
		 if ((year%4==0)||(year%400==0) && (year%100!=0))
		 {
			 System.out.println("it is a leap year");
		 }
		 else
		 {
			 System.out.println("not a leap year");
		 }
		 */
		
		
	/*	int n1 =sc.nextInt();
		System.out.println("enter number n2");
		int n2 = sc.nextInt();
		
		
		if (n1>n2)
		{
			System.out.println("n1 is greater than n2");
		}
		else if (n1<n2)
		{
			System.out.println("n1 is less than n2");
		}
		else
		{
			System.out.println("n1 is equal to n2");
		}
		*/
		int age =sc.nextInt();
		
		if (age==1)
		{
			System.out.println("infant");
		}
		else if( (age>1) && (age<=10) )
		{
		System.out.println("child");
		}
		else if ((age>10) && (age<=20))
		{
			System.out.println("teenager");
		}
		else if((age>20)&&(age<=40))
		{
			System.out.println("adult");
		}
		else 
		{
			System.out.println("senior");
		}
		
		
		sc.close();
		
		
		
		
		
		
		
		
		
		
	}

}
