package practice_programs;

import java.util.Scanner;

public class Even_number {
public static void main(String[] args) {
	System.out.println("Enter a number");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int sum=0;
	if(n%2==0)
	{
		System.out.println(n+" "+"is a even number");
	}
	else {
		System.out.println(n+" "+"is a odd number");
	}
	System.out.println("odd numbers up to "+" "+n);
	for(int i=1;i<=n;i+=2)
	{
		System.out.println(i);
		sum=sum+i;
	}
	System.out.println("sum of odd numbers upto "+" "+n+" "+"="+sum );
	int i=2;
	System.out.println("Even numbers upto n");
	while(i<=n)
	{
		System.out.println(i);
		i+=2;
		sum=sum+i;
		
	}
	System.out.println("sum of even numbers upto "+n+" "+"="+sum);
	sc.close();
	
}
}
