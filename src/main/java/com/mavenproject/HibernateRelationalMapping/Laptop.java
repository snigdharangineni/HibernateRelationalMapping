package com.mavenproject.HibernateRelationalMapping;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Laptop {
	@Id
	private int lid;
	private String laname;
	
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
		return "Laptop [lid=" + lid + ", laname=" + laname + "]";
	}
	
}
