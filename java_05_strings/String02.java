package java_05_strings;

public class String02 {
public static void main(String[] args) {
	String s="reverse";
	char[] ch=s.toCharArray();
	String reversed="";
	for(int i=ch.length-1;i>=0;i--)
	{
		reversed +=ch[i];
	}
	System.out.println("Reversed string :"+" "+reversed);
	String s1="length";
	int length=0;
	for(int i=0;i<=s1.toCharArray().length;i++)
	{
		length++;
	}
	System.out.println("Length of the string ="+" "+length);
}
}
