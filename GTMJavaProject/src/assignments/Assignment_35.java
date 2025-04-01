package assignments;

import java.util.Scanner;

public class Assignment_35 {

	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the first number");
		double r=s1.nextInt();
		System.out.println("This is the radius of circle"+r);
		double circumferenceOfCircle=2*3.14*r;
		System.out.println("This is the area of circle: "+circumferenceOfCircle);
		s1.close();	

	}

}
