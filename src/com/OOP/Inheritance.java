package com.OOP;

import java.util.Arrays;

/*
 * Inheritance - Main class have some common functionalities 
 * and child class have special functionalities with using extends keyword in derived class.
 * 
 * Protected access specifier - using this we can directly taken instance variable in 'derived' class from 'super' class.
 * 
 * In private access specifier we have to use getter/setter methods to invoke instance variable in 'derived' class from 'super' class.
 * */

class Employee implements Comparable<Employee> { // Base class, super class, parent class

	private String name;
	private double salary;

	public Employee(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void raisedSalary(double percent) {
		salary += salary * percent / 100;
	}

	void displayInfo() {
		System.out.println("Employee Name " + name + " salary " + salary);
	}

	public boolean equals(Object obj) {

		if (this == obj)
			return true;

		if (this == null)
			return false;

		if (this.getClass() != obj.getClass())
			return false;

		Employee e = (Employee) obj;
		return this.getName().equals(e.getName()) && this.getSalary() == e.getSalary();
	}

	@Override
	public int compareTo(Employee o) {
		if(this.salary < o.salary)
			return -1;
		if(this.salary == o.salary)
			return 0;
		return 1;
	}

}

class Manager extends Employee { // Derived class, Sub class, child class

	private double bonus;

	public Manager(String name, double salary, double bonus) {
		super(name, salary);
		bonus = this.bonus;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	public double getSalary() { // Method Overriding
		return super.getSalary() + bonus;
	}

	void printLine() {
		System.out.println("-------------------------------------");
	}

	void displayInfo() {
		super.displayInfo();
		System.out.println("Mgr Bonus " + bonus);
	}
}

public class Inheritance {

	public static void main(String[] args) {

		Employee e1 = new Employee("Veera", 17000);
		System.out.println(e1.getSalary());
		// e1.setSalary(12500);
		// e1.raisedSalary(10);
		System.out.println(e1.getSalary());

		Employee e3 = new Employee("Veera", 17000);

		System.out.println(" object = cosmic super class " + e1.equals(e3));

		// e1.displayInfo();

		Manager mgr = new Manager("Ram", 45000.0, 10.0);
		System.out.println(mgr.getSalary());
		mgr.setBonus(5500);
		System.out.println(mgr.getSalary());
		mgr.raisedSalary(50000);
		System.out.println(mgr.getSalary());

		mgr.displayInfo();

		Employee e2 = new Manager("Veeravel", 33300.0, 0); // employee is a manager possible //Polymorphism
		// Manager m2 = new Employee(null, 0); //not all employees are manager

		Employee[] employees = new Employee[5];
		employees[0] = new Employee("Vee", 2020);
		employees[1] = new Employee("sak", 300);
		employees[2] = new Employee("Vel", 100);
		employees[3] = mgr;
		employees[4] = new Employee("Sabari", 600);

		employees[3].setSalary(987654);

		Manager m1;
		if (employees[3] instanceof Manager) { // here we're doing 'type casting'
			m1 = (Manager) employees[3];
			m1.setBonus(12345);
		}

		Manager m2;
		if (employees[2] instanceof Manager) {
			m2 = (Manager) employees[2];
			m2.setBonus(90909090);// nothing will change to this code becoz employees[2] is Base class object
		}

		for (Employee e : employees) {
			System.out.println(e.getName() + "  " + e.getSalary()); // Dynamic binding - behavior based object reference
		}
		
		Arrays.sort(employees);
		
		for (Employee e : employees) {
			System.out.println(e.getName() + "  " + e.getSalary()); // Dynamic binding - behavior based object reference
		}

	}

}
