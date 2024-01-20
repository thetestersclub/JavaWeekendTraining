package Exceptions;

public class Exceptions {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		System.out.println("Start of Script");
		try {
			System.out.println(10/0);
		}catch(Throwable t) {
			System.out.println("Exception occured");
			System.out.println(t.getMessage());
			t.printStackTrace();
		}
		
		
		
		
		System.out.println("End of Script");
		
		Thread.sleep(1000);
//		Thread.sleep(1000);
//		Thread.sleep(1000);
//		Thread.sleep(1000);
//		Thread.sleep(1000);
		System.out.println("Final End of Script");

	}

}
