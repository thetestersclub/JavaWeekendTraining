
public class SwapNumbers {
	
	public void swapNum(int num1, int num2) {
		System.out.println("initial value of num1 "+num1+"initial value of num2"+num2);
		int temp;
		temp = num1;
		num1 = num2;
		num2 = temp;
		System.out.println("After swapping num1 is "+num1);
		System.out.println("After swapping num2 is "+num2);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SwapNumbers obj = new SwapNumbers();
		obj.swapNum(7, 9);
		

	}

}
