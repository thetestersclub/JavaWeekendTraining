package practiceConcepts;

public class Student {
	int rollNo;
	String name;
	
	public Student(int rollNo, String name) {
		this.rollNo = rollNo;
		this.name = name;
	}
	
	public int getRollNo(){
		return rollNo;
	}
	
	public String getName(){
		return name;
	}
	
	@Override
	public String toString() {
		return "Student details = "+rollNo+"  "+name;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
