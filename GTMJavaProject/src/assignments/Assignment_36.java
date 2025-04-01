package assignments;

import java.util.Scanner;

public class Assignment_36 {

	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the first side");
		double a=s1.nextInt();
		System.out.println("Enter the second side");
		double b=s1.nextInt();
		System.out.println("Enter the third side");
		double c=s1.nextInt();
		System.out.println("This is the first side: "+a+", this is the second side: "+b+" and this is the third side of the triangle"+c);
		double circumferenceOfTriangle=a*b*c;
		System.out.println("This is the area of the triangle: "+circumferenceOfTriangle);
		s1.close();		

	}

}
