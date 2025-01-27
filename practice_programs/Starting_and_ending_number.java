package practice_programs;

import java.util.Scanner;

public class Starting_and_ending_number {
public static void main(String[] args) {
	System.out.println("Enter a number ");
	Scanner sc =new Scanner(System.in);
	int n =sc.nextInt();
	sc.close();
	int lastnumber=n%10;
	int firstnumber=0;
	while(n>0)
	{
		firstnumber=n;
		n=n/10;
		
		
		
	}
	System.out.println(firstnumber+lastnumber);
	System.out.println();
	}
		
}
