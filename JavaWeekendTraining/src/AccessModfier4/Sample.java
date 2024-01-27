package AccessModfier4;

import AccessModifier3.Test;

public class Sample extends Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Test obj = new Test();
		Sample obj = new Sample();
		System.out.println(obj.publicVar);
		//System.out.println(obj.privateVar); 
		System.out.println(obj.protectedVar);
		//System.out.println(obj.deafultVar);


	}

}
