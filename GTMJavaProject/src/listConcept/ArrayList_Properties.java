package listConcept;

import java.util.ArrayList;

public class ArrayList_Properties {

	public static void main(String[] args) 
	{
		ArrayList<Object> a=new ArrayList<Object>();
		a.add("Laxman");
		a.add("Ram");
		a.add(0, "Sita");
		int size=a.size();
		System.out.println(size);
		Object element=a.get(1);
		System.out.println(element);
		a.set(2, "Bhim");
		int index=a.indexOf("Laxman");
		System.out.println(index);
		Object elements=a.getFirst();
		System.out.println(elements);
		System.out.println(a);

	}

}
