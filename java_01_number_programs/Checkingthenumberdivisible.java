package java_01_number_programs;

import java.util.Scanner;

public class Checkingthenumberdivisible {

	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner sc=new Scanner(System.in);
		int n =sc.nextInt();
		if(n%3==0 && n%5==0)
		{
			System.out.println(n+" "+"is divisible by 3 and 5");
		}
		else {
			System.out.println(" not divisible by 3 and 5");
		}
		sc.close();
		
	}

}
