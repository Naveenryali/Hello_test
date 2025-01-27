package taskprograms;

import java.util.Scanner;

public class Evennumbers {

	public static void main(String[] args) {
		System.out.println("Enter the range to print even numbers");
		Scanner sc=new Scanner(System.in);
		int r =sc.nextInt();
		for(int i=2;i<=r;i+=2)
		{
			System.out.println(i);
		}
		sc.close();
		

	}

}
