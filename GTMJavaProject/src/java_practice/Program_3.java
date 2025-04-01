package java_practice;

import java.util.Arrays;

public class Program_3 {

	public static void main(String[] args) 
	{
		int rollno[]=new int[4];
		rollno[0]=67;
		rollno[1]=45;
		rollno[2]=34;
		rollno[3]=56;
		int rollno1[]=new int[4];
		rollno[0]=67;
		rollno[1]=45;
		rollno[2]=34;
		rollno[3]=56;
		boolean answer=Arrays.equals(rollno, rollno1);
		System.out.println(answer);

	}

}
