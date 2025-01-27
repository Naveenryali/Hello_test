package java_05_strings;

public class String01 {
public static void main(String[] args) {
	//separate the individual characters from the string
	String s="Hello world";
	char[] ch=s.toCharArray();
	for(int i=0;i<s.length();i++)
	System.out.println(s.charAt(i)+ " ");
	System.out.println(ch);
}
}
