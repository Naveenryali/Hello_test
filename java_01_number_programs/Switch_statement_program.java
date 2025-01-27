package java_01_number_programs;

import java.util.Scanner;

public class Switch_statement_program {

	public static void main(String[] args) {
//		int num =20;
//		switch(num)
//		{
//		case 10:System.out.println("10");
//		break;
//		case 20:System.out.println("20");
//		break;
//		case 30:System.out.println("30");
//		break;
//		default:System.out.println("not in 10,20,30");
//		}

//		int month =7;
//		
//		String monthString="";
//		switch(month) {
//		case 1: monthString="1-january";
//			break;
//		case 2 :monthString="2-february";
//				break;
//		case 3 :monthString="3-march";
//		break;
//		case 4 :monthString="4-april";
//		break ;
//		case 5 :monthString="5-may";
//		break;
//		case 6:monthString="6june";
//		break;
//		case 7:monthString="7-july";
//		break;
//		case 8:monthString="8-august";
//		break;
//		case 9:monthString="9-september";
//		break;
//		case 10:monthString="10-october";
//		break;
//		case 11:monthString="11-november";
//		break;
//		case 12:monthString="12-decmber";
//		break;
//		
//		default:System.out.println("invalid month!");
//		
//		}
//		
//		
//		System.out.println(monthString);
		
	//	Scanner sc =new Scanner(System.in);
		
		//System.out.println("enter a character");
		//char ch =sc.next().charAt(0);
				
				
		
	
		//switch(ch)
		{
		
		
	//		System.out.println("it is upper case");
		
//		case 'A' :System.out.println("A is vowel");
//		break;
//		case 'E':System.out.println("E is vowel");
//		break;
//		case 'I':System.out.println("I is  vowel");
//		break;
//		case 'O':System.out.println("O is vowel");
//		break;
//		case 'U':System.out.println("U is vowel");
//		break;
//		case 'S':System.out.println("S is vowel");
//		break;
	//	default:
		//	System.out.println("consonant");
		
		
		//sc.close();
		
		
		}
		int operator,n1,n2 ;
		System.out.println("1-add / 2-subtract / 3-multiply / 4-divison");
		System.out.println("choose the operator :");
		Scanner sc =new Scanner(System.in);
		 operator =sc.nextInt();
		 System.out.print("enter first number:");
		 n1 =sc.nextInt();
		 System.out.print("enter second number");
		 n2 =sc.nextInt();
		 int result = 0;
		 
		 switch(operator)
		 {
		 case 1:
			 result =n1+n2;
			 break;
		 case 2:
			 result =n1-n2;
			 break;
		 case 3:
			 result =n1*n2;
			 break;
		 case 4:
			 result =n1/n2;
			 break;
			 default:
				 System.out.println("enter field is in valid");
		 }
		 System.out.println("result is :" + result);
		 sc.close();
	}
}
