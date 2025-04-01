package assignments;

import java.util.Scanner;

public class Assignment_33 {

	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the first number");
		double l=s1.nextInt();
		System.out.println("Enter the second number");
		double b=s1.nextInt();
		System.out.println("This is the length: "+l+" and this is the breadth: "+b+" of the rectangle");
		double areaOfRectangle=l*b;
		System.out.println("This is the area of the rectangle: "+areaOfRectangle);
		s1.close();	

	}

}
