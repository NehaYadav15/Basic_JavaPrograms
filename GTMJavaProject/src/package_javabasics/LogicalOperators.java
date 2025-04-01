package package_javabasics;

public class LogicalOperators {

	public static void main(String[] args) 
	{
		int a=80;
		int b=20;
		if(a>b && a==b)
		{
			System.out.println("AND");
		}
		if(a>b || a==b)
		{
			System.out.println("OR");
		}
        if(a!=b)
        {
        	System.out.println("NOT");
        }
        if(!(!(a>b && a!=b)))
		{
			System.out.println("AND with NOT");
		}
		if(!(!(a>b || a==b)))
		{
			System.out.println("OR with NOT");
		}
	}

}
