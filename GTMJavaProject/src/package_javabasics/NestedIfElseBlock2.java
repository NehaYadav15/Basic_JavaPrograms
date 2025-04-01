package package_javabasics;

public class NestedIfElseBlock2 {

	public static void main(String[] args) 
	{
	    int a=10;
	    int b=20;
	    int c=10;
	    if(a==10)
	    {
	    	if(c==10)
	    	{
	    	System.out.println("1");
	    	
	    	    if(b!=c)
	    	    	{
	    	    		System.out.println("7");
	    	    		if(a==c)
	    	    		{
	    	    			System.out.println("5");
	    	    		}
	    	    		else
	    	    		{
	    	    			System.out.println("3");
	    	    		}
	    	    	}
	    	    else
	    	    {
	    	    	System.out.println("8");
	    	    }
	    	  }
	    
	    	else
	    	{
	    		System.out.println("2");
	        }
	    }	
	    else
	    {
	    	System.out.println("3");
	    }

	}

}
