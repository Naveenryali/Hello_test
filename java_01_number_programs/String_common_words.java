package java_01_number_programs;

public class String_common_words {

	public static void main(String[] args) {
		String s1 = "He is good person";
		String s2 = "He is not a good person";
		
		String[] a=s1.split(" ");
		String[] b=s2.split(" ");
		
		String commonWords = findCommonWords(a,b);
		System.out.println("Common Words");
		System.out.println(commonWords);

	}
	public static String findCommonWords(String[]a,String[]b)
	{
			String result ="";
			for(int i=0;i<a.length;i++)
			{
				for(int j=0;j<b.length;j++)
				{
					if(a[i].equals(b[j]))
					{
						result =result+a[i]+"";
						break;
						
					}
				}
			}
			return result.trim();
	}

}
