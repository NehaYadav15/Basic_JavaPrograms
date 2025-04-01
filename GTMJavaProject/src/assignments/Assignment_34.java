package assignments;

import java.util.Scanner;

public class Assignment_34 {

	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the first number");
		double a=s1.nextInt();
		System.out.println("This is the side: "+a+"of the square");
		double areaOfSquare=a*a;
		System.out.println("This is the area of square : "+areaOfSquare);
		s1.close();	  

	}

}
