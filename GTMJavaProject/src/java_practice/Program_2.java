package java_practice;

public class Program_2 {

	public static void main(String[] args) 
	{
		int rollno[]=new int[4];
		rollno[0]=87;
		rollno[1]=56;
		rollno[2]=34;
		rollno[3]=23;
		int noToCheck=56;
		for(int i=0;i<rollno.length;i++)
		{
			if(noToCheck==rollno[i])
			{
				System.out.println("Yes 56 is part of array and its index is:"+i);
			}
			else
			{
				System.out.println("No 56 is not part of array");
			}
		}

	}

}
