package java_06_oops;
class Student
{
	private String name;
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
}
public class Encapsulation01 {
	public static void main(String[] args) {
		Student s=new Student();
		s.setName("Naveen");
		System.out.println(s.getName()); 
	}
}
