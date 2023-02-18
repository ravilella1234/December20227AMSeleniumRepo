package icici.loans.collections;

import java.util.Set;
import java.util.TreeMap;

public class MapDemo 
{

	public static void main(String[] args) 
	{
		TreeMap<Integer, Integer> h = new TreeMap<Integer, Integer>();
		h.put(100, 100);
		h.put(20, 200);
		h.put(3000, 300);
		h.put(10, 400);
		h.put(4, 200);
		h.put(50, 600);
		
		System.out.println(h);
		System.out.println(h.get(10));
		Set<Integer> keys = h.keySet();
		for(Integer k:keys)
		{
			System.out.println(k + "--->"+ h.get(k));
		}
	}
}
