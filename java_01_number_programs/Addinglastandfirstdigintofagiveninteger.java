package java_01_number_programs;

import java.util.Scanner;

public class Addinglastandfirstdigintofagiveninteger {

	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner sc =new Scanner(System.in);
		int n =sc.nextInt();
		int sum=0;
		int firstdigit =n;
		int lastdigit =n%10; 
		while(firstdigit>=10)
		{
			firstdigit=firstdigit/10;
		}
		sum =lastdigit+firstdigit;
		System.err.println(sum);
		sc.close();
	}

}
