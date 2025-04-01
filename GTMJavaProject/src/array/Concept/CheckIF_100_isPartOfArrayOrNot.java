package array.Concept;

public class CheckIF_100_isPartOfArrayOrNot {

	public static void main(String[] args) 
	{
		int array[]=new int[4];
		array[0]=78;
		array[1]=100;
        array[2]=45;
        array[3]=34;
        int noToCheck=100;
        for(int i=0;i<array.length;i++)
        {
        	if(noToCheck==array[i])
        	{
        		System.out.println("Yes 100 is part of array and its index is: "+i);
        		//System.out.println(" and its index is: "+i);
        	}
        	else
        	{
        		System.out.println("No 100 is not part of array");
        	}
         }
	}

}
