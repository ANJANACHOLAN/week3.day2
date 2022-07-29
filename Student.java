package org.student;

import org.department.Department;

public class Student extends Department{ //Child extends Grandparent

	public void studentName() {//Method3
		
	}
	public void studentDept() {
		
	}
	
	public void studentId() {
		
	}
	
	public static void main(String[] args) {
		
		Student S=new Student();//calling all the methods from base, parent class using multilevel
		S.collegeCode();
		S.collegeName();
		S.collegeRank();
		S.deptName();
		S.studentName();
		S.studentDept();
		S.studentId();

	}

}
