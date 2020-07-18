package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapInterface2 {

	public static void main(String[] args) {

		Map<Integer, String> map1 = new HashMap<>();
		map1.put(1, "Nitu");
		map1.put(2, "Sudha");
		map1.put(3, "Anand");
		
		// System.out.println(map1.get(2));
		Set<Integer> set =map1.keySet();
		
		for(int key:set)
		{
			System.out.println(map1.get(key));
		}

	}

}
