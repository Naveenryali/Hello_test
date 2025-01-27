package practice_programs;

class Counter{
	static int count=0;
	
	Counter()
	{
		count++;
		System.out.println(count);
	}
}
public class Static_keyword {
	public static void main(String[] args) {
		Counter c=new Counter();
		System.out.println(c);
		Counter c1=new Counter();
		System.out.println(c1);
	
	}
}
