
public class Methods {
	
	//Declaration -> define
	public int add(int num1, int num2) {
		
		int sum = num1+num2;
		
		return sum; //last statement of your method
		
	}
	
public int sub(int num1, int num2) {
		
		int subt = num1-num2;
		
		return subt; //last statement of your method
		
	}

public String concat(String s1, char s2) {
	
	String s3 = s1+s2;
	
	return s3; //last statement of your method
	
}
	public void test() {
		System.out.println("Inside test Method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;//declaration
		a=10; //initialization
		
		Methods obj = new Methods();
		obj.test();
		System.out.println(obj.sub(50, 10));
//		int addition = obj.add(5, 10);
//		System.out.println(addition);
		
		Methods obj2 = new Methods();
		String s4 = obj2.concat("Hi", 'c');
		System.out.println(s4);
		
		System.out.println(obj.add(50, 10));
		
		
		
	}

}
