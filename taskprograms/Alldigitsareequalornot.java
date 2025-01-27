package taskprograms;

import java.util.Scanner;

public class Alldigitsareequalornot {

	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int lastdigit=n%10;
		int r=0;
		 while(n!=0)
		 {
			  r=n%10;
			 n=n/10;
		 }
			 if(lastdigit==r)
			 {
				 System.out.println("all digits are equal");
			 }
			 else
			 {
				 System.out.println("all digits are not equal");
			 }
		 
			 sc.close();
	}

}
