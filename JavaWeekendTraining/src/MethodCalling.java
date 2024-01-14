
public class MethodCalling {
	
	//non static methods -> can call static methods
	public void show1() {
		System.out.println("Inside Show 1");
		show2();
	}
	
	public void show2() {
		System.out.println("Inside Show 2");
		show3();
	}
	
	public void show3() {
		System.out.println("Inside Show 3");
	}
	
	//static methods cannot call non static methods
	public static void statMethod() {
		System.out.println("Inside stat method");
	}

	public void main(String[] args) {
		// TODO Auto-generated method stub
		MethodCalling obj = new MethodCalling();
		obj.show1();
		
		statMethod();
		obj.show3();
		obj.show2();

	}

}
