package Collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> set = new HashSet<String>();
		
		set.add("Hi");
		set.add("Himani");
		set.add("How are you");
		set.add("Hows the weekend");
		
		System.out.println(set);
		
//		for(String itr:set) {
//			System.out.println(itr);
//		}
		
		Iterator<String> itr = set.iterator();
		while(itr.hasNext()) {
			String var = itr.next();
			if(var.contains("i")) {
				System.out.println(var);
			}
			
		}
		
		

	}

}
