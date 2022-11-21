package week3.day1;

public class Students {
	
	
public void getStudentInfo(int id) {
	
	System.out.println("Student Id: " + id);
		
	}

public void getStudentInfo(int id, String name) {
	System.out.println("Student Id: " +  id  +  "Name: " + name);
	
}


public void getStudentInfo(String email, int phoneNumber) {
	
	System.out.println("Student email: " +  email  +   "PhoneNumber: " + phoneNumber);
	
}


	public static void main(String[] args) {
		
		Students StInfo = new Students ();
		StInfo.getStudentInfo(10);
		StInfo.getStudentInfo(11, "Arvind");
		StInfo.getStudentInfo("arvind@gmail.com", 57845);
		

	}

}
