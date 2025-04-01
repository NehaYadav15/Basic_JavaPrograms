package array.Concept;

import java.util.Arrays;

public class CheckIf_2_ArraysAreSameOrNot {

	public static void main(String[] args) 
	{
		int rollno[]=new int[4];
		rollno[0]=34;
		rollno[1]=44;
		rollno[2]=54;
		rollno[3]=64;
		int rollno1[]=new int[4];
		rollno1[0]=34;
		rollno1[1]=44;
		rollno1[2]=54;
		rollno1[3]=64;
		
		boolean answer=Arrays.equals(rollno, rollno1);
        System.out.println(answer);
	}

}
