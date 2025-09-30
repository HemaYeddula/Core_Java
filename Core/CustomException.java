package com.Core;

import java.util.Scanner;

class InvalidUserException extends Exception
{
	@override
	public String getMessage()
	{
		return "Invalid card details..Try again";	
	}
}


class ATM 
{
	private int accNo = 1234;
	private int pin = 8541;
	int a;
	int b;
	
	void acceptInput()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter accNo : ");
		a = sc.nextInt();
		System.out.println("Enter pin : ");
		b = sc.nextInt();
	}
	
	void validate() throws Exception
	{
		if (a == accNo && b == pin)
		{
			System.out.println("Collect your cash");
		}
		else
		{
			InvalidUserException iue = new InvalidUserException();
			System.out.println(iue.getMessage());
			throw iue;
		}
	}
}


class Bank
{
	void permit()
	{
		ATM a = new ATM();
		try {
			a.acceptInput();
			a.validate();
		} 
		catch (Exception e) 
		{
			try {
				a.acceptInput();
				a.validate();
			} 
			catch (Exception e1) 
			{
				try {
					a.acceptInput();
					a.validate();
				} 
				catch (Exception e2) 
				{
					System.err.println("Account Blocked");
				}
			}
		}
	}
}


public class CustomException {

	public static void main(String[] args) 
	{
		Bank b = new Bank();
		b.permit();
	}

}
