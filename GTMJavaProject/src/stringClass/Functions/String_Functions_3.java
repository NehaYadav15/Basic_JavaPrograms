package stringClass.Functions;

public class String_Functions_3 
{

	public static void main(String[] args) 
	{
        String a="automation";
        char c1=a.charAt(3);
        System.out.println(c1);
        
        String a2=a.toUpperCase();
        System.out.println(a2);

        String b="Automation Testing";
        System.out.println(b.toUpperCase());
        System.out.println(b.toLowerCase());
        
        String c="I am Ram";
        System.out.println(c.trim());
        
        String c2="     I am Ram";
        System.out.println(c2);
        System.out.println(c2.trim());
        
        String c3="                  I am Ram           ";
        System.out.println(c3);
        System.out.println(c3.trim());
        
        
	}

}
