package practice_programs;
class Test
{
	int a;
	int b;	
	static void add(int a, int b)
	{	
		System.out.println(a+b);
	}
	void display() {
		System.out.println(a+b);
	}
	Test(int a,int b){
		this.a=a;
		this.b=b;
		System.out.println(a+b);
	}
	Test()
	{
		System.out.println("Hello");
	}
}
public class Practice08 {
	public static void main(String[] args) {
		Test t=new Test(30,30);
		Test t1=new Test();
		System.out.println(t1);
		t.a=10;
		t.b=10;
		Test.add(20,20);
		t.display();
			
		
	}

	
	
}
