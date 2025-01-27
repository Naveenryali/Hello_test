package java_programs;

import java.util.Scanner;

public class Fibonacciseries {

	public static void main(String[] args) {
		System.out.println("Enter the range");
		Scanner sc =new Scanner(System.in);
		int n =sc.nextInt();
		int n1=0,n2=1,sum=0;
		System.out.println("Fibonacciseries:");
		System.out.print(n1+" "+n2);
		for(int i=1;i<=n;i++)
		{
			sum=n1+n2;
			System.out.print(" "+sum);
			n1=n2;
			n2=sum;
			
		}
		sc.close();
		
		
	}

}
