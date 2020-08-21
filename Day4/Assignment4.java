package Nest4Code;

import java.util.Scanner;

public class Day4 {
  public static void main(String args[]){
	  System.out.println("Enter a numer ");
	  Scanner sc=new Scanner(System.in);
	  int num=0,rem=0,even=0,odd=0;
	  num=sc.nextInt();
	  int digits=0;
	  while(num!=0){
		  rem=num%10;
		  num=num/10;
		  if(rem%2==0){
			  even++;
		  }
		  else {
			  odd++;
		  }
	  }
	  System.out.println("odd digit:"+odd);
	  System.out.println("even digit:"+even);
	 
  }
}
