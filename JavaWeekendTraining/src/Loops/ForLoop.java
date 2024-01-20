package Loops;

public class ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//while - when the number of interations are unknown
		//for - when interations are known
		//do while - it gets executed atleast once irrespective of the condition
		int i;
		
		for(i=0;i<=10;i++) {
			System.out.println(i);
			for(int j=0;j<=i;j++) {
				System.out.println("inside j");
				for(int k=0;k<=j;k++)
				{
					System.out.println("Inside k");
				}
			}
		}
		
		System.out.println(i);

	}

}
