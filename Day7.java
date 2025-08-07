/*
*Day-7 Assignment Questions:*

1. Write a program to implement bank functionality in the above scenario. Note: Create few classes namely Customer, Account, RBI (Base Class) and few derived classes (SBI, ICICI, PNB etc). Assume and implement required member variables and methods in each class.
Hint:
class Customer
{
//Personal Details ...
// Few functions ...
}
class Account
{
// Account Detail ...
// Few functions ...
}
abstract class RBI
{
Customer c; //hasA relationship
Account a; //hasA relationship
..
public abstract double getInterestRate();
public abstract double getWithdrawalLimit();
}
class SBI extends RBI
{
//Use RBI functionality or define own functionality.
}
class ICICI extends RBI
{
//Use RBI functionality or define own functionality.
}

2. Design a Payment Gateway System using an interface named PaymentMethod with a method pay(double amount). Implement this interface in different classes like CreditCardPayment, DebitCardPayment, and UPIPayment. Write a main class where you can accept payment using different methods.
‌
3. Create a Java application to manage employees in a company. Define an abstract class Employee with a method calculateSalary(). Then create two subclasses FullTimeEmployee and PartTimeEmployee that override calculateSalary() method based on their working type. Demonstrate runtime polymorphism by calling calculateSalary() on different types of employees using the Employee reference.
‌
4. Create a Java application to manage employees in a company. Define an Interface Employee with a method calculateSalary(). Then create two subclasses FullTimeEmployee and PartTimeEmployee that override calculateSalary() method based on their working type. Demonstrate runtime polymorphism by calling calculateSalary() on different types of employees using the Employee reference.
‌
5. Develop a Java application for a Ticket Booking System that allows users to book tickets for different types of transportation modes such as Bus, Train, and Flight.
Define a common interface or abstract class`Ticket with a method`bookTicket() that each transportation mode must implement differently.
Create classes`BusTicket,`TrainTicket, and`FlightTicket that extend the abstract class or implement the interface.
Demonstrate runtime polymorphism by calling the`bookTicket() method using a reference of the base class/interface.
*/
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

import java.util.*;
public class Day7
{
	public static void main(String[]args)
	{
	}
}

/*
1. Write a program to implement bank functionality in the above scenario. Note: Create few classes namely Customer, Account, RBI (Base Class) and few derived classes (SBI, ICICI, PNB etc). Assume and implement required member variables and methods in each class.
Hint:
class Customer
{
//Personal Details ...
// Few functions ...
}
class Account
{
// Account Detail ...
// Few functions ...
}
abstract class RBI
{
Customer c; //hasA relationship
Account a; //hasA relationship
..
public abstract double getInterestRate();
public abstract double getWithdrawalLimit();
}
class SBI extends RBI
{
//Use RBI functionality or define own functionality.
}
class ICICI extends RBI
{
//Use RBI functionality or define own functionality.
}
*/

class Customer
{
	private String customerName;
	private String customerDob;
	private String customerAddress;
	private String customerEmail;
	private long customerPhno;

	public void setName(String name)
	{
		this.customerName = name;
		return;
	}
	public String getName()
	{
		return this.customerName;
	}

	public void setDob(String dob)
	{
		this.customerDob = dob;
		return;
	}
	public String getDob()
	{
		return this.customerDob;
	}

	public void setAddress(String address)
	{
		this.customerAddress = address;
		return;
	}
	public String getAddress()
	{
		return this.customerAddress;
	}

	public void setEmail(String email)
	{
		this.customerEmail = email;
		return;
	}
	public String getEmail()
	{
		return this.customerEmail;
	}

	public void setPhno(long phno)
	{
		this.customerPhno = phno;
		return;
	}
	public long getPhno()
	{
		return this.customerPhno;
	}

	public void displayCustomerDetails()
	{
		System.out.println("Customer Name: "+this.customerName);
		System.out.println("Customer DOB: "+this.customerDob);
		System.out.println("Customer Address: "+this.customerAddress);
		System.out.println("Customer Email: "+this.customerEmail);
		System.out.println("Customer PhoneNo: "+this.customerPhno);
	}
}

class Account 
{
	private String accounType;
	private long accountNo;
	private double balance;

	public void setAccounType(String type)
	{
		this.accounType = type; 
	}
	public String getAccounType()
	{
		return this.accounType;
	}

	public void setAccountNo(long accNo)
	{
		this.accountNo = accNo;
	}
	public long getAccountNo()
	{
		return this.accountNo;
	}

	public void setBalance(double balance)
	{
		this.balance = balance;
	}
	public Double getBalance()
	{
		return this.balance;
	}
	
	public void displayAccountDetails()
	{
		System.out.println("Customer AccountType: " + this.accounType);
		System.out.println("Customer AccountNo: " + this.accountNo);
		System.out.println("Customer Balance: "+this.balance);
	}
}

abstract class RBI
{
	Customer cust;
	Account acc;

	public abstract double getInterestRate();
	public abstract double getWithdrawalLimit();		
}

class SBI extends RBI
{
	public double getInterestRate()
	{
		return 2.50;
	}

	public double getWithdrawalLimit()
	{
		return 100000;
	}
}

class ICICI extends RBI
{
	public double getInterestRate()
	{
		return 3.00;
	}

	public double getWithdrawalLimit()
	{
		return 50000;
	}
}

class PNB extends RBI
{
	public double getInterestRate()
	{
		return 3.50;
	}

	public double getWithdrawalLimit()
	{
		return 60000;
	}
}

class BankAccount
{
	public static void main(String[]args)
	{
		Scanner java = new Scanner(System.in);
		RBI bankacc = null;
		long min = 11111111, max = 99999999;
		System.out.println("================BANK FUNCTIONALITY=================\n");
		boolean chosen = true;
		while(chosen)
		{
			System.out.println("Choose the bank to see details: \n1. SBI \n2. ICICI \n3. PNB");
			System.out.println("4. Create Account for the selected bank \n5.To Exit...");
			int option = java.nextInt();		
			java.nextLine();
			
			switch(option)
			{
				case 1:
					bankacc = new SBI();
					System.out.println("\nInterest rate on SBI: "+bankacc.getInterestRate());
					System.out.println("Withdrawal Limit per day: "+bankacc.getWithdrawalLimit()+"\n\n");
					break;

				case 2:
					bankacc = new ICICI();
					System.out.println("\nInterest rate on ICICI: "+bankacc.getInterestRate());
					System.out.println("Withdrawal Limit per day: "+bankacc.getWithdrawalLimit()+"\n\n");
					break;

				case 3:
					bankacc = new PNB();
					System.out.println("\nInterest rate on PNB: "+bankacc.getInterestRate());
					System.out.println("Withdrawal Limit per day: "+bankacc.getWithdrawalLimit()+"\n\n");
					break;

				case 4:
					System.out.println("............You chosen the bank............");
					System.out.println("....Let's move to setting up the details....");
					chosen = false;
					break;

				case 5:
					System.out.println("------Thanking You------");
					return;

				default:
					System.out.println("Enter the valid option!!!");
			}
		}

		bankacc.cust = new Customer();
		bankacc.acc = new Account();

		System.out.println("Enter the customer name: ");
		bankacc.cust.setName(java.nextLine());	

		System.out.println("Enter the customer date of birth: ");
		bankacc.cust.setDob(java.nextLine());

		System.out.println("Enter the customer address: ");
		bankacc.cust.setAddress(java.nextLine());

		System.out.println("Enter the customer email: ");
		bankacc.cust.setEmail(java.nextLine());

		System.out.println("Enter the customer contact number: ");
		bankacc.cust.setPhno(java.nextLong());
		java.nextLine();

		System.out.println("Account Type: ");
		bankacc.acc.setAccounType(java.nextLine());

		bankacc.acc.setAccountNo(min + (long)(Math.random()*((max - min)+1)));

		System.out.println("Balance: ");
		bankacc.acc.setBalance(java.nextDouble());

		System.out.println("\n\n---------------ACCOUNT DETAILS----------------");

		bankacc.cust.displayCustomerDetails();
		bankacc.acc.displayAccountDetails();
		
		System.out.println("\n\n----------------Thanking You------------------");
	}
}

//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

/*
2. Design a Payment Gateway System using an interface named PaymentMethod with a method pay(double amount). Implement this interface in different classes like CreditCardPayment, DebitCardPayment, and UPIPayment. Write a main class where you can accept payment using different methods.
*/


interface PaymentMethod         			//Functional Interfaces - Inteface that contains only one method...                                                 
{
	default void pay(double amount)
	{
		System.out.println("The amount "+ amount + " paid successfully....");	
	}
}

class CreditCardPayment implements PaymentMethod
{
	public void pay(double amount)
	{
		System.out.println("Payment Mode: Credit Card");
		System.out.println("The amount "+ amount + " paid successfully....");
		return;
	}
}
class DebitCardPayment implements PaymentMethod
{
	public void pay(double amount)
	{
		System.out.println("Payment Mode: Debit Card");
		System.out.println("The amount "+ amount + " paid successfully....");
		return;
	}
}
class UPIPayment implements PaymentMethod
{
	public void pay(double amount)
	{
		System.out.println("Payment Mode: UPI");
		System.out.println("The amount "+ amount + " paid successfully....");
		return;
	}
}

class PaymentMode
{
	public static void main(String[]args)
	{
		Scanner java = new Scanner(System.in);
		System.out.println("\n.................PAYMENT GATEWAY SYSTEM...............\n");
		System.out.println("Enter the amount to pay: ");
		double amt = java.nextDouble();
		System.out.println("\nEnter the payment mode: ");
		System.out.println("1. Credit Card \n2. Debit Card \n3. UPI");

		mode:
		while(true)
		{
			switch(java.nextInt())
			{
				case 1:
					CreditCardPayment cp = new CreditCardPayment();
					cp.pay(amt);
					break mode;

				case 2:
					DebitCardPayment dp = new DebitCardPayment();
					dp.pay(amt);
					pay = false;
					break mode;

				case 3:
					UPIPayment up = new UPIPayment();
					up.pay(amt);
					pay = false;
					break mode;

				default: 
					System.out.println("Enter the option correctly!!!.....");		
			}
		}
		System.out.println("\n..........................................................");
	}
}

//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

/*
3. Create a Java application to manage employees in a company. Define an abstract class Employee with a method calculateSalary(). Then create two subclasses FullTimeEmployee and PartTimeEmployee that override calculateSalary() method based on their working type. Demonstrate runtime polymorphism by calling calculateSalary() on different types of employees using the Employee reference. */

abstract class Employee
{
	public abstract double calculateSalary(int days);
}
class FullTimeEmployee extends Employee
{
	public double calculateSalary(int days)
	{
		return days*1500;
	}
}
class PartTimeEmployee extends Employee
{
	public double calculateSalary(int days)
	{
		return days*600;
	}
}

class Salary
{
	public static void main(String[]args)
	{
		Employee e = null;
		Scanner java = new Scanner(System.in);
		System.out.println("Enter the number of working days of the Employee: ");
		int days = java.nextInt();
		System.out.println("Enter the type of Employement: \n1. FullTime Employment \n2. PartTime Employment");
		switch(java.nextInt())
		case 1:
			e = new FullTimeEmployee();
			System.out.println("Salary Credited: "+e.calculateSalary(int days));
			break;

		case 2:
			e = new PartTimeEmployee();
			System.out.println("Salary Credited: "+e.calculateSalary(int days));
			break;
	}
}

//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

/* 4. Create a Java application to manage employees in a company. Define an Interface Employee with a method calculateSalary(). Then create two subclasses FullTimeEmployee and PartTimeEmployee that override calculateSalary() method based on their working type. Demonstrate runtime polymorphism by calling calculateSalary() on different types of employees using the Employee reference. */

interface Employee
{
	public double calculateSalary(int days);
}

class FullTimeEmployee implements Employee
{
	public double calculateSalary(int days)
	{
		return days*1500;
	}
}
class PartTimeEmployee implements Employee
{
	public double calculateSalary(int days)
	{
		return days*600;
	}
}

class SalaryCalculation
{
	public static void main(String[]args)
	{
		Scanner java = new Scanner(System.in);
		Employee e = null;
		System.out.println("Enter the number of working days of the Employee: ");
		int days = java.nextInt();
		System.out.println("Enter the type of Employement: \n1. FullTime Employment \n2. PartTime Employment");
		switch(java.nextInt())
		{
			case 1:
				e = new FullTimeEmployee();
				System.out.println("Salary Credited: "+e.calculateSalary(days));
				break;

			case 2:
				e = new PartTimeEmployee();
				System.out.println("Salary Credited: "+e.calculateSalary(days));
				break;
		}
	}
}

//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

/*5. Develop a Java application for a Ticket Booking System that allows users to book tickets for different types of transportation modes such as Bus, Train, and Flight.
Define a common interface or abstract class`Ticket with a method`bookTicket() that each transportation mode must implement differently.
Create classes`BusTicket,`TrainTicket, and`FlightTicket that extend the abstract class or implement the interface.
Demonstrate runtime polymorphism by calling the`bookTicket() method using a reference of the base class/interface.
*/

























