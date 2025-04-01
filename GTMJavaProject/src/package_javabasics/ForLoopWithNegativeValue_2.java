package package_javabasics;

public class ForLoopWithNegativeValue_2 {

	public static void main(String[] args) 
	{
		for(int i=-1;i>0;i++)// Condition is false. So it will not execute.
		{
			System.out.println(i);
		}
        System.out.println("I am still in main method");
	}

}
