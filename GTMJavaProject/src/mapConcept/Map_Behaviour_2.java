package mapConcept;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Map_Behaviour_2 {

	public static void main(String[] args) 
	{
		Map<String,Character> m1=new HashMap<String,Character>();
		m1.put("Student-1", 'f');
		m1.put("Student-2", 'm');
		m1.put("Student-3", 'f');
		m1.put("Student-4", 'f');
		m1.put("Student-5", 'm');
		System.out.println(m1);
		
		Set<String> k=m1.keySet();
		System.out.println("Fetching all  keys:");
		for(String key:m1.keySet())
		{
			System.out.println(key);
		}
		
		Collection<Character> v=m1.values();
		System.out.println("Fetching all values:");
		for(Character v1:m1.values())
		{
			System.out.println(v1);
		}
		
		Set<Entry<String,Character>> kv=m1.entrySet();
		Iterator<Entry<String,Character>> i1=kv.iterator();
		System.out.println("Fetching all keys and values:");
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}

	}

}
