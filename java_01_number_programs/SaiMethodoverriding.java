package java_01_number_programs;

class E
{
	void dis()
	{
		System.out.println(("Hello"));
	}
}
class F extends E
{
	void dis()
	{
		System.out.println(("world"));
	}
}
public class SaiMethodoverriding
{
	public static void main(String[] args) 
	{
	 E a=new E();
	 E b=new F();
	 a.dis();
	 b.dis();
		
		
	}
}
