package java_01_number_programs;

public class Sumofnaturalnumbers {
	public static void main(String []args) {
		//sum of first 10 natural numbers
		int	sum =0;
		int j =1;
	/*	for(int i =1;i<=10;i++)
		{
			sum =sum+i;
	
		}
		System.out.println(sum);*/
		while (j<=10)
		{
			sum =sum+j;
			j++;
		}
		System.out.println(sum);
		
	}

}
