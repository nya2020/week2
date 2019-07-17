package day7;

import java.util.Scanner;

public class avengers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int black = 5;
		int pink  =  10;
		int blue = 15;
		
		Scanner ecn = new Scanner(System.in);
		
	    String name  = "";
	    String color = "";
	    
	    System.out.println("enter your name");
	    name = ecn.next();
	    
	    System.out.println("whats your favroit color ");
	    color = ecn.next();
	    
	    System.out.println("enter first number");  
	    black = ecn.nextInt();
	     
	    System.out.println("enter second number ");
	    pink = ecn.nextInt();
	    
	    System.out.println(" caulating.....addition......here is your answer ");
	    int  me1 = black + pink;
		System.out.println(me1);
		
		System.out.println("caulating......subtraction.......here is your answer ");
		int me2 = black - pink;
		System.out.println(me2);
		
		System.out.println("caulating......multplicatican......here is your answer  ");
		int me3 = black*pink;
		System.out.println(me3);
		
		System.out.println(" caulating .........division.....here is your answer  ");
		int me4 = black/pink;
		System.out.println(me4);
		
		System.out.println(  "thank you for your participation "+ name   );
		
	
	
		
				
				

	}

}
