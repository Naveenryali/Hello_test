package practice_programs;

import java.util.Scanner;

public class Adding_alternative_numbers {
public static void main(String[] args) {
	System.out.println("Enter a number");
	Scanner sc =new Scanner(System.in);
	int n=sc.nextInt();
	sc.close();
	int i=0,r;
	int sum=0;
	while(n!=0)
	{
		
		if(i%2==0)
		{
			r=n%10;
		 sum=sum+r;
		 System.out.println(r);
		}
		i++;
		n=n/10;
	}
	System.out.println(sum);
	
	
}
}
