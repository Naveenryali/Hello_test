package taskprograms;

public class Frequencyofeachelement {
	public static void main(String[] args) {
		int a[]= {123,14,123,143,11,22,12,12};
		int visited=-1;
		int fr[]=new int[a.length];
		for(int i=0;i<a.length;i++)
		{
			int count =1;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					count++;
					fr[j]=visited;
				}
				
			}
			if(fr[i]!=visited)
			{
				fr[i]=count;
			}
		}
		
		for(int i=0;i<fr.length;i++)
		{
			if(fr[i]!=visited)
			{
		
		System.out.println(a[i]+"  "+fr[i]);
			}
		}

}
}