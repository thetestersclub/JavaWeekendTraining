package Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList list = new ArrayList();
		System.out.println(list);
		System.out.println(list.size());
		
		list.add(10);
		list.add("Himani");
		list.add(10.34);
		list.add('c');
		list.add(true);
		list.add(null);
		list.add("Himani");
		
		System.out.println(list);
		
		int var = (Integer)list.get(0);
	    System.out.println(20+var);
		
		System.out.println(list.size());
		
		System.out.println(list.get(0));
		System.out.println(list.get(list.size()-1));
		System.out.println(list.get(6));
		//System.out.println(list.get(7));
		
//		list.remove(6);
//		System.out.println(list);
//		System.out.println(list.size());
		
//		for(int i=0;i<list.size();i++) {
//			System.out.println(list.get(i));
//		}
//		
		
//		for(Object index:list) {
//			System.out.println(index);
//		}
		
//		Iterator itr = list.iterator();
//		
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//			
//		}
//		


	

	}

}
