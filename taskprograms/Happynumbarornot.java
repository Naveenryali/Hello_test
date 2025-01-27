package taskprograms;

import java.util.Scanner;

public class Happynumbarornot {
public static void main(String[] args) {
	System.out.println("Enter a number");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	while(n>9)
	{
		int sum=0;

		while(n>0)
		{
			int r=n%10;
			sum=sum+r*r;
			n=n/10;
		}
		n=sum;
		
	}
	if(n==1)
	{
		System.out.println("happy number");
	}
	else {
		System.out.println("not a happy number");
	}
	sc.close();
	
}
}
