package assignments;

import java.util.Scanner;

public class Assignment_31 {

	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the first number");
		double r=s1.nextInt();
		System.out.println("This is the radius of circle"+r);
		double areaOfCircle=3.14*r*r;
		System.out.println("This is the area of circle: "+areaOfCircle);
		s1.close();

	}

}
