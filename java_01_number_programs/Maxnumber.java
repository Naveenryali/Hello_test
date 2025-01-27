package java_01_number_programs;

import java.util.Scanner;

public class Maxnumber {
public static void main(String[] args) {
	System.out.println("Enter a number");
	Scanner sc=new Scanner(System.in);
	int n =sc.nextInt();
	int max=n%10;
	sc.close();
	
	while(n>0)
	{
		if (n%10>max)
		{
			max=n%10;
		}
			
		n=n/10;
		
	}

	System.out.println(max);	
	
	
}
}
