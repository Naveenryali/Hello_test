package practice_programs;

class Student7
{
	int id;
	String name;
	int age;
	Student7(int i,String n)
	{
		id=i;
		name=n;
	}
	Student7(int i,String n,int a)
	{
		id=i;
		name=n;
		age=a;
	}
	void display()
	{
		System.out.println(id+" "+name+" "+age);
	}
}
public class Parameterized_constructor {
	public static void main(String[] args) {
		
		Student7 s1=new Student7(1,"naveen",23);
		Student7 s2=new Student7(2,"sai");
		
		s1.display();
		s2.display();
		
		
	}

}
