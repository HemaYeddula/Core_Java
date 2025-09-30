package com.Core;

import java.util.Scanner;

abstract class Shape
{
	float area;
	
	abstract public void acceptInput();
	abstract public void calcArea();
	
	public void dispArea()
	{
		System.out.println(area);
	}
}

class Square extends Shape
{

	private float side;
	private Scanner sc;
	@Override
	public void acceptInput() {
		sc = new Scanner(System.in);
		System.out.println("Enter side : ");
		side = sc.nextFloat();
		
	}

	@Override
	public void calcArea() {
		area = side*side;
		
	}
}

class Rectangle extends Shape
{

	private float length;
	private float breadth;
	private Scanner sc;
	@Override
	public void acceptInput() {
		sc = new Scanner(System.in);
		System.out.println("Enter length : ");
		length = sc.nextFloat();
		System.out.println("Enter breadth : ");
		breadth = sc.nextFloat();
		
	}

	@Override
	public void calcArea() {
		area = length*breadth;
		
	}
}

class Circle extends Shape
{

	private float radius;
	private Scanner sc;
	@Override
	public void acceptInput() {
		sc = new Scanner(System.in);
		System.out.println("Enter radius : ");
		radius = sc.nextFloat();
		
	}

	@Override
	public void calcArea() {
		area = 3.141f*radius*radius;
		
	}
}

class Geometry
{
	static void print(Shape ref)
	{
		ref.acceptInput();
		ref.calcArea();
		ref.dispArea();
	}
}

public class Abstraction {

	public static void main(String args[])
	{
		Square s = new Square();
		Rectangle r = new Rectangle();
		Circle c = new Circle();
		
		Geometry.print(s);
		Geometry.print(r);
		Geometry.print(c);
	}
}
