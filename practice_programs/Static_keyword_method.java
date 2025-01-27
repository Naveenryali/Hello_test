package practice_programs;

class Student8{
	int rollno;
	String name;
	static String college ="IIT";
	
	static void change()
	{
		college="IAM";
	}
	Student8(int r,String n)
	{
		rollno=r;
		name=n;
	}
	void display()
	{
		System.out.println(rollno+" "+name+" "+college);
	}
}
public class Static_keyword_method {
	public static void main(String[] args) {
		
		Student8.change();
	
	Student8 s1=new Student8(1,"naveen");
	Student8 s2=new Student8(2,"sai");
	s1.display();
	s2.display();
	}
}
