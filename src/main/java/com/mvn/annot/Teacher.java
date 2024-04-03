package com.mvn.annot;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name = "teacher")
@Entity
public class Teacher {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "TEACHER_ID")
	private int teacher_id;
	
	@Column(name = "TEACHER_NAME")
	private String teacher_name;
	
	@Column(name = "TEACHER_AGE")
	private int teacher_age;

	public int getTeacher_id() {
		return teacher_id;
	}

	public void setTeacher_id(int teacher_id) {
		this.teacher_id = teacher_id;
	}

	public String getTeacher_name() {
		return teacher_name;
	}

	public void setTeacher_name(String teacher_name) {
		this.teacher_name = teacher_name;
	}

	public int getTeacher_age() {
		return teacher_age;
	}

	public void setTeacher_age(int teacher_age) {
		this.teacher_age = teacher_age;
	}

	public Teacher(int teacher_id, String teacher_name, int teacher_age) {
		super();
		this.teacher_id = teacher_id;
		this.teacher_name = teacher_name;
		this.teacher_age = teacher_age;
	}

	public Teacher() {
		super();
	}

}
