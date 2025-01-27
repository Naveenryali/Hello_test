package java_09_input_output_stream;

import java.io.ByteArrayInputStream;

public class Byte_Array_Input_stream {
	
	public static void main(String[] args) {
		
		byte[] buf= {35,36,37,38};
		
		ByteArrayInputStream byt= new ByteArrayInputStream(buf);
		int k=0;
		while((k=byt.read())!=-1)
		{
			char ch=(char)k;
			System.out.println("ASCII value of character is:"+k+";Special character is: "+ch);
		}
		
	}

}
