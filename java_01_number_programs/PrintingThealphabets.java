		package java_01_number_programs;
		
		import java.util.Scanner;
		
		public class PrintingThealphabets {
		
			public static void main(String[] args) {
			/*
			char c;
				for( c= 'a';c <='z';c++)
				{
					System.out.print(c + " ");
				}
				System.out.println();
				for(c='A';c<='Z';c++)
				{
					System.out.print(c + " ");
				}
				*/
		Scanner sc=new Scanner(System.in);
		
		
		char c =sc.next().charAt(0);
		
		int ascii = c;
		System.out.println(ascii);
		
		sc.close();
		
		
			}
		
		}
