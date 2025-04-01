package mapConcept;

import java.util.HashMap;

public class HashMap_Properties 
{

	public static void main(String[] args) 
	{
		HashMap h1=new HashMap();
		h1.put("Name-1", "Neha");
		h1.put("Name-2", "Ram");
		h1.put("Name-3", "Sita");
		Object ele=h1.get("Name-3");
		System.out.println(ele);
		h1.putIfAbsent("Name-4", "Bhim");
		System.out.println(h1);
		

	}

}
