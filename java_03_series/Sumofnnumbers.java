package java_03_series;

import java.util.Scanner;

public class Sumofnnumbers {
public static void main(String[] args) {
	System.out.println("Enter n value");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	double sum=0;
	for(int i=1;i<=n;i++)
	{
		
		sum=sum+1.0/i;
	}
	System.out.println(sum);
	sc.close();
	
}
}
