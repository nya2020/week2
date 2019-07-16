package day7;

import java.util.Scanner;

public class warmup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner warmup = new Scanner(System.in); 
		
		int curt = 22;
		int kyla = 18;
		int bri = 17;
		int nya = 16;
		String name = "";
		
		System.out.println("hi welcome ");
		System.out.println(" enter your name ");
		name = warmup.next();
	
	    System.out.println("enter number");
	    kyla = warmup.nextInt();
	    System.out.println("this is addtion");
	    System.out.println("enter another number ");
	    curt = warmup.nextInt();
	    int me1 = kyla + curt;
	    System.out.println(me1);
	    
	    System.out.println(" the difference");
	    int me2 = kyla - curt;
	    System.out.println(me2);
	    
	    System.out.println(" the product");
	    int me3 = kyla*curt;
	    System.out.println(me3);
	    
	    System.out.println("s the quotient ");
	    int me4 = curt/kyla;
	    System.out.println(me4);
	    
	   System.out.println("thank you for your participation "+ name );
	    

	    warmup.close();
		
	
		
	}

}
