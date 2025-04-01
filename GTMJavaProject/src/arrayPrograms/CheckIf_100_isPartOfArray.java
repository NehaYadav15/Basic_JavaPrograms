package arrayPrograms;

public class CheckIf_100_isPartOfArray 
{

	public static void main(String[] args)
	{
	      int array[]=new int[4];
	      array[0]=23;
	      array[1]=67;
	      array[2]=100;
	      array[3]=45;
	
	      int noToCheck=100;
	
	      for(int i=0;i<array.length;i++)
	      {
		       if(noToCheck==array[i])
		       {
		    	   System.out.println("Yes 100 is part of aaray and its index is: "+i);
		       }
		       else
		       {
		    	   System.out.println("No 100 is not a part of array");
		       }
	      }

	}

}
