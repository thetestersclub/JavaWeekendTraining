package AccessModifier3;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test obj = new Test();
		System.out.println(obj.publicVar);
		//System.out.println(obj.privateVar);// -> private variables can be accessed only inside its own class
		System.out.println(obj.protectedVar);
		System.out.println(obj.deafultVar);
	}

}
