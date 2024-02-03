package Collections;

import java.util.ArrayList;
import java.util.List;

public class GenericsArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list = new ArrayList<String>();
		
		list.add("Himani");
		list.add("Hi");
		
		String i = list.get(1);
		System.out.println(i+10);
		
		list.size();
		

	}

}
