package Arrays;

public class Array2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] array2d = new int[2][3];
		
		array2d[0][0] = 1;
		array2d[0][1] = 2;
		array2d[0][2] = 3;
		
		array2d[1][0] = 4;
		array2d[1][1] = 5;
		array2d[1][2] = 6;
		
		//System.out.println(array2d[0][2]);
//		System.out.println(array2d.length);
//		System.out.println(array2d[0].length);
		
		for(int i=0;i<array2d.length;i++) {
			for(int j=0;j<array2d[0].length;j++) {
				System.out.println(array2d[i][j]);
			}
		}

	}

}
