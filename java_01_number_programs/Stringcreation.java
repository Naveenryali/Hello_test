	package java_01_number_programs;
	
	public class Stringcreation {
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	
			String s1 = "java"; //creating string using string literal
			char ch[] = {'s','t','r','i','n','g'};
			String s2 = new String(ch);//converting char array to string
			String s3 = new String("example");//creating string using new keyword
			char ch1[] =s1.toCharArray();
			for(int i=0;i<ch1.length;i++)
			{
				System.out.print(ch1[i]+" ");
			}
			System.out.println();
			System.out.println(s1);
			System.out.println(s2);
			System.out.println(s3);
			System.out.println(ch1);
			
			
			
			
		}
	
	}
