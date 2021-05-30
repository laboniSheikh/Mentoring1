package Laboni;

import java.util.Scanner;

public class emiCalculation {

	public static void main(String[] args) {
		
		int principal = 0;
		float rateofinterest=0.0f;
		byte numberofyears=0;
		
		Scanner scan= new Scanner(System.in);
		  
		System.out.println("Enter principal amount ");
		principal=scan.nextInt();
		
		System.out.println("Enter rate of interest ");
		rateofinterest=scan.nextFloat();
		
		System.out.println("Enter number of years ");
		numberofyears=scan.nextByte();
		
		principal = 2000000;
	 rateofinterest=12.22f;
		 numberofyears=5;
		
		 rateofinterest=rateofinterest/(12*100); 
		 numberofyears = 5*12;
	      
	      
	       double emi= (principal*rateofinterest*Math.pow(1+rateofinterest,numberofyears))/(Math.pow(1+rateofinterest,numberofyears)-1);
	      
	        System.out.print("Monthly EMI is= "+emi+"\n");
	        
	                 
	    }
		
		
		
		
	}


