package array.Concept;

import java.util.Arrays;

public class ArrayPracticeProblem {

	public static void main(String[] args) 
	{
		int rollno[]=new int[4];
		rollno[0]=34;
		rollno[1]=44;
		rollno[2]=54;
		rollno[3]=64;
		System.out.println("1st way to print array: "+rollno[0]);// 1st way to print array
		System.out.println("2nd way to print array: ");
		for(int i=0;i<=rollno.length-1;i++)
		{
			System.out.println(rollno[i]);// 2nd way
		}
		System.out.println("3rd way to print array: "+Arrays.toString(rollno));// 3rd way
	}

}
