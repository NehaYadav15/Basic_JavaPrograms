package package_javabasics;

public class Global_Variables_Default_values 
{
	static double d1;
	static float f1;
    int a1;
	byte b1;
	static short s1;
	static long r1;
	boolean e1;
    String y1;
    char k1;
	
    static void static_method()
    {
    	int a=667;
    	String name="Neha";
    	System.out.println(a);
    	System.out.println(name);
    	Global_Variables_Default_values g2=new Global_Variables_Default_values();
    	//g2.non_static_method();
    	System.out.println("Non-Static int a1: "+g2.a1);
    	System.out.println("Non-Static byte b1: "+g2.b1);
    	System.out.println("Non-Static boolean e1: "+g2.e1);
    	System.out.println("Non-Static String y1: "+g2.y1);
    	System.out.println("Non-Static char k1: "+g2.k1);
    	System.out.println("Static double d1: "+d1);
    	System.out.println("Static float f1: "+f1);
    	System.out.println("Static short s1: "+s1);
    	System.out.println("Static long r1: "+r1);
    }
    
    void non_static_method()
    {
    	boolean a=true;
    	float h=876.9876F;
    	System.out.println(a);
    	System.out.println(h);
    	System.out.println("Non-Static char k1: "+k1);
    	System.out.println("Static double d1: "+d1);
    	System.out.println("Static float f1: "+f1);
    	System.out.println("Static short s1: "+s1);
    	System.out.println("Static long r1: "+r1);
    	System.out.println("Non-Static int a1: "+a1);
    	System.out.println("Non-Static byte b1: "+b1);
    	System.out.println("Non-Static boolean e1: "+e1);
    	System.out.println("Non-Static String y1: "+y1);
    	static_method();
    }
    
	public static void main(String[] args) 
	{
		Global_Variables_Default_values g2=new Global_Variables_Default_values();
		System.out.println("Static double d1: "+g2.d1);
		System.out.println("Static float f1: "+g2.f1);
		System.out.println("Non-Static int a1: "+g2.a1);
		System.out.println("Non-Static byte b1: "+g2.b1);
		System.out.println("Static short s1: "+g2.s1);
		System.out.println("Static long r1: "+g2.r1);
		System.out.println("Non-Static boolean e1: "+g2.e1);
		System.out.println("Non-Static String y1: "+g2.y1);
		System.out.println("Non-Static char k1: "+g2.k1);
		g2.non_static_method();
		static_method();

	}

}
