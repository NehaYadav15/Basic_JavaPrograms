package array.Concept;

import java.util.Arrays;

public class PrintArrayInReverseOrder {

	public static void main(String[] args) 
	{
		int input[]=new int[3];
		input[0]=23;
		input[1]=78;
		input[2]=45;
		
		int output[]=new int[3];
		output[2]=input[0];
		output[1]=input[1];
		output[0]=input[2];
		
		System.out.println("This is input: "+Arrays.toString(input));
		System.out.println("This is output: "+Arrays.toString(output));
	

	}

}
