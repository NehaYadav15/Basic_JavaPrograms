package assignments;

import java.util.Scanner;

public class Assignment_37 {

	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the first number");
		double l=s1.nextInt();
		System.out.println("Enter the second number");
		double b=s1.nextInt();
		System.out.println("This is the length: "+l+" and this is the breadth: "+b+" of the rectangle");
		double circumferenceOfRectangle=2*l*b;
		System.out.println("This is the area of the rectangle: "+circumferenceOfRectangle);
		s1.close();

	}

}
