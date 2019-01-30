package com.shiftedtech.java;

import java.util.Objects;

public class Student implements Comparable<Student>{
	private Integer id;
	private String name;
	private String phone;
	private String email;
	
	public Student() {	
	}

	
	
	public Student(Integer id, String name, String phone, String email) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.email = email;
	}



	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	@Override
    public int compareTo(Student student) {
        return  student.getId() - this.getId();
        //return  this.getId() - student.getId();
		//return this.getName().compareToIgnoreCase(student.getName());
    }
	
	@Override
	public boolean equals(Object o) {
	        if (this == o) return true;
	        if (o == null || getClass() != o.getClass()) return false;
	        Student student = (Student) o;
	        return id == student.id;
	}
	
	@Override
	public int hashCode() {
	    return Objects.hash(id);
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", phone=" + phone + ", email=" + email + "]";
	}
	
	
	
}