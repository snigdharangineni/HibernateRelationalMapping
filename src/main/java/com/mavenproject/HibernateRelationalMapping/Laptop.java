package com.mavenproject.HibernateRelationalMapping;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;

@Entity
public class Laptop {
	@Id
	private int lid;
	private String laname;
	@ManyToMany
	private List<Student> student = new ArrayList<>();
	
	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	public String getLaname() {
		return laname;
	}
	public void setLaname(String laname) {
		this.laname = laname;
	}
	@Override
	public String toString() {
		return "Laptop [lid=" + lid + ", laname=" + laname + ", student=" + student + "]";
	}
	public List<Student> getStudent() {
		return student;
	}
	public void setStudent(List<Student> student) {
		this.student = student;
	}
	
}
