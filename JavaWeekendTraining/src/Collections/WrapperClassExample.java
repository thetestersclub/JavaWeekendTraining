package Collections;

public class WrapperClassExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int var = 10;
		System.out.println(var);
		
		Integer obj = new Integer(var); //wrapping or autoboxing
		System.out.println(obj);
		
		int i = obj; //unwrapping or unboxing

	}

}
