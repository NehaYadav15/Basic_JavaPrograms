package scanner_class_programs;

import java.util.Scanner;

public class All_Methods_Of_Scanner_Class {

	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the int datatype value");
		int a=s1.nextInt();
		System.out.println("Enter the short datatype value");
		short b=s1.nextShort();
		System.out.println("Enter the byte datatype value");
		byte c=s1.nextByte();
		System.out.println("Enter the long datatype value");
		long d=s1.nextLong();
		System.out.println("Enter the boolean datatype value");
		boolean e=s1.nextBoolean();
		System.out.println("Enter the String value");
		String f=s1.next();
		s1.close();
		

	}

}
