package setConcept;

import java.util.HashSet;

public class HashSet_Properties {

	public static void main(String[] args) 
	{
	    HashSet<Object> h=new HashSet<Object>();	
	    h.add(89);
	    h.add(67);
	    h.add(null);
	    h.add(67);
	    h.add(67);
	    h.add("Ram");
	    h.add("Sita");
	    System.out.println(h);

	}

}
