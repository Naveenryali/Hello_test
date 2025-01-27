	package java_01_number_programs;
	
	import java.util.Scanner;
	
	public class Even_numbers_upto_n {
	
		public static void main(String[] args) {
			//Print even numbers upto n
			
			System.out.println("Enter a number");
			Scanner sc=new Scanner(System.in);
			int n =sc.nextInt();
			
			for (int i=1;i<=n;i++)
			
				if(i%2==0)
				
					System.out.println("even numbers from 1 to "+" "+n+" "+" "+i);
				else
				{
					System.out.println("odd  numbers from 1 to "+" "+n+" "+" "+i);
				}
			
	sc.close();
		}
	
	}
