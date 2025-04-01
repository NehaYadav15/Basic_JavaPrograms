package stringClass.Functions;

public class String_Function_4 {

	public static void main(String[] args) 
	{
		String a="Neha Yadav";
		String a1=a.substring(3);
		System.out.println(a1);
		
		String a2=a.substring(1, 10);
		System.out.println(a2);
		
		int i=a.indexOf('a');
        System.out.println(i);
        
        boolean e=a.isEmpty();
        System.out.println(e);
        
        String b="manish";
        String b1=b.replace('m', 'a');
        System.out.println(b1);
        
        String c=" manish kumar tiwari";
        System.out.println(c.replace("tiwari", "rai"));
        
        System.out.println(c.repeat(6));
	}

}
