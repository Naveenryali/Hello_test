package java_01_number_programs;

import java.util.Scanner;

public class Sum_of_digits_of_given_number {

	public static void main(String[] args) {
		System.out.println("Enter a number");
		
		Scanner sc =new Scanner(System.in);
		
		
		int num =sc.nextInt();
		int sum =0;
		
		
		while(num!=0)
		{
			int r =num%10;
			sum = sum +r;
			
			num =num/10;
		}
		System.out.println(sum);
		
		sc.close();
	}

}
