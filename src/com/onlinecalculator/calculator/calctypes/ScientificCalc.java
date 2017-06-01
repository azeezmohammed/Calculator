package com.onlinecalculator.calculator.calctypes;

import java.lang.Math;

public class ScientificCalc extends BasicCalc{
	
	public int menu(){
  	
		System.out.println("------***------");
    	System.out.println("1: Addition");
    	System.out.println("2: Subtraction");
    	System.out.println("3: Multiplication");
    	System.out.println("4: Division");
    	System.out.println("5: Power");
    	System.out.println("6: SquareRoot");
    	System.out.println("7: Sin");
    	System.out.println("8: Exit");
    	System.out.println("------***------");
    	System.out.println("Enter your choice");
    	ch=s.nextInt();
    	return ch;
	}

  public void userInputs()
  {
  	
	  
	  System.out.println("Enter first number");
	  a=s.nextInt();
	  if(ch!=6 && ch!=7){
  	System.out.println("Enter second number");
  	b=s.nextInt();
	  }
  	
	
  }

  public void performOperation(){
	  
  		switch(ch)
  		{
  		
  		case 1:
  		case 2:
  		case 3:
  		case 4:
  			super.performOperation();
  			break;
  			
  		case 5:
  			System.out.println("Result: "+pwrof());
    		break;
    		
  		case 6:
  			System.out.println("Result: "+sqrtof());
    		break;
    		
  		case 7:
  			System.out.println("Result: "+sineof());
    		break;
    		
  		case 8:
  			System.out.println("Thank You");
    		break;
    		
  		default:
  			System.out.println("Invalid Selection");
  	}
      
  }
  
	double pwrof()
	{
		
		return Math.pow(a,b);
	}
	
	double sqrtof()
	{
		
		return Math.sqrt(a);
	}

	double sineof()
	{
		double rad=Math.toRadians(a);
		return Math.sin(rad);
	}
}

