package AccessModifier3;

public class Test {
	
	public int publicVar = 10;
	private int privateVar = 20;
	protected int protectedVar = 30;
	int deafultVar = 40;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Test obj = new Test();
		System.out.println(obj.publicVar);
		System.out.println(obj.privateVar);
		System.out.println(obj.protectedVar);
		System.out.println(obj.deafultVar);
		

	}

}
