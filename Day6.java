/*
*Day-6 Assignment Questions:*
1. Illustrate the concept-Encapsulation with the Payment Gateway System.[The class should encapsulate private data members such as transaction ID, payer name, payee name, amount, payment method, and transaction status. Provide appropriate public getter and setter methods to access and modify these details securely. Also include a method to display the transaction summary.]
‌
2. Create a Java application that demonstrates the use of user-defined packages by organising classes based on their functionality:
--- arithmetic: This package should include a class that defines methods to perform the following operations on two numbers:
a. Addition
b. Subtraction
c. Multiplication
d. Division
e. Modulo
--- stringutils: This package should include a class that defines methods for:
a. Concatenating two strings
b. Reversing a string
c. Finding the length of a string
In your main class (outside those packages), import the above packages and demonstrate the usage of all the methods.
‌
3. Design a class `Employee` with private data members: employee ID, name, designation, department, and monthly salary. Use proper getter and setter methods to access and update these fields. Add a method to calculate and return the annual salary of the employee.
‌
4. Design a travel booking system using two packages:
`travel.booking` – includes a class `Ticket` with ticket ID, destination, and fare.
`travel.user` – includes a class `User` with user details and a method to book a ticket.
Illustrate accessing ticket data from within the user class.
‌
5. Design a class named `BankAccount` that uses the concept of encapsulation. The class should have the following private data members: account number, account holder name, and balance. Provide public getter and setter methods to access and modify these fields. Also, include a method to deposit and withdraw amount ensuring that the balance cannot go negative.
*/

//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
import java.util.*;
public class Day6
{
	public static void main(String[]args)
	{
	}
}

/*
1. Illustrate the concept-Encapsulation with the Payment Gateway System.[The class should encapsulate private data members such as transaction ID, payer name, payee name, amount, payment method, and transaction status. Provide appropriate public getter and setter methods to access and modify these details securely. Also include a method to display the transaction summary.
*/
class PaymentGateway
{
	private int transactionId;
	private String payerName;
	private String payeeName;
	private double amount;
	private String paymentMethod;
	private String transactionStatus;

	public void setTransactionId(int id)
	{
		this.transactionId = id;
	}

	public void setPayerName(String payerName)
	{
		this.payerName = payerName;
	}

	public void setPayeeName(String payeeName)
	{
		this.payeeName = payeeName;
	}
	
	public void setAmount(double amount)
	{
		this.amount = amount;
	}

	public void setPaymentMethod(String payMethod)
	{
		this.paymentMethod = payMethod;
	}

	public void setStatus(String status)
	{
		this.transactionStatus = status;
	}

	public int getTransactionId()
	{
		return transactionId;
	}
	
	public String getPayerName()
	{
		return this.payerName;
	}

	public String getPayeeName()
	{
		return this.payeeName;
	}

	public String getAmount()
	{
		return this.amount;
	}

	public String getPaymentMethod()
	{
		return this.paymentMethod;
	}
	
	public String getStatus()
	{
		return this.transactionStatus;
	}

	public void transactionSummary()
	{
		System.out.println("--------------------------Transaction History----------------------");
		System.out.println("Transaction_Id: "+getTransactionId());
		System.out.println("Payer_Name: "+getPayerName());
		System.out.println("Payee_Name: "+getPayeeName());
		System.out.println("Amount: "+getAmount());
		System.out.println("Payment_Method: "+getPaymentMethod());
		System.out.println("Transaction_Status: "+getStatus());
	}
}
class Encapsulate
{
	public static void main(String[]args)
	{
		Scanner java = new Scanner(System.in);
		PaymentGateway pg = new PaymentGateway();

		pg.setTransactionId((int)(Math.random)*10000001);

		System.out.println("Enter the payerName: ");
		String payerName = java.nextLine();
		pg.setPayerName(payerName);

		System.out.println("Enter the payeeName: ");
		String payeeName = java.nextLine();
		pg.setPayeeName(payeeName);

		System.out.println("Enter the amount to transfer: ");
		double amount = java.nextDouble();
		pg.setAmount(amount);

		System.out.println("Enter the paymentMethod: ");
		String payMethod = java.nextLine();
		pg.setPaymentMethod(payMethod);

		System.out.println("Enter the Transaction Status: ");
		String status = java.nextLine();
		pg.setStatus(status);	

		pg.transactionSummary();	
	}
}

//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
/*2. Create a Java application that demonstrates the use of user-defined packages by organising classes based on their functionality:
--- arithmetic: This package should include a class that defines methods to perform the following operations on two numbers:
a. Addition
b. Subtraction
c. Multiplication
d. Division
e. Modulo

package arithmetic;
class ArithmeticOperations
{
	public int addition(int a, int b)
	{
		return a + b;
	}	

	public int subraction(int a , int b)
	{
		return a - b;
	}
	
	public int multiply(int a , int b)
	{
		return a*b;
	}
	
	public int division(int a, int b)
	{
		return a/b;
	}

	public int modulo(int a, int b)
	{
		return a%b;
	}
}
--- stringutils: This package should include a class that defines methods for:
a. Concatenating two strings
b. Reversing a string
c. Finding the length of a string
In your main class (outside those packages), import the above packages and demonstrate the usage of all the methods.

package stringutils;
class StringOperations
{
	public String concat(String a, String b)
	{
		return a + b;
	}
	
	public String reverse(String str)
	{
		String rev = "";
		for(int i = str.length()-1;i>=0;i--)
		{
			rev+=str.charAt(i);
		}
		return rev;
	}
	
	public int length(String str)
	{
		char[]ch = str.toCharArray();
		int count = 0;
		for(char c:ch)
		{
			count++;
		}
		return count;
	}
}
*/

import arithmetic.ArithmeticOperations;
import stringutils.StringOperations;
class Main
{
	public static void main(String[]args)
	{
		Scanner java = new Scanner(System.in);
		System.out.println("------------arithmetic.ArithmeticOperations------------");
		System.out.println("Enter the integer value for num1: ");
		int num1 = java.nextInt();
		System.out.println("Enter the integer value for num2: ");
		int num2 = java.nextInt();
		ArithmeticOperations m = new ArithmeticOperations();
		System.out.println("Addition of the given numbers: "+m.add(num1, num2));
		System.out.println("Difference between the given numbers: "+m.subraction(num1, num2));
		System.out.println("Product of the given numbers: "+m.multiply(num1, num2));
		System.out.println("Divison of the given numbers: "+m.division(num1, num2));
		System.out.println("Modulos of the given numbers: "+m.modulo(num1, num2));
		java.nextLine();
		System.out.println("--------------stringutils.StringOperations---------------");
		System.out.println("Enter the string1: ");
		String str1 = java.nextLine();
		System.out.println("Enter the string2: ");
		String str2 = java.nextLine();
		StringOperations s = new StringOperations();
		System.out.println("The concatenation of the given string: "+s.concat(str1, str2));
		System.out.println("Enter any string: ");
		String str = java.nextLine();
		System.out.println("The Reverse of the given string: "+s.reverse(str));
		System.out.println("The Length of the given string: "+s.length(str));
	}
}

//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
/*3. Design a class `Employee` with private data members: employee ID, name, designation, department, and monthly salary. Use proper getter and setter methods to access and update these fields. Add a method to calculate and return the annual salary of the employee.*/

class Employee
{
	private int employeeId;
	private String employeeName;
	private String employeeDesignation;
	private String employeeDepartment;
	private double salaryPerMonth;

	public void setId(int id)
	{
		this.employeeId = id;
	}
	public int getId()
	{
		return this.employeeId;
	}

	public void setName(String name)
	{
		this.employeeName = name;
	}
	public String getName()
	{
		return this.employeeName;
	}

	public void setDesignation(String designation)
	{
		this.employeeDesignation = designation;
	}
	public String getDesignation()
	{
		return this.employeeDesignation;
	}

	public void setDepartment(String department)
	{
		this.employeeDepartment = department;
	}
	public String getDepartment()
	{
		return this.employeeDepartment;
	}

	public void setSalary(double pay)
	{
		this.salaryPerMonth = pay;
	}
	public double getSalary()
	{
		return this.salaryPerMonth;
	}
	
	public double calculateSalary()
	{
		return 12*this.salaryPerMonth;
	}	
}

class PayScale
{
	public static void main(String[]args)
	{
		Scanner java = new Scanner(System.in);
		Employee E = new Employee();
		System.out.println("Enter the Employee Id: ");
		E.setId(java.nextInt());
		java.nextLine();
		System.out.println("Enter the Employee Name: ");
		E.setName(java.nextLine());
		System.out.println("Enter the Designation: ");
		E.setDesignation(java.nextLine());
		System.out.println("Enter the Department: ");
		E.setDepartment(java.nextLine());
		System.out.println("Enter the Salary per month: ");
		E.setSalary(java.nextDouble());
		
		System.out.println("\n\nEmployee_Id: "+ E.getName());
		System.out.println("Employee_Name: "+ E.getName());
		System.out.println("Employee_Designation: "+ E.getDesignation());
		System.out.println("Employee_Department: "+E.getDepartment());
		System.out.println("Employee_Salary(per_month): "+E.getSalary());
		System.out.println("Employee_Salary(per_annum): "+E.calculateSalary());
	}
}

//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
/*
4. Design a travel booking system using two packages:
`travel.booking` – includes a class `Ticket` with ticket ID, destination, and fare.
`travel.user` – includes a class `User` with user details and a method to book a ticket.
Illustrate accessing ticket data from within the user class.

package travel.booking;
public class Booking
{
	private int ticketId;
	private String source;
	private String destination;
	private double fare;
	private int seatNo;
	int min = 500, max = 1000;
	int min1 = 1, max1 = 61;

	public int getId()
	{
		this.ticketId = (int)(Math.random()*1001);
		return this.ticketId;
	}

	public void setSource(String src)
	{
		this.source = src;
	}
	public String getSource()
	{
		return this.source;
	}

	public void setDestiny(String destiny)
	{
		this.destination = destiny;
	}
	public String getDestiny()
	{
		return this.destination;
	}

	public int getSeat()
	{
		this.seatNo = min1 + (int)(Math.random() * ((max1 - min1)+1));
		return this.seatNo;
	}

	public double getFare()
	{
		this.fare = min + (int)(Math.random() * ((max - min)+1));
		return this.fare;
	}
}


package travel.user;
import travel.booking.Booking;
public class User
{
	private String passengerName;
	private int passengerAge;
	private String gender; 
	private String idName;
	private String idNumber;
	private long contactNumber;

	public void setName(String name)
	{
		this.passengerName = name;
	}
	public String getName()
	{
		return this.passengerName;
	}
	
	public void setAge(int age)
	{
		this.passengerAge = age;
	}
	public int getAge()
	{
		return this.passengerAge;
	}

	public void setGender(String gender)
	{
		this.gender = gender;
	}
	public String getGender()
	{
		return this.gender;
	}

	public void setIdName(String idName)
	{
		this.idName = idName;
	}
	public String getIdName()
	{
		return this.idName;	
	}

	public void setIdNumber(String idNum)
	{
		this.idNumber = idNum;
	}
	public String getIdNumber()
	{
		return this.idNumber;
	}

	public void setContact(long contact)
	{
		this.contactNumber = contact;
	}
	public long getContact()
	{
		return this.contactNumber;
	}

	Booking b = new Booking();
	public void journey(String source, String destination)
	{
		b.setSource(source);
		b.setDestiny(destination);
	}

	public void bookTicket()
	{
		
		System.out.println("\n----------------------Your Ticket Booked Successfully!!!-------------------");
		System.out.println("----------------------------Ticket Details---------------------------------");
		System.out.println("\nTicket ID: "+b.getId());
		System.out.println("Passenger Name: "+getName());
		System.out.println("Passenger Age: "+getAge());
		System.out.println("Passenger Gender: "+getGender());
		System.out.println("Passenger Id Name: "+getIdName());
		System.out.println("Passenger Id Number: "+getIdNumber());
		System.out.println("Passenger Contact Number: "+getContact());
		System.out.println("From: "+b.getSource());
		System.out.println("To: :"+b.getDestiny());
		System.out.println("Seat Number: "+b.getSeat());
		System.out.println("Ticket Fare: "+b.getFare());
		System.out.println("\n-------------Your journey is a story; make each chapter count--------------");
		return;
	}


}
/*

import travel.user.User;
class TicketBooking
{
	public static void main(String[]args)
	{
		Scanner java = new Scanner(System.in);
		User u = new User();

		System.out.println("Enter the Source and Destination");
		u.journey(java.nextLine(), java.nextLine());

		System.out.println("Enter the passenger name: ");
		u.setName(java.nextLine());

		System.out.println("Enter the age: ");
		u.setAge(java.nextInt());
		java.nextLine();
		
		System.out.println("Enter the gender: ");
		u.setGender(java.nextLine());

		System.out.println("Enter the Id name that you should come with during the journey: ");
		u.setIdName(java.nextLine());

		System.out.println("Enter the Id Number: ");
		u.setIdNumber(java.nextLine());

		System.out.println("Enter the Contact Number: ");
		u.setContact(java.nextLong());

		u.bookTicket();
	}
}

//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

/*
5. Design a class named `BankAccount` that uses the concept of encapsulation. The class should have the following private data members: account number, account holder name, and balance. Provide public getter and setter methods to access and modify these fields. Also, include a method to deposit and withdraw amount ensuring that the balance cannot go negative.
*/

class BankAccount
{
	private long accountNumber;
	private String accountHolderName;
	private double balance = 0;

	public void setAccno(long number)
	{
		this.accountNumber = number;
	}
	public long getAccno()
	{
		return accountNumber;
	}
	
	public void setAccname(String name)
	{
		this.accountHolderName = name;
	}
	public String getAccname()
	{
		return accountHolderName = accountHolderName;
	}

	public double getBalance()
	{
		return this.balance;
	}

	public void toDeposit(double amt)
	{
		deposit(amt);
		return;
	}
	public void toWithdraw(double amt)
	{
		 withdraw(amt);
		 return;
	}

	private void deposit(double amt)
	{
		this.balance+=amt;
		System.out.println("Amount Desposited: "+amt);
		System.out.println("Your Available Balance: "+this.balance);
		return;
	}
	private void withdraw(double amt)
	{
		if(amt<=balance)
		{
			this.balance-=amt;
			System.out.println("Amount Withdrawn: "+amt);
			System.out.println("Your Available Balance: "+this.balance);
		}
		else
		{
			System.out.println("Insufficient balance for the current transaction!!!!");
			System.out.println("Your Available Balance: "+this.balance);
		}
		return;
	}

}
class Transaction
{
	public static void main(String[]args)
	{
		Scanner java = new Scanner(System.in);
		BankAccount bk = new BankAccount();

		System.out.println("Enter the Account Holder Name: ");
		bk.setAccname(java.nextLine());

		System.out.println("Enter the Account No: ");
		bk.setAccno(java.nextLong());

		System.out.println("--------------------Account Details------------------\n");
		System.out.println("Account Holder Name: "+bk.getAccname());
		System.out.println("Account Holder Number: "+bk.getAccno());
		while(true)
		{
			System.out.println("Choose the option: \n1. To View Balance \n2. To Deposit \n3. To Withdraw \n4. To Exit ");
			int choice = java.nextInt();

			switch(choice)
			{
				case 1:
					System.out.println("Your Current Balance: "+bk.getBalance());
					break;

				case 2:
					System.out.println("Enter the amount to Deposit: "); 
					bk.toDeposit(java.nextDouble());
					break;

				case 3:
					System.out.println("Enter the amount to Withdraw: ");
					bk.toWithdraw(java.nextDouble());
					break;

				case 4:
					System.out.println("\n------------------Shutting Down-----------------");
					return;

				default:
					System.out.println("Enter the valid option!!!");
					break;
			}
		}
	}	
}
















