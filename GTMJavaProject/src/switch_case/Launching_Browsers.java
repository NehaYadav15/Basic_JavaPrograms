package switch_case;

import java.util.Scanner;

public class Launching_Browsers 
{

	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		System.out.print("Please enter 1 for Chrome");
		System.out.print(",2 for Mozilla");
		System.out.print(",3 for Edge");
		System.out.print(" or 4 for Safari");
		int input=s1.nextInt();
		switch(input)
		{
		case 1:System.out.println("Code of launching Chrome");
		       break;
		
		case 2:System.out.println("Code of launching Mozilla");
		       break;
		
		case 3:System.out.println("Code of launching Edge");
		       break;
		
		case 4:System.out.println("Code of launching Safari");
		       break;
		default:
			   System.out.println("Please check the options available");       
		}

	}

}
