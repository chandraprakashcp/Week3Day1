package week3.day1;

public class Students {
	//passing id argument alone
	public void getStudentInfo(int id) {
		
		
		System.out.println("The ID of the student : "+id);
	}
	//passing argument by id & name
	public void getStudentInfo(int id,String name) {
		
		
		System.out.println("The ID of the student "+id+" and his name is "+name);
	}
	//passing argument  by email & phoneNumber
	public void getStudentInfo(String email,int phoneNumber) {
		
		
		System.out.println("The email Id of the student "+email+" and his phoneNumber is :"+phoneNumber);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Students stu = new Students();

		stu.getStudentInfo(11234);
		stu.getStudentInfo(11234, "ChandraPrakash");
		stu.getStudentInfo("prakashccp@gmail.com", 12345678);
	}

}
