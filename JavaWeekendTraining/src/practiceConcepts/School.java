package practiceConcepts;

import java.util.ArrayList;
import java.util.List;

public class School {
	
	public static List<Student> createStudentList(int[] rollNo, String[] names){
		List<Student> studentlist = new ArrayList<Student>();
		for(int i=0;i<names.length;i++) {
			studentlist.add(new Student(rollNo[i],names[i]));
		}
		return studentlist;
			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names = {"himani","bob","randomname"};
		int[] rollNo = {1,2,3};
		
		List<Student> studlist=new ArrayList<Student>();
		
		for(int i=0;i<names.length;i++) {
			studlist.add(new Student(rollNo[i],names[i]));
		}
//		for(int i=1;i<=n;i++) {
//			Student obj = new Student(i);
//			studlist.add(obj);
//		}
		
		for(Student itr:studlist) {
//            System.out.println(itr.getRollNo());
//            System.out.println(itr.getName());
            
			System.out.println(itr);
		}
		
		

	}

}
