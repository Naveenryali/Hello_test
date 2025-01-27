package java_08_collections;


import java.util.*;
class Student{
	int rollno;
	String name;
	int age;
	Student(int rollno,String name,int age){
		this.rollno=rollno;
		this.name=name;
		this.age=age;
		
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", age=" + age + "]";
	}
	
	
}

public class Array_List7 {
	


	public static void main(String[] args) {
		
		
//		ArrayList<Student> al=new ArrayList<>();
//		Student s1=new Student(98,"Naveen",25);
//		Student s2=new Student(99,"Sai",23);
//		Student s3=new Student(88,"Venkat",21); 
		
		ArrayList<Student> al=new ArrayList<>(Arrays.asList(
		new Student(98,"Naveen",25),
		new Student(99,"Sai",23),
		new Student(88,"Venkat",21)));
        
//		al.add(s1);
//		al.add(s2);
//		al.add(s3);
		
		for(Student s:al)
		{
			System.out.println(s);
		}
		
		Iterator<Student> itr=al.iterator();
		
		while(itr.hasNext())
		{
			Student st=(Student)itr.next();
			System.out.println(st.rollno+" "+st.name+" "+st.age);
		}
		
				
	}
}
