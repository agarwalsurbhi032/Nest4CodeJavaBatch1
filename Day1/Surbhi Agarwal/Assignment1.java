package Nest4Code;

import java.util.Scanner;

public class Day1 {
      public static void main(String []args){
    	  float price1,price2,price3;
    	  float tax,finalAmount;
    	  Scanner sc=new Scanner(System.in);
    	  price1=sc.nextFloat();
    	  price2=sc.nextFloat();
    	  price3=sc.nextFloat();
    	  tax=sc.nextFloat();
    	  System.out.println("Final Amount "+(tax/100)*(price1+price2+price3));
      }
}
