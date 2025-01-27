package taskprograms;

import java.util.Scanner;

public class Passorfail {

	public static void main(String[] args) {
		System.out.println("Enter marks obtained");
		Scanner sc=new Scanner(System.in);
		int m =sc.nextInt();
		if (m>=90&&m>101)
		{
			System.out.println("A-grade");
		}
		else if(m<90&&m>=80)
		{
			System.out.println("B-grade");
		}
		else if(m<80&&m>=70)
		{
			System.out.println("C-grade");
		}
		else if(m<70&&m>=40)
		{
			System.out.println("D-grade");
		}
		else if(m<40&&m>=0)
		{
			System.out.println("F-fail");
		}
		else
		{
			System.out.println("Enter valid details");
		}
		
	
		sc.close();
		

	}

}
