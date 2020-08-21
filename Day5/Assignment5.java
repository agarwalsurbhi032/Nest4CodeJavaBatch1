package Nest4Code;

import java.util.Scanner;

public class Day5 {
  public static void main(String args[]){
	  int num=0;
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter max no of stars in the pattern");
	  num=sc.nextInt();
	  for(int i=1;i<=num;i++){
		  for(int j=1;j<=i;j++){
			  System.out.print("*");
		  }
		  System.out.print("\n");
	  }
	
	  for(int i=num-1;i>0;i--){
		  for(int j=1;j<=i;j++){
			  System.out.print("*");
		  }
		  System.out.print("\n");
	  }

	  sc.close();
  }
}
