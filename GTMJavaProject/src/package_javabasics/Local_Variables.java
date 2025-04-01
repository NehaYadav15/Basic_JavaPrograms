package package_javabasics;

public class Local_Variables
{
	static void add(int a, int b)
	{
		int c=667;
		//int f;
		//System.out.println(f);
		int d=45;
		int sum=c+d;
		System.out.println(sum);
		//Local_Variables t1=new Local_Variables();
		//t1.div("ABC", false, 78);
		
	}
	static void sub(char a, char b)
	{
		System.out.println("Subtract");
	}
	void mul(int b, int a)
	{
		int c=67;
		float d=456.7789F;
		double mult=c*d;
		System.out.println(mult);
		sub('A', 'r');
	}
	void div(String a, boolean b, int c)
	{
		int d=897;
		byte e=54;
		long div=d/e;
		System.out.println(div);
		d=564;
		System.out.println(d);
		System.out.println(div);
		sub('G','K');
		add(45,87);
		mul(56, 98);
		mod();
	}
	void mod()
	{
		long a=5546789976l;
		short b=67;
		long mod=a%b;
		System.out.println(mod);
	}

	public static void main(String[] args) 
	{
		int a=8876;
		byte b=127;
		add(78, 67);
		sub('N','n');
		Local_Variables t1=new Local_Variables();
		t1.mul(54, 78);
		t1.mod();
		t1.div("Neha", false, 24);
		

	}

}
