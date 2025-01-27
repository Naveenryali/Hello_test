package java_01_number_programs;

import java.util.Scanner;

public class Even_number_program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int number =100;
System.out.println("List of even numbers from 1 to "+number+":");
for(int i=1;i<=number;i++)
{
	if(i%2==0)
	{
		System.out.println(i + "");
	}
	}
//		int number = 100;
//		System.out.println("List of odd numbers from 1 to "+number+":");
//		
//		for(int i=1;i<=number;i++)
//		{
//			if(i%2!=0)
//			{
//				System.out.print( i + " ");
//				
//			}
//		}
		
		//by using while loop,how to write a even number program
		
		
		int number1,i;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the limit:");
		number1 =sc.nextInt();
		
		i=2;
		
		System.out.println("List of even numbers:");
		
		while(i<=number1)
		{
			System.out.println(i + " ");
			i=i+2;
		}
		
		
		
		
	sc.close();
		
}
	}


