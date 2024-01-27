package Polymorphism;

public class HDFC extends RBI{

	
	public double getHomeLoanInt() {
		System.out.println("this is HDFC int");
		return 9.5;
	}
	@Override
   public int add(int a,int b, int c) {
	return c;
		
	}
	
	public HDFC getObject() {
		HDFC obj = new HDFC();
		return obj;
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HDFC obj = new HDFC();
		System.out.println(obj.getHomeLoanInt());
		
		

	}

}
