package com.hospital;

//case study

class Doc extends Salary {
	String name;
	int id;

	public Doc(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}

	@Override
	public String toString() {
		return "Doc [name=" + name + ", id=" + id + "]";
	}

	@Override
	void salary(int salary) {
		System.out.println(salary);

	}

	@Override
	void salary(int salary, int tax) {
		// TODO Auto-generated method stub

	}
}

class Nurse extends Salary {
	String name;
	int id;

	public Nurse(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}

	@Override
	public String toString() {
		return "Nurse [name=" + name + ", id=" + id + "]";
	}

	@Override
	void salary(int salary) {
		// TODO Auto-generated method stub

	}

	@Override
	void salary(int salary, int tax) {
		System.out.println(salary - tax);

	}
}

abstract class Salary {
	abstract void salary(int salary);

	abstract void salary(int salary, int tax);
}

public class Hospital {
	public static void main(String[] args) {
		Doc doc = new Doc("Doc1", 01);
		System.out.println(doc);
		doc.salary(90000);

		Nurse nurse = new Nurse("Nurse 1", 02);
		System.out.println(nurse);
		nurse.salary(25000, 5000);

	}
}
