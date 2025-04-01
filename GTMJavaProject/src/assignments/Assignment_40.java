package assignments;

import java.util.Scanner;

public class Assignment_40 {

	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the num for absolute value");
		double num=s1.nextDouble();
		System.out.println("Enter 2 numbers for max,min operations");
		int num1=s1.nextInt();
		System.out.println("Second number");
		int num2=s1.nextInt();
		
		System.out.println("Absolute value:"+Math.abs(num));
		System.out.println("Addition:"+Math.addExact(num1, num2));
		System.out.println("Subtraction:"+Math.subtractExact(num1, num2));
		System.out.println("Maximum of 2 numbers:"+Math.max(num1, num2));
		System.out.println("Minimum of 2 numbers:"+Math.min(num1, num2));
		

	}

}
