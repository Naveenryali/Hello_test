package practice_programs;

class Student2{
	
	int rollno;
	String name;
	void insertRecord(int r,String n) {
	rollno=r;
	name=n;
	}
	void displayInformation()
	{
		System.out.println(rollno+" "+name);
	}
}
public class Initialze_by_method {
	
	public static void main(String[] args) {
		
		Student2 s1=new Student2();
		Student2 s2=new Student2();
		
		s1.insertRecord(10, "sai");
		s2.insertRecord(12, "venkat");
		s1.displayInformation();
		s2.displayInformation();
	}

}
