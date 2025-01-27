package java_01_number_programs;

public class String_count_occurances {

	public static void main(String[] args) {
		String str =" Hello World";
		char[] charArray =str.toCharArray();
		int count =0;
		char ch = 'o';
		for (int i=0;i<charArray.length;i++)
		{
			if (charArray[i]==ch)
			{
				count++;
			}
		}
		System.out.println("occurances of a character "+ch+": "+" "+count);

	}

}
