package test;

import java.util.ArrayList;
import java.util.Scanner;

class Employee
{
	
	String name;
	int id;
	String dep;
	Employee(String name ,int id , String dep)
	{
		this.name=name;
		this.id=id;
		this.dep=dep;
	}
}

public class Test1 {

	public static void main(String[] args) {
		
		Employee e=new Employee("Sai",102,"Cse");
		Employee e1=new Employee("Venkat",103,"Cse");
		Employee e2=new Employee("Naveen",104,"Mech");

		ArrayList<Employee> El=new ArrayList<Employee>();
		
//		El.add(new Employee("Naveen",101,"MEch"));
		El.add(e);
		El.add(e1);
		El.add(e2);
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your id : ");
		int id=sc.nextInt();
		
		sc.nextLine();
		
		boolean found=false;
		for(Employee emp:El)
		{
			//System.out.println(emp.name+" "+emp.id+" "+emp.dep);
			if(emp.id==id)
			{
				found=true;
				System.out.println("Id found");
				
				System.out.println("Enter your name");
				
				String name=sc.nextLine();
				if(emp.name.equals(name))
				{
					System.out.println(emp.dep);
				}
				else
				{
					System.out.println("Name does not match the id");
				}
				
				break;
				
//				System.out.println("Employee id:  "+emp.id);
//				System.out.println("Employee name:  "+emp.name);
//				System.out.println("Employee department: "+emp.dep);
			}
			
		}
		if(!found)
		{
			System.out.println("Id not found");
		}
		
		sc.close();
		
	}
	
}
