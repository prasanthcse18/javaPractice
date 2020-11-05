package com.prasanth.condiotionalstatement;

import java.util.*;

/*
 * Author Prasanth Ganesan
 * Simple Calculator Program
 **/

public class SwitchStatement {
	public static void main(String[] args) {
		float a,b;
		int key;
		Scanner S = new Scanner(System.in);
		System.out.println("\nSimple Calculator");
		System.out.println("\n1.Addition\n2.Subraction\n3.Multiplication\n4.Division");
	    System.out.println("\nPlease select an option");
	    key = S.nextInt();
	    switch(key) {
	    
	    case 1:{
	    	System.out.println("\nPlease Enter two values");
	    	a = S.nextFloat();
	    	b = S.nextFloat();
	    	System.out.println("\nThe value of Addition "+(a+b));
	    	break;
	    }
	    
	    case 2:{
	    	System.out.println("\nPlease Enter two values");
	    	a = S.nextFloat();
	    	b = S.nextFloat();
	    	System.out.println("\nThe value of Subraction "+(a-b));
	    	break;
	    }
	    
	    case 3:{
	    	System.out.println("\nPlease Enter two values");
	    	a = S.nextFloat();
	    	b = S.nextFloat();
	    	System.out.println("\nThe value of Multiplication "+(a*b));
	    	break;
	    }
	    
	    case 4:{
	    	System.out.println("\nPlease Enter two values");
	    	a = S.nextFloat();
	    	b = S.nextFloat();
	    	System.out.println("\nThe value of Division");
	    	System.out.println("\nQutioent:"+(a/b));
	    	System.out.println("\nReminder:"+(a%b));
	    	break;
	    }
	    default:{
	    	System.out.println("\nYou entered a wrong option");
	    	break;
	    }
	    	
	    
	    }
	}
}
