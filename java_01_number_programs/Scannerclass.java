package java_01_number_programs;

	import java.util.Scanner;
	
	public class Scannerclass {
		
		public static void details () {
			
			Scanner sc = new Scanner(System.in);
			
			String name = sc.nextLine();
			
		
			System.out.println("Hey "+ name +" how are you");
			String status = sc.nextLine();
			
			System.out.println(status+" "+"what about you");
			System.out.println("What is your age");
			int age =sc.nextInt();
			System.out.println(age+ " "+"is your age");
			System.out.println("Thanks for the information");
			sc.close();
			
		}
		
	public static void main(String[] args) {
	
		
		System.out.println("welcome to the ekart");
		System.out.println("what is your name");
		
		
		details();
		
		
		
		
		
		
		
		
		
		
		}
	}
