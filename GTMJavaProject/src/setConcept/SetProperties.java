package setConcept;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetProperties {

	public static void main(String[] args) 
	{
		Set s1=new HashSet();
		s1.add("Arjun");
		s1.add(67);
		s1.add("Veera");
		s1.add(45);
		s1.add(67);
		s1.add(null);
		s1.add(null);
		System.out.println(s1);
	    Iterator ite=s1.iterator();
	    System.out.println("Forward Iteration using Iterator: ");
	    while(ite.hasNext())
	    {
	    	System.out.println(ite.next());
	    }
        
	    Set<Object> s2=new HashSet<Object>();
	    s2.add(ite);
	    s2.add(s1);
	    s2.add("Arin");
	    System.out.println(s2);
	
	}

}
