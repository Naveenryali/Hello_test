package practice_programs;

public class Perfectnumber {

	public static void main(String[] args) {
		
		int n=6;
		int count=0;
		for(int i=1;i<n;i++)
		{
			if(n%i==0)
			{
				count =count+i;
			}
		}
		if(count==n)
		System.out.println("Perfect");

	}
}
