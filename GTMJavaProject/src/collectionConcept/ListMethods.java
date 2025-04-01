package collectionConcept;

import java.util.ArrayList;
import java.util.List;

public class ListMethods {

	public static void main(String[] args) 
	{
		List l=new ArrayList();
		l.add(78);
		l.add(45);
		l.add("Ram");
		System.out.println(l);
		
		List<Object> l1=new ArrayList<Object>();
		l1.add("Sita");
		l1.add(0, "Laxman");
		l1.addAll(l);
		l1.addAll(2, l1);
		l1.addLast("Arjun");
		l1.addFirst("Bhim");
		l1.removeAll(l1);
		System.out.println(l1);

	}

}
