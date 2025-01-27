	package java_01_number_programs;
	
	import java.util.Scanner;
	
	public class Printining_the_numbers_upto_n {
	
		public static void main(String[] args) {
			int n;
			int i=1;
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the range");
			n=sc.nextInt();
		/*hile (i<=n)
			{
				System.out.println(i);
				i++;
			}
			*/
			for(i=1;i<=n;i++)
			{
				System.out.println(i);
			
			sc.close();
	
		}
		}
	
	}
