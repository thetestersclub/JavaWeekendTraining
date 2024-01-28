package Constructors;

public class Students {
	
	//Constructors should have name same as the class name
	//Types of Constructors: 
	/*
	 * default constructor
	 * no-arg constructor
	 * parameterized const
	 */
	
	
	public Students() {
		System.out.println("Inside constructor");
		
	}
	public Students(int a) {
		System.out.println("Inside constructor2");
		
	}
	
	String Studentname;
	int rollNum;
	
	public Students(String Studentname, int rollNum ) {
//		new Students();	// constructor chaining 
		this();
		this.Studentname = Studentname;
		this.rollNum = rollNum;
		System.out.println("inside para cons");
	}
	
//	public void Students(String Studentname, int rollNum ) {
//		this.Studentname = Studentname;
//		this.rollNum = rollNum;
//		System.out.println("inside para cons");
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Students obj = new Students("Himnai", 56);
		//obj.Students("Himnai", 56);
		System.out.println(obj.Studentname);
		System.out.println(obj.rollNum);
	
		//new Students("Himani",56);

	}

}
