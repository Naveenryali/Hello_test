package java_03_series;

public class Sumofseries {
public static void main(String[] args) {
	int n=4;
	double sum=0;
	for(int i=0;i<=n;i++)
	{
		sum=sum+(1/Math.pow(2, i));
	}
	System.out.println(sum);
}
}
