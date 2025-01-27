		package java_01_number_programs;
		
		import java.util.Scanner;
		
		public class Factorial_program {
		
			public static void main(String[] args) {
				//factorial of a program
				// condition = 3! =3*2*1 but equal to 6
				System.out.println("Enter a number");
				Scanner sc=new Scanner(System.in);
				int n =sc.nextInt();
				int factorial=1;
				for(int i =1;i<=n;i++)
				
					factorial = factorial*i;
				
					
				
		System.out.println(factorial);
		sc.close();
		
			}
		
		}
