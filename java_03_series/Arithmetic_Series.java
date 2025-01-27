package java_03_series;

import java.util.Scanner;

public class Arithmetic_Series {
public static void main(String[] args) {
	System.out.println("Enter a number");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	System.out.println("Enter x value");
	int x=sc.nextInt();
	sc.close();
	int sum=0;
	for(int i=1;i<=n;i++)
	{
		System.out.println(i);
		sum =sum+i;
	}
	System.out.println(sum);
	double sum1=0;
	for(int i=1;i<=n;i+=2)
	{
		sum1=sum1+Math.pow(i, 3)/x;
	}
	System.out.println(sum1);
	
	double sum2=0;
	for(int i=2,a=2,d=10;i<=n;i++,a+=2,d--)
	{
		sum2=sum2+(double)a/d;
	}
	System.out.println(sum2);
}
}
