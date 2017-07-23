package com.ds.Collections;

public class Student implements Comparable<Student> {
	
	String studentName;
	int studentAge;
	
	public Student(String studentName, int studentAge) {
		this.studentName = studentName;
		this.studentAge = studentAge;
	}

	@Override
	public int compareTo(Student student) {
		if (this.studentAge == student.studentAge) {
			return 0;
		} else if (this.studentAge > student.studentAge) {
			return 1;
		} else {
			return -1;
		}
	}
}
