package taskprograms;

public class Largestandsmallestelementinanarray {
public static void main(String[] args) {
	int a[]= {50,20,30,60,70};
	int max =a[0];
	int min =a[0];
	for(int i=0;i<a.length;i++)
	{
		if(a[i]>max)
		{
			max=a[i];
		}
		else if(a[i]<min) {
			
		
			min=a[i];
		}	
		
	}
	System.out.println(max+" "+"maximum value");
	System.out.println(min+" "+"minimum value");
}
}
