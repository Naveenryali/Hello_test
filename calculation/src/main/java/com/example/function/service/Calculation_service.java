package com.example.function.service;

import org.springframework.stereotype.Service;

@Service
public class Calculation_service {

	public int add(int number1,int number2) {
		
		return number1+number2;
	}

	public int sub(int number1,int number2) {
		return number1-number2;
	}

	public int multiply(int number1, int number2) {
		
		return number1*number2;
	}

	public String div(int number1,int number2) {
		String result=null;
		double d=0.0;
		try
		{
			if(number2==0)
			{
				throw new ArithmeticException("ArithmeticException: / by zero");
			}
			d=(double)number1/number2;
		result = Double.toString(d);
		}
		catch(Exception e) {
			System.out.println(e);
		
			result=e.getMessage();
		}
		return result;	
	}

	public String division(int number1, int number2)
	{
			
		String result =null;
		double d=0.0;
		try {
			 d=number1/number2;
			result =Double.toString(d);
		}
		catch(Exception e)
		{
			System.out.println(e);
			result=e.getMessage();
			
		}
		return result;
	}

	
	
	
	
	

}
