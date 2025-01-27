package java_01_number_programs;

import java.util.Scanner;

public class Multiplication_of_number_table {

	public static void main(String[] args) {
		
		System.out.println("printing tables ");
		Scanner sc=new Scanner(System.in);
	//	int n =sc.nextInt();
		for(int n=2;n<=5;n++)
		{
			System.out.println("printing "+ n+"table" );
		for(int i=1;i<=12;i++)
		{
			System.out.println(+n+"*" +i+ "=" +n*i);
		}
		System.out.println();
		}
		sc.close();
	}

}
