package taskprograms;

import java.util.Scanner;

public class Sumofevennumbers {
public static void main(String[] args) {
	System.out.println("Enter the n value");
	Scanner sc=new Scanner(System.in);
	int n =sc.nextInt();
	int sum=0;
	for(int i=1;i<=n;i++)
	{
		if(i%2==0)
		{
			System.out.println(i);
			sum=sum+i;
		}
	}System.out.println(sum); 
	sc.close();
}
}
