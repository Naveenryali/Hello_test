package java_01_number_programs;

public class SaiSumofprime {
public static void main(String[] args) {
	int sum=0;
	for(int i=1;i<=100;i++)
	{
	int	count=0;
		for(int j=1;j<=i;j++)
		{
		if(i%j==0)
		{
		 count++;
		}
		}
		 if((count==2)&&  (i<=50))
		 {
			 System.out.println(i);
			 sum=sum+i;
		 }
		
		
		
	}
	System.out.println(sum);
}
}
