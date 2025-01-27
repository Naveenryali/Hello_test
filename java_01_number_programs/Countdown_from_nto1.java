package java_01_number_programs;

import java.util.Scanner;

public class Countdown_from_nto1 {

	public static void main(String[] args) {
		//count down from 10 to 1
		System.out.println("enter the number ");
		Scanner sc =new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i=n;i>=1;i--)
		{
			System.out.println(i);
		}
		sc.close();
		

	}

}
