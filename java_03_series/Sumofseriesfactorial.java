package java_03_series;

import java.util.Scanner;

public class Sumofseriesfactorial {
public static void main(String[] args) {
	System.out.println("Enter a number");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int factorial=1;
	double sum=0;
	for(int i=1;i<=n;i++)
	{
		factorial=factorial*i;
		sum=sum+1.0/(factorial);
		
	}
	System.out.println(sum);
	sc.close();
}
}
