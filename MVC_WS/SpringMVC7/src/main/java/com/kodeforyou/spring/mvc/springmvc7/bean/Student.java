package com.kodeforyou.spring.mvc.springmvc7.bean;
public class Student {
	private int rollNum;
	private String name;
	private double fees;

	public String toString() {
		return "rollNum:" + rollNum + ",name:" + name + ",fees:" + fees;

	}

	public Student() {

	}

	public Student(int rollNum, String name, double fees) {
		this.rollNum = rollNum;
		this.name = name;
		this.fees = fees;
	}

	public int getRollNum() {
		return rollNum;
	}

	public void setRollNum(int rollNum) {
		this.rollNum = rollNum;
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
}
