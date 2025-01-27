package java_programs;

import java.util.Scanner;

public class Arithmeticseries {

	public static void main(String[] args) {
		
		double sum=0;
		System.out.print("Enter a number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("Enter x value");
		int x=sc.nextInt();
		
		
		for (int i=2;i<=n;i+=2)
		{
			sum=sum+Math.pow(i,x);
		}
		System.out.print("sum:"+" "+sum);
		
		System.out.println("Enter n1 value");
		
		int n1=sc.nextInt();
		System.out.println("Enter y value");
		
		int y =sc.nextInt();
		for(int j=1;j<=n1;j++)
		{
			sum=sum+Math.pow(y,j);
		}
		System.out.println(sum);
		sc.close();
		
		}

}
