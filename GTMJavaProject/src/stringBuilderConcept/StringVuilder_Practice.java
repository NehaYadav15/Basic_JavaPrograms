package stringBuilderConcept;

public class StringVuilder_Practice {

	public static void main(String[] args) 
	{
		StringBuilder s1=new StringBuilder("Automation");
        s1.append(" Testing");
        System.out.println(s1);
        
        s1.replace(0, 10, "Manual");
        System.out.println(s1);
        
        s1.replace(7, 14, "and Automation");
        System.out.println(s1);
        
        StringBuilder s2=new StringBuilder("Core Java");
        s2.delete(0, 0);
	}

}
