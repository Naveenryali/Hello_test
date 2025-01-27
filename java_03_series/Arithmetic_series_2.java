package java_03_series;

import java.util.Scanner;

public class Arithmetic_series_2 {
public static void main(String[] args) {
	System.out.println("Enter a number");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int x=sc.nextInt();
	sc.close();
	
	
	double sum=0;
	
	for(int i=1;i<=n;i++)
	{
		sum =sum+Math.pow(x,i);
	}
	System.out.println(sum);
	
	
	
	
	double sum2=0;
	for(int i=9;i<=n;i+=4)
	{
		sum2=sum2+Math.pow(i,x);
	}
	System.out.println(sum2);
	
	
	
	
	double sum1=0;
	for(int i=2;i<=n;i+=2)
	{
		sum1=sum1+Math.pow(i,x);
	}
	System.out.println(sum1);
	
	
}
}
