package com.Core;

import java.util.Scanner;

class UnderAgeException extends Exception
{

	@override
	public String getMessage()
	{
		return "You are too young for the license";
	}
}

class OverAgeException extends Exception
{
	@override
	public String getMessage()
	{
		return "You are too old.. Chill bro..Take rest";
	}
}

class Applicant
{
	private int age;
	void acceptInput()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age: ");
		age = sc.nextInt();	
	}
	void validate()
	{
		if (age >= 18 && age<60)
		{
			System.out.println("Collect your Dl");
		}
		else if (age < 18)
		{
			UnderAgeException uae = new UnderAgeException();
			System.out.println(uae.getMessage());
		}
		else
		{
			OverAgeException oae = new OverAgeException();
			System.out.println(oae.getMessage());
		}
	}
}

class RTO
{
	void permit()
	{
		Applicant a = new Applicant();
		a.acceptInput();
		a.validate();
	}
}

public class CustomException2 {

	public static void main(String[] args) 
	{
		RTO r = new RTO();
		r.permit();

	}

}
