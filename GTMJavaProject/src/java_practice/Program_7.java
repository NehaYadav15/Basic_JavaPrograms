package java_practice;

import java.util.Arrays;

public class Program_7 {

	public static void main(String[] args) 
	{
		int input[]=new int[3];
		input[0]=23;
		input[1]=34;
		input[2]=45;
		
		int output[]=new int[input.length];
		
		for(int i=0,j=input.length-1;i<=input.length-1;i++,j--)
		{
			output[j]=input[i];
		}
		System.out.println("Input is: "+Arrays.toString(input));
		System.out.println("Output is: "+Arrays.toString(output));
	}

}
