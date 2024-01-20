package Loops;

public class BreaknCont {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//continue -> continue is used to skip a particular condition
//break -> break will terminate the entire loop on a condition
		
		for(int i=0;i<=10;i++) {
//			if(i==6) {
//				break;
//			}
			
			if(i==5 || i==9) {
				continue;
			}
			System.out.println(i);
			
		}
	}

}
