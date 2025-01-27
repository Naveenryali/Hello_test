package practice_programs;

import java.util.Scanner;

public class Reverse_a_number {
public static void main(String[] args) {
	System.out.println("Enter a number");
	Scanner sc=new Scanner(System.in);
	int n =sc.nextInt();
	sc.close();
	int rev=0;
	while(n>0)
	{
		rev=rev*10+n%10;
		n=n/10;
	}
	System.out.println(rev);
}
}
