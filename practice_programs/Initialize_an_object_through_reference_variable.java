package practice_programs;
class Student1{
	int id;
	String name;
}
public class Initialize_an_object_through_reference_variable {

	public static void main(String[] args) {
		
		Student1 s=new Student1();
		Student1 s1=new Student1();
		
		s1.id=11;
		s1.name="Sai";
		s.id=10;
		s.name="naveen";
		System.out.println(s.id+" "+s.name);
		System.out.println(s1.id+" "+s1.name);
	}
}
