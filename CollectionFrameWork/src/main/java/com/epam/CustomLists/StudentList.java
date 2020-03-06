package com.epam.CustomLists;

import java.util.ArrayList;

import com.epam.models.Student;

public class StudentList {
	ArrayList<Student> student;
	
	
	public StudentList(int n){
		student = new ArrayList<Student>(n);
	}

	public void indexOf(Student e){
		student.indexOf(e);
	}

	public boolean add(Student e)
	{
		 return student.add(e);
	}
	

	public void add(int i, Student e) {
		student.add(i, e);
	}

	public Student remove(int i){
		return student.remove(i);
	}

	public void remove(Student e){
		student.remove(e);
	}

	public void display() {
		for(int i = 0 ; i < student.size() ; i++) {
			Student stu = student.get(i);
			System.out.println("\n Student " + (i+1)
							+ ": { Name :" + stu.getName() 
							+ ", Class : " + stu.getStandard()
							+ ", Roll No : " + stu.getRollNo()
							+ ", Age : "+stu.getAge()
							+ ", Address : "+stu.getAddress() + " }"
							);
		}
	}
	
	public void size() {
		System.out.println("\nThe Student list size is : " + student.size());
	}
}
