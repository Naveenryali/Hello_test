package java_01_number_programs;

import java.util.Scanner;

public class Fibonacci_series {

	public static void main(String[] args) {
		System.out.println("Enter the range");
		
	Scanner sc =new Scanner(System.in);
	
		System.out.print("Fibronacci series :");
		
		int n =sc.nextInt();
		int n1=0,n2=1,sum =0;
		System.out.print(n1 +" "+n2);
		for(int i=0;i<=n;i++)
		{
			sum=n1+n2;
		
		System.out.print(" "+ sum);
		n1=n2;
		n2=sum;
		sc.close();
		}
	}

}
