package array.Concept;

import java.util.Arrays;
import java.util.Scanner;

public class CreateArrayOfSize_4_ofStringDatatype_AcceptInputUsingScanner {

	public static void main(String[] args) 
	{
	    Scanner s1=new Scanner(System.in);   
	    int rollno[]=new int[3];
	    System.out.println("Enter the 1st value");
	    rollno[0]=s1.nextInt();
	    System.out.println("Enter the 2nd value");
	    rollno[1]=s1.nextInt();
	    System.out.println("Enter the 3rd value");
	    rollno[2]=s1.nextInt();
	    
	    System.out.println(Arrays.toString(rollno));
	    s1.close();
	    
	    

	}

}
