package package_javabasics;

public class Accessing_Static_Global_Variables 
{
	static double a=234.56776;
	static int b=34;
	double pi=Math.PI;
	
	static void add()
	{
		double sum=a+b;
		a=679.45632;
		b=67;
		System.out.println(sum);
	}
	static void sub()
	{
		double subt=a-b;
		System.out.println(subt);
	}
	void mul()
	{
		a=567.9800;
		b=23;
		double mult=a*b;
		System.out.println(mult);
		pi=4567.87865;
	}

	public static void main(String[] args)
	{
		System.out.println(a);
		System.out.println(b);
		a=768.34567;
		b=45;
		add();
		sub();
		Accessing_Static_Global_Variables v1=new Accessing_Static_Global_Variables();
		v1.mul();

	}

}
