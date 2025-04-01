package collectionConcept;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class CollectionMethods 
{
public static void main(String[] args) {
	 /* Collection<Object> c=new ArrayList<Object>();
	  c.add("dad");
	  c.add(true);
	  c.add(3.3456);
	  c.add('N');
	  c.add(98.9);
	  c.add(9000);
	  
	  System.out.println(c);
	  */ 
	  Collection c1=new ArrayList();
	  c1.add(987);
	  c1.add(788900);
	  c1.add(8765);
	  c1.add(45);
	  c1.add(6);
	  c1.add(45);
	  System.out.println("Without SOrting-> "+c1);
	  Iterator<Integer> i1=			c1.iterator();
	  System.out.println("Iterating through ->");
	  while(i1.hasNext())
	  {
		  System.out.println(i1.next());
	  }
	  
	  
	
	  
	  
	  
/*	 
	  Collection<Integer> c2=new ArrayList<Integer>();
	  c2.add(11);
	  System.out.println(c2.contains(11));
	  c2.addAll(c1);
	  System.out.println(c2.containsAll(c1));
	  
	  c2.add(null);
	  c2.add(null);

	  System.out.println(c2);
//index and order of insertion
	*/  
	  ArrayList a1=new ArrayList();
	  a1.add(43);
	  a1.add(46);
	  a1.add(98);
	  a1.add(1);
	  System.out.println("Without"+a1);
	  Collections.sort(a1);
	  System.out.println("With Sorting->"+a1);
      Collections.reverse(a1);
      System.out.println("sorting: "+a1);
      
	  
	  
}
}
