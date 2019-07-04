package com.cg.order;

public class OrderProcess 
{
	private int rollno;
	private int salary;
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public OrderProcess(int rollno, int salary) {
		super();
		this.rollno = rollno;
		this.salary = salary;
	}
	

}
