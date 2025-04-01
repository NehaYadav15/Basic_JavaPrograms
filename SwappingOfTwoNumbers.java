package day3;

public class SwappingOfTwoNumbers 
{

	public static void main(String[] args) 
	{
		//Logic 1 using third variable
		/*int a=10, b=20;
		int t;
		t=a;
		a=b;
		b=t;*/
		
		//Logic2 using + & - operator without using third variable
		
		/*int a=45, b=56;
		a=a+b;  // 45+56=101
		b=a-b;  // 
		a=a-b;
		System.out.println(a);
		System.out.println(b);*/
		
		//Logic3 using * and / operator without using third variable
		// a and b should not be zero...Any number divided by 0 will throw arithmetic exception
		
		/*int a=54, b=36;
		System.out.println("Before swapping values of..."+a+" and " +b);
		a=a*b;
		b=a/b;
		a=a/b;
		System.out.println("After swapping values of..."+a+" and "+b);*/
		
		//Logic4 Bitwise XOR(^) operator
		
		int a=10, b=20;
		/*System.out.println("Before swapping values of..."+a+ "and" +b);
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println("After swapping values of..."+a+ "and" +b);*/
		
		//Logic5 Single Statement
		
		System.out.println("Before swapping values of..."+a+ "and" +b);
		b=a+b-(a=b);   // Execution starts from right to left....
		System.out.println("After swapping values of..."+a+ "and" +b);
		
		

	}

}
