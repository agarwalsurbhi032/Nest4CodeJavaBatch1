package Nest4Code;

import java.util.Scanner;

public class Day2 {
//Static Method and data conversion
	public static void main(String args[]){
		int feet,inch;
		int weight;
		float calHeight,calWeight;
		Scanner sc=new Scanner(System.in);
		feet=sc.nextInt();
		inch=sc.nextInt();
		weight=sc.nextInt();
		calHeight=heightConvertor(feet,inch);
		calWeight=weightConvertor(weight);
		System.out.println("Height in cms "+calHeight);
		System.out.println("Weight in pounds "+calWeight);
	}
	static float heightConvertor(int heightFeetPart,int heightInchPart){
		float cm;
		cm=(float) ((heightFeetPart*12*2.54)+(heightInchPart*2.54));
		return cm;
	}
	static float weightConvertor(int weight){
		float pound;
		pound=(float) (weight*2.2);
		return pound;
	}
}
