package assignments;

import java.util.ArrayList;
import java.util.Collection;

public class Assignment_91 
{
    // 91.WAP for Upcasting from ArrayList to Collection for null value and duplicate Values.
	
	public static void main(String[] args) 
	{
		Collection<Object> a=new ArrayList<Object>();
		a.add("Neha");
		a.add("Batman");
		a.add(15);
		a.add(6);
		a.add(null);
		a.add(null);
		a.add(null);
		a.add(15);
		a.add(6);
		System.out.println("Objects of Collection a: "+a);

	}

}
