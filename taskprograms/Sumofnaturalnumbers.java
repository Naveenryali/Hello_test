package taskprograms;

import java.util.Scanner;

public class Sumofnaturalnumbers {
public static void main(String[] args) {
	System.out.println("Enter n value");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	sc.close();
	int sum =0;
	for(int i=1;i<=n;i++)
	{
		sum =sum +i;
	}
	System.out.println(sum);
}
}
