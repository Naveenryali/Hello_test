		package java_01_number_programs;
		
		import java.util.Scanner;
		
		public class Prime_number_program {
		
			public static void main(String[] args) {
				System.out.println("Enter a number");
				Scanner sc =new Scanner(System.in);
				int n = sc.nextInt();
				sc.close();
				/*
				int count =0;
				
				
				for (int i=1;i<=n;i++)
				{
					if(n%i==0)
						count++;
				}
					if(count==2)
					{
						System.out.println(n+" "+"it is prime number");
					}
					else 
					{
						System.out.println("it is not a prime number");
					}
					
				*/
				
				int sum = 0;
				
				
				for(int i=1;i<=n;i++)
				{
					int count =0;
					for(int j=1;j<=i;j++)
					{
						if(i%j==0)
						{
							count++;
							
						}
						
					}
					if ((count==2) && (i<=n))
					{
						System.out.print(i+" ");
						sum =sum+i;
					}

				}
				System.out.println();
				
				System.out.println(sum);
				
				
				
				
			}
		
		}
