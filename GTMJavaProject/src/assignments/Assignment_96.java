package assignments;

import java.util.ArrayList;
import java.util.List;

public class Assignment_96 
{
	//96. WAP for  ArrayList to List for null value and duplicate Values.

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
		 
		 List<Object> l1=new ArrayList<Object>();
		 l1.add("Ram");
		 l1.add(789);
		 l1.addAll(1, l1);
		 l1.addAll(l);
		 System.out.println("Objects of collection l1: "+l1);

	}

}
