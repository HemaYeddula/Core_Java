package com.corejava.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.TreeSet;

class Employee1 implements Comparable<Employee1>
{
	private int id;
	private String name;
	private String dept;
	private int salary;
	
	public Employee1() 
	{
		
	}
	
	public Employee1(int id, String name, String dept, int salary) {
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

	@Override
	public int compareTo(Employee1 e2) 
	{
		// Comparing the salaries
		Employee1 e1 = this;
		
		int sal1 = e1.salary;
		int sal2 = e2.salary;
		
		String name1 = e1.name;
		String name2 = e2.name;
		
		if (sal1 != sal2)
		{
			return sal1 - sal2;
			// for descending order
			// return sal2 - sal1;
		}
		else if (name1.compareTo(name2) != 0)
		{
			return name1.compareTo(name2);
			
			// for descending order
			// return name2.compareTo(name1);
			// or return name1.compareTo(name2) * -1;
		}
		else
		{
			return e1.id - e2.id;
		}
	}
}

public class EmployeeComparable {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no.of Employees: ");
		int n = sc.nextInt();
		
		ArrayList<Employee1> list = new ArrayList<>();
		
		//LinkedHashSet<Employee> list = new LinkedHashSet<>();
		
		// see the program ComparatorExample
		
		//MyCompare1 compare1 = new MyCompare1();
		
		MyCompare2 compare2 = new MyCompare2();
		
		//TreeSet<Employee1> list = new TreeSet<Employee1>(compare2);
		
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
			
			Employee1 emp = new Employee1(id,name,dept,salary);
			
			list.add(emp);
		}
		System.out.println(list);
		
		System.out.println("\nAfter Sorting...\n");
		Collections.sort(list);
		
		for (Employee1 emp : list)
		{
			System.out.println(emp);
		}
		
		System.out.println("\nAfter Customised Sorting...\n");
		Collections.sort(list,compare2);
		
		for (Employee1 emp : list)
		{
			System.out.println(emp);
		}
	}

}
