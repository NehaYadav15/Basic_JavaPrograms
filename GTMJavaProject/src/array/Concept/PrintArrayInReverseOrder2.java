package array.Concept;

import java.util.Arrays;

public class PrintArrayInReverseOrder2 {

	public static void main(String[] args) 
	{
		int input[]=new int[5];
		input[0]=23;
		input[1]=78;
		input[2]=45;
		input[3]=45;
		
		int output[]=new int[input.length];
		
		for(int i=0,j=4;i<=input.length-1;i++,j--)
		{
		output[j]=input[i];
		}
		
		System.out.println("This is input: "+Arrays.toString(input));
		System.out.println("This is output: "+Arrays.toString(output));
		

	}

}
