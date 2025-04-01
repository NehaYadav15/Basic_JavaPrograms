package java_practice;

import java.util.Arrays;
import java.util.Scanner;

public class Program_6 {

	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		int array[]=new int[3];
		
		for(int i=0;i<=array.length-1;i++)
		{
			System.out.println("Enter the value at index: "+i);
			array[i]=s1.nextInt();
		}
		System.out.println(Arrays.toString(array));
		s1.close();

	}

}
