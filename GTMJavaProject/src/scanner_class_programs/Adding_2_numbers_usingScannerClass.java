package scanner_class_programs;
import java.util.Scanner;

public class Adding_2_numbers_usingScannerClass 
{

	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the first number");
		int a=s1.nextInt();
		System.out.println("Enter the second number");
		int b=s1.nextInt();
		System.out.println("This is the first number: "+a+" and this is the second number: "+b);
		int sum=a+b;
		System.out.println("This is the sum of above 2 numbers: "+sum);
		s1.close();
		
		
		
		

	}

}
