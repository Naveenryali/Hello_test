package practice_programs;
class Student11
{
	int rollno;
	String name;
	static String College ="MRCL";
	
	Student11(int r,String n)
	{
		rollno=r;
		name=n;
	}
	 void display()
	{
		System.out.println(rollno+" "+name+" "+College);
	}
}
public class Static_variable {
	public static void main(String[] args) {
	Student11 s1=new Student11(1,"naveen");
	Student11 s2=new Student11(2,"sai");
	s1.display();
	s2.display();
	}
}
