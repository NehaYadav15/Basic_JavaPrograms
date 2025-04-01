package collectionConcept;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class UpcastingFromArrayListToCollection {

	public static void main(String[] args) 
	{
		  Collection<Object> c=new ArrayList<Object>();
		  c.add("dad");
		  c.add(true);
		  c.add(3.3456);
		  c.add('N');
		  c.add(98.9);
		  c.add(9000);
		  //c.addAll(o);
		  System.out.println(c);
		  
		  Collection<Object> o=new ArrayList<Object>();
		  o.add("dad");
		  o.add(true);
		  o.add(3.3456);
		  o.add('N');
		  o.add(98.9);
		  o.add(9000);
		  o.addAll(c);
		  int size=o.size();
		  System.out.println(o);
		  System.out.println("Size: "+size);
		  
		  Collection<Integer> c1=new ArrayList<Integer>();
		  c1.add(987);
		  c1.add(788900);
		  c1.add(8765);
		  c1.add(45);
		  c1.add(6);
		  c1.add(45);
		  c1.add(null);
		  c1.add(null);
		  c1.add(45);
		  c1.add(null);
		  c1.add(45);
		  System.out.println(c1);
		  Iterator<Integer> i1=c1.iterator();
		 
		  
		  Collection<String> c2=new ArrayList<String>();
		  c2.add("Ram");
		  c2.add("false");
		  c2.add("3.3456");
		  c2.add("Sita");
		  c2.add("Laxman");
		  c2.add("9000");
		  System.out.println(c2);
		  
		  Collection<String> c3=new ArrayList<String>();
		  c3.add("Neha");
		  c3.addAll(c2);
		  System.out.println(c3);
		  
		  Collection<String> c4=new ArrayList<String>();
		  c4.add(" ");
		  System.out.println(c4);
		  boolean b=c4.isEmpty();
		  System.out.println(b);
		  c4.addAll(c2);
		  System.out.println(c4);
		  c4.remove("Laxman");
		  System.out.println("Updated value: "+c4);
		  c4.removeAll(c2);
		  System.out.println("Updated value: "+c4);
		  
		  Collection c5=new ArrayList();
		  c5.add("dad");
		  c5.add(true);
		  c5.add(3.3456);
		  c5.add('N');
		  c5.add(98.9);
		  c5.add(9000);
		  System.out.println(c5);
		  

	}

}
