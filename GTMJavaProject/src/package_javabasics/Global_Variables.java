package package_javabasics;

public class Global_Variables 
{
	static double pi=3.14;
	double radius=6;
    static boolean answer;
    int a=678;
    static void area()
    {
    	System.out.println(pi);
    	pi=5.8765;
    	System.out.println(pi);
    	Global_Variables g2=new Global_Variables();
    	double area=pi*g2.radius*g2.radius;
    	System.out.println("Area of circle is: "+area);
    	answer=true;
    	System.out.println(answer);
    	System.out.println("a variable: "+g2.a);
    	g2.a=789;
    	System.out.println(g2.a);
    }
    void circumference()
    {
    	pi=5.876;
    	double circumference=2*pi*radius;
    	System.out.println("Circumference of circle is: "+circumference);
    	answer=false;
    	System.out.println(a);
    }
	public static void main(String[] args) 
	{
		//area();
		pi=9.987;
	    System.out.println(pi);	
	    //pi=7.888;
	    //System.out.println(pi);
	    System.out.println(answer);
	    area();
	    Global_Variables g1=new Global_Variables();
	    g1.circumference();
	    System.out.println(g1.a);
	    		

	}

}
