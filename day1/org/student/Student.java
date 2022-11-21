package week3.day1.org.student;

import week3.day1.org.department.Department;

public class Student extends Department {
	
public void studentName() {
		System.out.println("Student Name: Arvind");

	}

public void studentDept() {
	System.out.println("Student Department: ECE");

}

public void studentID() {
	System.out.println("Student ID: 89456");

}


public static void main(String[] args) {
	
	Student std = new Student ();
	std.collegeName();
	std.collegeCode();
	std.collegeRank();
	std.deptName();
	std.studentName();
	std.studentDept();
	std.studentID();
	
	
}

}
