package assignments;

import java.util.ArrayList;
import java.util.List;

public class Assignment_93 
{
    //93.WAP for  ArrayList to List by using  all List Properties  for Integer.
	
	public static void main(String[] args) 
	{
		List<Integer> a=new ArrayList<Integer>();
		a.add(67);
		a.add(456);
		a.add(78);
		a.add(0, 89);
		a.addLast(34);
		a.addFirst(6);
		a.remove(0);
		System.out.println("Objects of Collection a: "+a);
		
		List<Integer> b=new ArrayList<Integer>();
		b.add(89);
		b.add(90);
		b.add(2, null);
		b.addAll(b);
		b.add(null);
		b.addAll(1, a);
		b.add(56);
		b.add(34);
		boolean b1=b.contains(90);
		System.out.println(b1);
		boolean b2=b.containsAll(a);
		System.out.println(b2);
		b.removeFirst();
		b.removeLast();
		System.out.println("Objects of Collection b: "+b);
		
		List<Integer> c=new ArrayList<Integer>();
		c.add(45);
		c.add(34);
		c.addAll(a);
		c.addAll(b);
		c.removeAll(a);
		boolean c1=c.isEmpty();
		System.out.println(c1);
		System.out.println("Objects of Collection c: "+c);
		
		List<Integer> d=new ArrayList<Integer>();
		d.add(987);
		d.add(356);
		d.clear();
		System.out.println("Objects of Collection d: "+d);
		

	}

}
