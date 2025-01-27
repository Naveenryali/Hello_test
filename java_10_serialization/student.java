package java_10_serialization;
import java.io.*;

//Define a class that implements Serializable
class Person implements Serializable{
 private static final long serialVersionUID = 1L; // Recommended for version control
 private String name;
 private int age;
 

 public Person(String name, int age) {
     this.name = name;
     this.age = age;
    
 }

 public String getName() {
     return name;
 }

 public int getAge() {
     return age;
 }

}
public class student {
	int id;
	String name;
    public student(int id, String name) {
		
    	this.id=id;
    	this.name=name;
	}
	
	public static void main(String[] args) throws ClassNotFoundException {
        Person person = new Person("Naveen", 30);
    //    student s=new student(22,"Sai");
     //   System.out.println(s.id+" "+s.name);
    

        // Serialize the object
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("./serial"))) {
            oos.writeObject(person);
            
//            FileInputStream fis=new FileInputStream("./serial");
//            ObjectInputStream ois=new ObjectInputStream(fis);
//            
//            Person p=(Person)ois.readObject();
//            System.out.println(p);
            System.out.println("Object serialized successfully.");
            
            
            
//            System.out.println(p.getName()+" "+p.getAge());
            
            
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

	
}
