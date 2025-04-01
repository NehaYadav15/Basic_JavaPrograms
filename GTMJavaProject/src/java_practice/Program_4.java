package java_practice;

import java.util.Arrays;

public class Program_4 {

	public static void main(String[] args) 
	{
		int input[]=new int[4];
		input[0]=56;
		input[1]=34;
		input[2]=89;
		input[3]=67;
		
		int output[]=new int[input.length];
		
		for(int i=0,j=0;i<=input.length-1;i++,j++)
		{
			output[j]=input[i];
		}
      
		System.out.println("Input array: "+Arrays.toString(input));
		System.out.println("Output array: "+Arrays.toString(output));
	}

}
