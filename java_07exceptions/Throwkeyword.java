package java_07exceptions;

public class Throwkeyword {
	
	public static void validate(int age)
	{
		if(age<18)
		{
			throw new ArithmeticException("Person is not elgible for vote");
		}
		else 
		{
			System.out.println("Eligbile for vote");
		}
	}

	public static void main(String[] args) {
		
		validate(18);
		
	}
}
