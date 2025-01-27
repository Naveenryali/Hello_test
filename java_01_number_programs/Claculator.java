package java_01_number_programs;

import java.util.Scanner;

public class Claculator {

	public static void main(String[] args) {
		System.out.println("Enter n1 value ");
		Scanner sc =new Scanner(System.in);
		int n1 =sc.nextInt();
		System.out.println("Enter n2 value");
		int n2 = sc.nextInt();
		System.out.println("For addition press 1,for multiplication press 2,for subtraction press 3,for division press 4");
		int n =sc.nextInt();
		sc.close();
		
		switch(n)
		{
		
		case 1:System.out.println(n1+n2);
		break;
		case 2:System.out.println(n1*n2);
		break;
		case 3:System.out.println(n1-n2);
		break;
		case 4:System.out.println(n1/n2);
		break;
		default:System.out.println("Enter a valid number");
		}

	}

}
