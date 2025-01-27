	package java_01_number_programs;

import java.util.Scanner;

public class Printing_grade {
	
		public static void main(String[] args) {
			/*wajp that accepts a grade (A-D) and prints a corresponding message. 
			ask user to enter their grade and print msg using switch 
			enter your grade :
			a excellent 
			enter your grade :
			c Barely passed 
			enter your grade :
			D sorry! better luck next time 
	*/
			System.out.println("Enter the grade");
			Scanner sc=new Scanner(System.in);
			char c ;
			c =sc.next().charAt(0);
			
			switch(c)
			{
			case 'A' :System.out.println(c +" "+"Excellent");
			break;
			case 'B' :System.out.println(c +" "+"Good");
			break;
			case 'C':System.out.println(c+ " "+"Barely passed");
			break;
			case 'D':System.out.println(c+" "+"Sorry! better luck next time");
			break;
			default:System.out.println("enter the correct grade");
			}
			sc.close();
			
		}
	
	}
