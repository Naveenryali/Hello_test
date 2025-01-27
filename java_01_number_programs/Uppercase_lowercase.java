package java_01_number_programs;

import java.util.Scanner;

public class Uppercase_lowercase {

	public static void main(String[] args) {
		System.out.println("Enter a character");
		Scanner sc =new Scanner(System.in);
		char a =sc.next().charAt(0);
	/*	char c ;
		for (c ='a';c<='z';c++)
		{
			System.out.print(c+ " ");
		}
		*/
		int ascii =a;
		System.out.println(ascii);
		sc.close();
		

	}

}
