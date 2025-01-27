package java_09_input_output_stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
class Source implements Serializable 
{
	private static final long serialVersionUID = 1L;
	int roll;
	String name;
	
	Source(int roll,String name)
	{
		this.roll=roll;
		this.name=name;
		
	}
}

public class FileHandling  {

	
	 public static void main(String[] args) throws Exception{
		
		 
		 Source s=new Source(101,"Naveen");
		 
		 File f=new File("./source.txt");
		 if(!f.exists()){
			 f.delete();
		 }
//		boolean fi= f.createNewFile();
//		 System.out.println(fi);
		 
		 FileOutputStream fio=new FileOutputStream(f);
		 
		
		ObjectOutputStream oos=new ObjectOutputStream(fio);
		
		oos.writeObject(s);
		
		FileInputStream fis=new FileInputStream(f);
		
		ObjectInputStream ois=new ObjectInputStream(fis);
		
		Source fh=(Source)ois.readObject();
		
		System.out.println("Roll no:"+fh.roll+" Name:"+fh.name);
		
		fio.close();
		oos.close();
		fis.close();
		ois.close();
		
	//  int  ascii;
	//	 String text="";
	//	 while((ascii =fio.read()) != -1)
		 {
	//		 text+= String.valueOf((char)ascii);
	//		 System.out.print((char)ascii);
			 
		 }
		 
	//	 System.out.println();
	//	 System.out.println(text);
	//	 fio.close();
		 
		 
//		 Scanner sc=new Scanner(fio); 
//		 
//		 String text="";
//		 while(sc.hasNextLine())
//		 {
//			// text+=sc.nextLine() +"\n";
//			 System.out.println(sc.nextLine());
//		 }
//		 
//		// System.out.println(text);
//		 
//		 fio.close();
//		 
//		 sc.close();
	}
}
