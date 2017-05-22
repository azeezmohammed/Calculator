package com.onlinecalculator.calculator.maincalc;

import java.util.Scanner;

import com.onlinecalculator.calculator.calctypes.*;

public class MainPgm {
public static void main(String args[]){
	
	BasicCalc bc=new BasicCalc();
	bc.userInputs();
	bc.menu();
	bc.performOperation();
	
        char type;
        type=getType();
        if(type=='a')
        {
        	
        }
        if(type=='b')
        {
       		
       	}
        	
        	if(type=='c')
        	{
        		
        	}
 
    }
        
    static char getType()
    {
    	return 'a';
    }
}