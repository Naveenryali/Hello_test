package java_03_series;

public class Seriesisquare {
public static void main(String[] args) {
	int n=5;
	double sum =0;
	int m =0;
	
	for(int i=1;i<=n;i++)
	{
		sum=sum+(1/(Math.pow(i, m)));
		m++;
	}
	System.out.println(sum);
		
}
}
