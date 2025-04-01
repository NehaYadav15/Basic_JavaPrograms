package mock.Interview;

import java.util.Arrays;

public class Program_1 {

	public static void main(String[] args) 
	{
	     int rollno[]=new int[3];
	     rollno[0]=34;
	     rollno[1]=45;
	     rollno[2]=23;
	    
	     int rollno1[]=new int[rollno.length];
	     
	     for(int i=0,j=rollno.length-1;i<=rollno.length-1;i++,j--)
	     {
	    	 rollno1[j]=rollno[i];
	     }
	     System.out.println(Arrays.toString(rollno));
	     System.out.println(Arrays.toString(rollno1));
	}

}
