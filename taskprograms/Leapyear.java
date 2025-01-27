package taskprograms;

import java.util.Scanner;

public class Leapyear {

	public static void main(String[] args) {
		System.out.println("Enter a year to check");
		Scanner sc=new Scanner(System.in);
		int y=sc.nextInt();
		if(((y%4==0)||(y%400==0))&&(y%100!=0))
		{
			System.out.println(y+" "+"It is a leap year");
		}
		else {
			System.out.println("not a leap year");
		}
		sc.close();
		
	}

}
