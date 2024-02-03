package Collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer,String>  map = new HashMap<Integer,String>();
		
		map.put(1011, "English");
		map.put(1012, "Maths");
		map.put(1013, "Science");
		map.put(1014, "History");
		map.put(1015, "English");
		
		System.out.println(map);

		System.out.println(map.size());
		
		System.out.println(map.get(1014));
		
		Set<Integer> keys = map.keySet();
		
		for(Integer keyvalue:keys) {
			System.out.println("keys = "+keyvalue+" Values = "+map.get(keyvalue));
		}
		
		
		Map<String, List<String>> map1 = new HashMap<String, List<String>>();
		
		List<String> subjects = new ArrayList<String>();
		subjects.add("English");
		subjects.add("Maths");
		subjects.add("Historu");
		subjects.add("Science");
		
		map1.put("Himani",subjects);
		map1.put("Stud2", subjects);
		

		
		
	}

}
