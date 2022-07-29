package assignment.week3;

public class Students { //Overloading concept

	public void getStudentInfo(int id)//Same method with diff. args
 {
		
	}
	
	public void getStudentInfo(int id , String name)
 {
		
	}

	public void getStudentInfo(String email , long phoneNumber)
 {
		
	}
	
	public static void main(String[] args) {//creating obj and calling methods
	
		Students O=new Students();
		O.getStudentInfo(1768);
		O.getStudentInfo(3456, "Anjana");
		O.getStudentInfo("anjucholan8@gmail.com", 9489830016l);

	}

}
