package practice_programs;

import java.util.Scanner;

public class Minimum_maximum_number {
public static void main(String[] args) {
	System.out.println("Enter a number");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	sc.close();
	int max=n%10,min=n%10;
	
	while(n>0)
	{
		if(n%10>max)
		{
			max=n%10;
		}
		else
		{
			if(n%10<min)
			{
				min=n%10;
			}
		}
		n=n/10;
	}
	System.out.println("maximum number = "+max);
	System.out.println("minimum number = "+min);
}
}
