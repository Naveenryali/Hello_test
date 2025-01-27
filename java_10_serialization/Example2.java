package java_10_serialization;
import java.io.Serializable;
import java.util.TreeSet;
import java.io.*; 
 class Student implements Serializable,Comparable<student>{  
 private static final long serialVersionUID = 7938388163294604328L;
int id;  
 String name;  
 public Student(int id, String name) {  
  this.id = id;  
  this.name = name;  
 }
@Override
public int compareTo(student o) {
	// TODO Auto-generated method stub
	 return this.id>o.id?1:this.id<o.id?-1:0;
}  
}  
public class Example2 {
	   
	    
	 public static void main(String args[]){    
	  try{    
	  //Creating the object    
		  TreeSet<student> l=new TreeSet<>();
			
			l.add(new student(22,"Sai"));
			l.add(new student(28,"Sai"));
			l.add(new student(22,"Sai"));
			

	  //Creating stream and writing the object    
	  FileOutputStream fout=new FileOutputStream("/home/miracle/Documents/serialization");    
	  ObjectOutputStream out=new ObjectOutputStream(fout);    
//	  out.writeObject(s1);
//	  out.writeObject(s2);
	  out.writeObject(l);
	  out.flush();    
	  //closing the stream    
	  out.close();    
	  System.out.println("success");    
	  }
	  catch(Exception e)
	  {
		  System.out.println(e);
	  }    
	   
	 }
	
}
