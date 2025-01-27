package java_09_input_output_stream;

import java.io.*;

public class FileIntputStream {

	
	public static void main(String[] args) throws IOException {
//		FileOutputStream fis=new FileOutputStream("./naveen.txt");
//		String s="Naidu naveen";
//		byte [] b=s.getBytes();
//		fis.write(b);
//		fis.close();
//	     try{    
//
//	            FileInputStream fin=new FileInputStream("D:\\testout.txt");    
//	            int i=fin.read();  
//	            System.out.print((char)i);    
//	  
//	            fin.close();    FileInputStream
//
//	          }catch(Exception e){System.out.println(e);}  
		  try{    
	            FileInputStream fin=new FileInputStream("D:\\testout.txt");    
	            int i=0;    

	            while((i=fin.read())!=-1)
	            {    
	             System.out.print((char)i);    
	            }  
	            
	            fin.close();    
	          }
		  catch(Exception e)
		  			{System.out.println(e);
		  			
		  			}    
		  
		
	}
}
