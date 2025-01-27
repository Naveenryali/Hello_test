package java_03_series;

public class Sumofseriessquare {
public static void main(String[] args) {
	int n=5;
	double sum=0;
	for(int i=1;i<=n;i++)
	{
		sum =sum+(1/Math.pow(i, 2));
	}
	System.out.println(sum);
}

}
