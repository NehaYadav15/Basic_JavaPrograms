package assignments;

import java.util.Scanner;

public class Assignment_38 {

	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the first number");
		double a=s1.nextInt();
		System.out.println("This is the side: "+a+"of the square");
		double circumferenceOfSquare=4*a;
		System.out.println("This is the area of square : "+circumferenceOfSquare);
		s1.close();	 

	}

}
