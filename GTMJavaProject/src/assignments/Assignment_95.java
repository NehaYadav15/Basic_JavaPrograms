package assignments;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Assignment_95 
{
    //95.WAP for ArrayList to List using  Listiterator.
	
	public static void main(String[] args) 
	{
		List<Object> l=new ArrayList<Object>();
		 l.add("Ram");
		 l.add("Sita");
		 l.add(0, "Laxman");
		 l.addFirst(78);
		 l.add(678.9087);
		 l.add(null);
		 l.add(null);
		 l.add(78);
		 l.add(null);
		 l.addLast(567);
		 l.add(78);
		 System.out.println("Objects of collection l: "+l);
		 
		 System.out.println("Forward Iteration using iterator method: ");
		 Iterator<Object> ite=l.iterator();
		 while(ite.hasNext())
		 {
			 System.out.println(ite.next());
		 }
		 System.out.println("Forward Iteration using ListIterator: ");
		 ListIterator<Object> lte=l.listIterator();
		 while(lte.hasNext())
		 {
			 System.out.println(lte.next());
		 }
		 System.out.println("Backward Iteration using ListIterator: ");
		 while(lte.hasPrevious())
		 {
			 System.out.println(lte.previous());
		 }
			 

	}

}
