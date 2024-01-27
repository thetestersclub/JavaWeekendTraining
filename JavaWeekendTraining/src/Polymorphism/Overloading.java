package Polymorphism;

public class Overloading {
	
	public void add(int a, int b) {
		System.out.println("Add 2 numbers");
	}
	
	public void add(int a, int b,int c) {
		System.out.println("Add 3 numbers");
		
	}
	
	public void performLogin() {
		System.out.println("Authentication");
	}
	
	public void Login(int MobileNum, String password) {
		performLogin();
		
	}
	
     public void Login(String username, String password) {
		
    	 performLogin();
	}
     
     public void sub(int a, int b) {
    	 System.out.println("Add integer numbers");
    	 
     }
     
     public void sub(byte a, byte b) {
    	 System.out.println("Add byte numbers");
    	 
     }
     
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Overloading obj = new Overloading();
		//obj.sub(1, 2);
		byte b1 = 1;
		byte b2 = 2;
		obj.sub(b1, b2);
		
		obj.Login("himnai", "werrere");
		
	}

}
