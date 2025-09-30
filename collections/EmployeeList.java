package com.corejava.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

class Employee
{
	private int id;
	private String name;
	private String dept;
	private int salary;
	
	public Employee() 
	{
		
	}
	
	public Employee(int id, String name, String dept, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.salary = salary;
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
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() 
	{
		return id + " " + name + " " + dept + " " + salary;
	}
}

public class EmployeeList {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no.of Employees: ");
		int n = sc.nextInt();
		
		ArrayList<Employee> list = new ArrayList<>();
		
		//LinkedHashSet<Employee> list = new LinkedHashSet<>();
		
		int id = 1000;
		for (int i=0;i<n;i++)
		{
			id += 1;
		
			System.out.println("enter name: ");
			String name = sc.next();
			
			System.out.println("enter dept: ");
			String dept = sc.next();
			
			System.out.println("enter salary: ");
			int salary = sc.nextInt();
			
			Employee emp = new Employee(id,name,dept,salary);
			
			list.add(emp);
		}
		
		for (Employee emp : list)
		{
			System.out.println(emp);
		}
		
		
	}

}
