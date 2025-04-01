package assignments;

import java.util.Scanner;

public class Assignment_32 {

	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the first number");
		double b=s1.nextInt();
		System.out.println("Enter the second number");
		double h=s1.nextInt();
		System.out.println("This is the base: "+b+" and this is the height: "+h+" of the triangle");
		double areaOfTriangle=(0.5)*(b)*h;
		System.out.println("This is the area of the triangle: "+areaOfTriangle);
		s1.close();	

	}

}
