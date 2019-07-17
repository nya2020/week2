package week2;

import java.util.Scanner;

public class oprations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner her = new Scanner(System.in);
		
		int nya = 23; 
		int she = 20;
		int me  = 30;
		
		double the = 1.25;
		double score = 1.30;
		double points = 1.40;
		
		System.out.println("wlcome to nya caulator!");
		System.out.println("enter a number");
		
		nya = her.nextInt();
		
		System.out.println(" enter a number");
		she = her.nextInt();
		me = she + nya;
		System.out.println(me);
		
		  
		System.out.println("this is the difference ");
		int me1 = she-nya;
		System.out.println(me1);
		
		System.out.println("this is the product ");
		int me2 = me*she;
		System.out.println(me2);
		
		System.out.println("the quotient is"); 
		int me3 = me/she;
		System.out.println(me3);
		
		System.out.println("the sum is ");
		double me4 = the + score;
		System.out.println(me4);
		
		System.out.println("the difference is ");
		double me5 = the - score;
		System.out.println(me5);
		
		System.out.println("the product is ");
		double me6 = score*points;
		System.out.println(me6);
		
		System.out.println("the quotient is ");
		double me7 = score/points;
		System.out.println(me7);
		
				her.close();
	}

}
