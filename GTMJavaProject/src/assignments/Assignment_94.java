package assignments;

import java.util.ArrayList;
import java.util.List;

public class Assignment_94 
{
    //94.WAP for ArrayList to List by using all List Properties  for String.
	
	public static void main(String[] args) 
	{
		List<String> a=new ArrayList<String>();
		a.add(null);
		a.add("Neha");
		a.add("Ananya");
		a.add(0, "Sita");
		a.add(1, null);
		a.addLast("Ram");
		a.addFirst("Laxaman");
		a.remove(0);
		a.remove("Ananya");
		System.out.println("Objects of Collection a: "+a);
		
		List<String> b=new ArrayList<String>();
		b.add("Batman");
		b.add("Superman");
		b.add("Spiderman");
		b.add(2, null);
		b.addAll(b);
		b.add(null);
		b.addAll(1, a);
		b.add("65");
		b.add("3.14");
		boolean b1=b.contains("Batman");
		System.out.println(b1);
		boolean b2=b.containsAll(a);
		System.out.println(b2);
		b.removeFirst();
		b.removeLast();
		System.out.println("Objects of Collection b: "+b);
		
		List<String> c=new ArrayList<String>();
		c.add("Ananya");
		c.add("Fast and Furious");
		c.addAll(a);
		c.addAll(b);
		c.removeAll(a);
		boolean c1=c.isEmpty();
		System.out.println(c1);
		System.out.println("Objects of Collection c: "+c);
		
		List<String> d=new ArrayList<String>();
		d.add("Avika");
		d.add("567");
		d.clear();
		System.out.println("Objects of Collection d: "+d);
		
		
	}

}
