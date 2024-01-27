package AccessModifier2;

import AccessModfier1.ClassA;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello");
		ClassA obj = new ClassA();
		obj.add();
		
		//ClassB obj2 = new ClassB(); -> Not accessible as classB has default modifier
		//obj2.sub();

	}

}
