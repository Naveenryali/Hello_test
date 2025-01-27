package java_01_number_programs;

public class String_tocharArray {

	public static void main(String[] args) {
		String str = "listen";
			char[]charArray1 =str.toCharArray();
			for(int i =0;i<charArray1.length;i++)
			{
				System.out.print(charArray1[i]+ " ");
			}
	}

}
