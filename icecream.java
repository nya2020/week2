package day9;

import java.util.Scanner;

public class icecream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner ice = new Scanner(System.in);

  int no = 5;
  int yes = 10;
  int maybe = 15;
 
   
  String name = "";
  int age = 20;
  String color = "";
  
  System.out.println(" HI ! are names are kai,kya and nya were known as icecream   and this is are program , whats your name ");
  name = ice.next();
 
 System.out.println("so i know we'er different ages but , i was woundering  how old you are ");
  age = ice.nextInt();
 
 System.out.println( "Alright we have your name and age so we have one more question and that question i what's your favorite color ");
  color =ice.next();
  
  System.out.println("okay we have everything so your name is"  + name + " and you age is "  + age + " your favroit color is"  + color +" am i right let me know if im wrong ");
  
	}

}
