package practice_programs;

class Student10{
	int id;
	String name;
	void insert(int i,String n) {
		id=i;
		name=n;
	}
		void dislay()
		{
			System.out.println(id+" "+name);
		}
}
 public class Practice05 {
	public static void main(String[] args)
	{	
		Student10 obj=new Student10();
		System.out.println(obj);
		
		obj.insert(1, "Naveen");
		obj.dislay();
			
	}
}
