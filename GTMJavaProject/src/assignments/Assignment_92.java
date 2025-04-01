package assignments;

import java.util.ArrayList;
import java.util.List;

public class Assignment_92 
{
    //92.WAP for  ArrayList to List by using  all List Properties for Heterogeneous.
	
	public static void main(String[] args) 
	{
		List<Object> a=new ArrayList<Object>();
		a.add("Fast and Furious");
		a.add(0, 6);
		a.addFirst("Neha");
		a.addLast(890);
		a.add(1, 15);
		System.out.println("Objects of Collection a: "+a);
		
		List<Object> b=new ArrayList<Object>();
		b.add("SDET");
		b.add(15);
		b.add(1, 21);
		b.add(3);
		b.addAll(a);
		b.addAll(2, b);
		boolean b1=b.contains(15);
		System.out.println(b1);
		boolean b2=b.containsAll(a);
		System.out.println(b2);
		b.remove(6);
		b.remove(3);
		b.removeAll(a);
        System.out.println("Objects of Collection b: "+b);
        
        List<Object> c=new ArrayList<Object>();
        c.add("Sita");
        c.add(0);
        c.clear();
        boolean c1=c.isEmpty();
        System.out.println(c1);
        System.out.println("Objects of Collection c: "+c);
	}

}
