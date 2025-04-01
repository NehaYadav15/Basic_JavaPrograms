package package_javabasics;

public class Accessing_Non_Static_Global_Variables 
{
	double a=234.56776;
	//a=876.7654;  // We cannot update global variables in the next line.
	int b=34;
	
	static void add()
	{
		Accessing_Non_Static_Global_Variables v1=new Accessing_Non_Static_Global_Variables();
		double sum=v1.a+v1.b;
		v1.a=679.45632;
		v1.b=67;
		System.out.println(sum);
	}
	static void sub()
	{
		Accessing_Non_Static_Global_Variables v1=new Accessing_Non_Static_Global_Variables();
		double subt=v1.a-v1.b;
		System.out.println(subt);
		System.out.println(v1.a-v1.b);
	}
	void mul()
	{
		a=567.9800;
		b=23;
		double mult=a*b;
		System.out.println(mult);
	}

	public static void main(String[] args)
	{
		Accessing_Non_Static_Global_Variables v1=new Accessing_Non_Static_Global_Variables();
		v1.mul();
		System.out.println(v1.a);
		System.out.println(v1.b);
		v1.a=768.34567;
		v1.b=45;
		add();
		sub();
		

	}

}
