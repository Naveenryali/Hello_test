package java_01_number_programs;

public class Primenumbercount {

	
	public static void main(String[] args) {
		
	
		int n=845973;
		
	while(n!=0)
	{
		int j=n%10;
		int count =0;
		for(int i=1;i<=j;i++)
		{
			if(j%i==0)
			{
				count++;
			}
		}
		if(count==2) {
		System.out.println(j);
		}
		n=n/10;
	}
		
	}
}
