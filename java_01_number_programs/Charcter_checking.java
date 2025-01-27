package java_01_number_programs;

import java.util.Scanner;

public class Charcter_checking {

	public static void main(String[] args) {
		System.out.println("enter a character");
		Scanner sc= new Scanner(System.in);
		/*
		char c =sc.next().charAt(0);
		//char vowels = {'a','e','i','o','u'}
		
		if ((c == 'a')||(c=='e')||(c=='i')||(c=='o')||(c=='u'))
		{
			System.out.println("it is an vowel");
		}
		else if ((c == 'b')||(c=='c')||(c=='d')||(c=='f')||(c=='g')||
		(c == 'h')||(c=='j')||(c=='k')||(c=='l')||(c=='m')||
		(c == 'n')||(c=='p')||(c=='q')||(c=='r')||(c=='s')||
		(c == 't')||(c=='v')||(c=='w')||(c=='x')||(c=='y')||(c=='z'))
		
		{
			System.out.println("it is a consonant");
		}
		
		else
		{
			System.out.println("enter a valid character");
		}
		
		
		
		*/
		
		
		
		char 
		c =sc.next().charAt(0);
		
		
		
		//int ascii = c;
		System.out.println((int)c);
		
		System.out.println("enter a number");
		
		
		int n =sc.nextInt();
		
		
		System.out.println((char)n);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		sc.close();

	}

}
