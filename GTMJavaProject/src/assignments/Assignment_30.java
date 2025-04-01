package assignments;

import java.util.Scanner;

public class Assignment_30 {

	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the first number");
		int a=s1.nextInt();
		System.out.println("Enter the second number");
		int b=s1.nextInt();
		System.out.println("This is the first number: "+a+" and this is the second number: "+b);
		int sum=a%b;
		System.out.println("This is the mod of above 2 numbers: "+sum);
		s1.close();	

	}

}
