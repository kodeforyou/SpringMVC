package com.kodeforyou.spring.mvc.pdfviewresolverapp.bean;
public class Student {
	private int id;
	private String name;
	private double fees;

	public Student() {
		
	}
	public Student(int id, String name, double fees) {
		super();
		this.id = id;
		this.name = name;
		this.fees = fees;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getFees() {
		return fees;
	}

	public void setFees(double fees) {
		this.fees = fees;
	}

	@Override
	public String toString() {
		
		return "id:"+id+",name:"+name+",fees:"+fees;
	}

}
