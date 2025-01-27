package taskprograms;

import java.util.Arrays;

public class Descendingorderofanarray {

	public static void main(String[] args) {
		int a[]= {265,23,4525,671,68};
		int temp;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			Arrays.sort(a);
				System.out.print(a[i]+" ");
		}
		System.out.println();
		for(int k=a.length-1;k>=0;k--)
		{
			System.out.print(a[k]+" ");
		}
		

	}

}
