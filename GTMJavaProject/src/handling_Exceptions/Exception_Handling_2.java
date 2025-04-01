package handling_Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception_Handling_2 {

	public static void main(String[] args) //NegativeArraySizeException  InputMismatchException
	{
		try
		{
		   Scanner s1=new Scanner(System.in);
		   System.out.println("Enter the size of your array: ");
		   int rollno[]=new int[s1.nextInt()];
		}
		catch(NegativeArraySizeException n)
		{
			Scanner s1=new Scanner(System.in);
			System.out.println("Enter the size of your array: ");
			int rollno[]=new int[s1.nextInt()];
		}
		catch(InputMismatchException h)
		{
			Scanner s1=new Scanner(System.in);
			System.out.println("Enter the size of your array: ");
			int rollno[]=new int[s1.nextInt()];
		}

	}

}
