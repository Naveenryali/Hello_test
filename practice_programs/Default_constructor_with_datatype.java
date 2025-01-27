package practice_programs;

class Student5
{
	int rollno;
	String name;
	void insert(int r,String n) {
		
		rollno=r;
		name=n;
	}
		void display()
		{
			System.out.println(rollno+" "+name);
		}
		
	
	
}
public class Default_constructor_with_datatype {
	
	public static void main(String[] args) {
		
	
	Student5 s1=new Student5();
	Student5 s2=new Student5();
	
	s1.display();
	s2.display();
	
	
	}
}
