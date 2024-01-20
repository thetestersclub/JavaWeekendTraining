package Exceptions;

public class FinallyBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int x = 100;
		//x=90;

		try {
			//Db connection
			//executes DB queries
			//validationg some data
			//closing DB connection
			System.out.println("inide try block");
			System.out.println(10/0);
		}catch(Exception e) {
			System.out.println("Exception occured");
		}finally {
			//close DB connection
			System.out.println("closed connection");
		}
			System.out.println("DB connection");
	}

}

