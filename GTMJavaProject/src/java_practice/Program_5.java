package java_practice;

import java.util.Arrays;
import java.util.Scanner;

public class Program_5 {

	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		String name[]=new String[4];
		System.out.println("Enter the first name");
		name[0]=s1.next();
		System.out.println("Enter the second name");
		name[1]=s1.next();
		System.out.println("Enter the third name");
		name[2]=s1.next();
		System.out.println("Enter the fourth name");
		name[3]=s1.next();
		
		System.out.println(Arrays.toString(name));
		s1.close();

	}

}
