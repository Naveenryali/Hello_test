	package java_01_number_programs;
	
	public class Sumof_first50_numbers {
	
		public static void main(String[] args) {
	//		// TODO Auto-generated method stub
	int count,sum =0;
	for(int number = 1;number<=50;number++)
	{
	count=0;
	for(int i=2;i<=number/2;i++)
	{
		if(number%i==0)
			{
			count++;  	 	
			break;
			
			}
	}
		if(count==0 && number != 1)
		{
			sum = sum+number;
		}
		
		
	}
			
	System.out.println("The sum of prime numbers from 1 to 50 is :" +sum);
		}
	
	}
