package practice_programs;
class Student123{  
	   int rollno;//instance variable  
	   String name;  
	   static String college ="ITS";//static variable  
	   //constructor  
	   Student123(int r, String n){  
	   rollno = r;  
	   name = n;  
	   }  
	   //method to display the values  
	   void display (){System.out.println(rollno+" "+name+" "+college);}  
	}  

public class Static01 {
	public static void main(String args[]){  
		 Student123 s1 = new Student123(111,"Karan");  
		 Student123 s2 = new Student123(222,"Aryan");  
		 //we can change the college of all objects by the single line of code  
		 //Student.college="BBDIT";  
		 Student123.college="raghu";
		 s1.display();  
		 s2.display();  
		 }  

}
