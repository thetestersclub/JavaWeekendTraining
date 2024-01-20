package Exceptions;

public class uncaughtexceptions {
	
	public void exception() throws Exception {
		System.out.println("inside exception");
		throw new Exception("My designed exception has occurred");
	}

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		
		uncaughtexceptions obj = new uncaughtexceptions();
		obj.exception();
		//throw new Exception("My designed exception has occurred");

	}

}
