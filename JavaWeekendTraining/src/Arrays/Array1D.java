package Arrays;

public class Array1D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array = new int[5];
		String[] strArray = new String[5];
		int[] array1 = {20,30,50,60,70,80};
		String[] strArray1 = {"red","blue","yellow"};
		
		//System.out.println(array.length);
		
//		array[0] = 10;
//		array[2] = 20;
//		array[4] = 50;
		
//		System.out.println(array[0]);
//		System.out.println(array[1]);
//		System.out.println(array[2]);
//		System.out.println(array[3]);
		
		for(int i=0;i<array.length;i++) {
			array[i] = i*5;
		}
		
//		for(int i=0;i<array.length;i++) {
//			System.out.println(array[i]);
//			
//		}
		
		for(int i:array1) {
			System.out.println(i);
		}
		
		//reverse printing array
//		for(int i=array.length-1;i>=0;i--) {
//			System.out.println(array[i]);
//		}

	}

}
