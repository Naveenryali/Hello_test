package java_01_number_programs;

import java.util.Scanner;

public class PerfectorNot {
public static void main(String[] args) {
	int num,sum=0;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number");
	num=sc.nextInt();
	for (int i=1;i<num;i++)
	{
		if(num%i==0)
		{
			sum=sum+i;
			System.out.println(i);
		}	
	}
	if(sum==num)
	{
		System.out.println("The Given Number is Perfect :" +sum);
	}
	else
	{
		System.out.println("The Given Number is Not Perfect");
	}
	sc.close();
	
}
}
