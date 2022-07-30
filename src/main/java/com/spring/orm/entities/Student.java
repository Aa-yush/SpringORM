package com.spring.orm.entities;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Entity;

import org.hibernate.annotations.DynamicUpdate;

@Entity
@Table(name = "StudentDetails")
public class Student {
	
	@Id
	@Column(name = "StudentId")
	private int studentId;
	@Column(name = "StudentName")
	private String studentName;
	@Column(name = "StudentCity")
	private String studentCity;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int studentId, String studentName, String studentCity) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentCity = studentCity;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentCity() {
		return studentCity;
	}

	public void setStudentCity(String studentCity) {
		this.studentCity = studentCity;
	}
	
	
	

}
