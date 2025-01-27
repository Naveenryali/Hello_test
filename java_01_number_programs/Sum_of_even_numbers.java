		package java_01_number_programs;
		
		import java.util.Scanner;
		
		public class Sum_of_even_numbers {
		
			public static void main(String[] args) {
			System.out.println("enter the range of sum of even numbers");
			Scanner sc =new Scanner(System.in);
				int n =sc.nextInt();
				int sum =0;
				//int n1 = 20;
				for(int i = 1 ;i<=n;i++) 
				
					if(i%2 == 0) 
						sum = sum+i;
					
					
						System.out.println("The sum of all even numbers from 1 to "+ n +" "+"="+sum);
					
					
					
				sc.close();
		
			}
		
		}
