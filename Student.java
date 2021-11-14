package org.student;

import org.department.Department;

public class Student extends Department {
	
		public void studentName(){
		System.out.println("Student Name: ChandraPrakash");
	}
	
	public void studentDept(){
		System.out.println("Student Deportment: E&I");
	}
	
	public void studentId(){
		System.out.println("Student ID: 102387578");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student stu=new Student();
		stu.studentDept();
		stu.studentId();
		stu.studentName();
		
		stu.deptName();
		
		stu.collegeCode();
		stu.collegeName();
		stu.collegeRank();
	}

}
