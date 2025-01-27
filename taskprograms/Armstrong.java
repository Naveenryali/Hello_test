package taskprograms;

public class Armstrong {
	static boolean isArmstrong(int n)
	{
		int temp,sum=0,last=0,count=0;
		temp=n;
		while(temp>n)
		{
			
			temp=temp/10;
			count++;
		}
		temp=n;
		while(temp>0)
		{
			last=temp%10;
			sum =sum+(int)Math.pow(last,count);
			temp=temp/10;
			
		}
		if (n==sum)
		{
			return true ;
			
		}
		else
		{
			return false ;
		}
		
	}
	public static void main(String[] args) {
		int n=1000;
		for(int i=0;i<=n;i++) {
		
			if(isArmstrong(n)) {
		System.out.println(i);
			}
		}
	}

}
