package array.Concept;

import java.util.Arrays;
import java.util.Scanner;

public class CreatingArrayOf_int_type_usingScanner2 {

	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);   
	    int rollno[]=new int[3];
	    for(int i=0;i<=rollno.length-1;i++)
	    {
	    	System.out.println("Please enter the value at index: "+i);
	    	rollno[i]=s1.nextInt();
	    
	    }
	    System.out.println(Arrays.toString(rollno));
	    s1.close();
	}

}
