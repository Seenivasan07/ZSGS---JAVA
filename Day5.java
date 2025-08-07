/*
*Day-5 Assignment Questions:*
1. Design a Java program to maintain hospital medical records.
Create a base class named MedicalRecord that includes common attributes:
--- recordId, patientName, dateOfVisit, and diagnosis.
--- inputRecordDetails() – to input common record information.
--- override displayRecord() – to display the common record details.
‌
Create a subclass InPatientRecord that extends MedicalRecord and adds:
--- roomNumber, numberOfDaysAdmitted, roomCharges.
--- calculateTotalCharges() – to compute and return total inpatient cost.
--- displayRecord() – to include all details, including total charges.
‌
Create another subclass OutPatientRecord that extends MedicalRecord and adds:
--- doctorName, consultationFee.
--- override displayRecord() – to include all outpatient-specific details.
Include all the necessary classes if its needed.
‌
2. Can we override private method, constructor, static method, final method? Illustrate with an example.
‌
3. Create a Java application to manage employees in a company. Define a base class Employee with a method calculateSalary(). Then create two subclasses FullTimeEmployee and PartTimeEmployee that override calculateSalary() method based on their working type.
‌
4. Design a Java Ticket Booking System using polymorphism where Bus, Train, and Flight tickets share a common method but implement booking differently.
*/

//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

import java.util.*;
public class Day5
{
	public static void main(String[]args)
	{
	}
}


/*
1. Design a Java program to maintain hospital medical records.
Create a base class named MedicalRecord that includes common attributes:
--- recordId, patientName, dateOfVisit, and diagnosis.
--- inputRecordDetails() – to input common record information.
--- override displayRecord() – to display the common record details.
‌
Create a subclass InPatientRecord that extends MedicalRecord and adds:
--- roomNumber, numberOfDaysAdmitted, roomCharges.
--- calculateTotalCharges() – to compute and return total inpatient cost.
--- displayRecord() – to include all details, including total charges.
‌
Create another subclass OutPatientRecord that extends MedicalRecord and adds:
--- doctorName, consultationFee.
--- override displayRecord() – to include all outpatient-specific details.
Include all the necessary classes if its needed.
*/
class MedicalRecord
{
	int recordId;
	String patientName;
	String dateOfVisit;
	String diagnosis;
	
	public void inputRecordDetails(int id, String name, String date, String diag)
	{
		recordId = id;
		patientName = name;
		dateOfVisit = date;
		diagnosis = diag;
		return;
	}
	
	public void displayRecord()
	{
		System.out.println("Patient recordId: "+recordId);
		System.out.println("Patient Name: "+patientName);
		System.out.println("Date Of Visit: "+dateOfVisit);
		System.out.println("Diagnosis: "+diagnosis);
	}
}
class InPatientRecord extends MedicalRecord
{
	int roomNumber;
	int numberOfDaysAdmitted;
	double roomCharges;
	
	public InPatientRecord(int no, int days, double charge)
	{
		this.roomNumber = no;
		this.numberOfDaysAdmitted = days;
		this.roomCharges = charge;
	}
	
	public double calculateTotalCharges()
	{
		return this.numberOfDaysAdmitted * this.roomCharges;
	}
	
	public void displayRecord()
	{	
		super.displayRecord();
		System.out.println("Room Number: "+this.roomNumber);
		System.out.println("Number of Days Admitted: "+this.numberOfDaysAdmitted);
		System.out.println("Room Charges: "+calculateTotalCharges());
	}
}
class OutPatientRecord extends MedicalRecord
{
	String doctorName;
	double consultationFee;

	public OutPatientRecord(String doctorName, double consultationFee)
	{
		this.doctorName = doctorName;
		this.consultationFee = consultationFee;
	}
	public void displayRecord()
	{
		super.displayRecord();
		System.out.println("Doctor Name: "+this.doctorName);
		System.out.println("Consultation Fee: "+this.consultationFee);
	}
}
class Hospital
{
	public static void main(String[]args)
	{
		Scanner java = new Scanner(System.in);
		MedicalRecord m;
		int count = 1;
		while(true)
		{
			System.out.println("Enter 1.OutPatientRecord 2.InPatientRecord 3.Exit:");
			int option = java.nextInt();
			java.nextLine();
			switch(option)
			{
				case 1: 
					System.out.println("Enter the patient name: ");
					String name = java.nextLine();
					System.out.println("Date of Visit: ");
					String date = java.nextLine();
					System.out.println("Enter the reason for visiting: ");
					String diag = java.nextLine();
				    
					System.out.println("Enter the doctorName: ");
					String docname = java.nextLine();
					System.out.println("Enter the Consultation Fee: ");
					double fee = java.nextDouble();
					m = new OutPatientRecord(docname, fee);
					m.inputRecordDetails(count++, name, date, diag);
					m.displayRecord();
					break;

				case 2:
					System.out.println("Enter the patient name: ");
					String patname = java.nextLine();
					System.out.println("Date of Visit: ");
					String visit = java.nextLine();
					System.out.println("Enter the reason for visiting: ");
					String diagnosis = java.nextLine();
				
					System.out.println("Enter the Room Number: ");
					int room = java.nextInt();
					System.out.println("Enter the number of days admitted: ");
					int days = java.nextInt();
					System.out.println("Enter the room charge per day: ");
					double charge = java.nextInt();
					m = new InPatientRecord(room, days, charge);
					m.inputRecordDetails(count++, patname, visit, diagnosis);
					m.displayRecord();
					break;

				case 3:
					System.out.println("Shutting Down!!!");
					return;

				default: 
					System.out.println("Enter the choice correctly!!!");
			}
		}
	}
}

//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

//2. Can we override private method, constructor, static method, final method? Illustrate with an example.
class ParentClass
{
	public ParentClass()
	{
		System.out.println("The Constructor of Super Class");
	}

	private void show()
	{
		System.out.println("The method is declare as private, so it cant be override");
	}

	static void display()
	{
		System.out.println("Static Method in the parent class will be executed, when object is created through Parent class reference");
	}

	final void print()
	{
		System.out.println("This is to show that when we declare something final, it will not be able to override");
	}
}
class ChildClass extends ParentClass
{
	ParentClass()								              //compiler treats it as a method and expects a return type and
	{										      //generates a compile time error
		System.out.println("Trying to override the parent class constructor");            	
	}										      
	
	void show()								              //Declaring same-named method in child = new method, not override.
	{
		System.out.println("The Void Show() inside child class, is not considered as override instead, it treated as new method");
	}
	
	static void display()                                                                //If I didn't use static, it will generate error as a static method cannot be hide through
	{                                                                                    //non-static method
                                                                                             
		System.out.println("Static Method in the child class will be executed, when object is created for child class");
	}

	void print()
	{
		System.out.println("This is will generate error, because ones we declare something final, it will be unchangeable and will be remains constant across all subclasses");
	}

	public static void main(String[]args)
	{
		ChildClass cd = new ChildClass();
		cd.show();
		cd.display();
		cd.print();
	}
}

//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
/*3. Create a Java application to manage employees in a company. Define a base class Employee with a method calculateSalary(). Then create two subclasses FullTimeEmployee and PartTimeEmployee that override calculateSalary() method based on their working type.*/

class Employee
{
	String empName;
 	int empId;
	
	public void calculateSalary(String name, int empId, int days)
	{
		return;
	}	
}
class FullTime extends Employee
{
	public void calculateSalary(String name, int empId, int days)
	{
		System.out.println("\n\nEmployee Name  : "+name);
		System.out.println("Employee Id    : "+empId);
		System.out.println("Days Worked    : "+days);
		System.out.println("Salary Credited: "+days*1500);
	}
}
class PartTime extends Employee
{
	public void calculateSalary(String name, int empId, int days)
	{
		System.out.println("\n\nEmployee Name  : "+name);
		System.out.println("Employee Id    : "+empId);
		System.out.println("Days Worked    : "+days);
		System.out.println("Salary Credited: "+days*700);
	}
}
class SalaryCalculation
{
	public static void main(String[]args)
	{
		Scanner java = new Scanner(System.in);
		Employee e;
		System.out.println("\n...............EMPLOYEE SALARY CALCULATION...............\n");
		while(true)
		{
			System.out.println("\nEnter the choice: \n1. To Calculate Salary \n2. Exit");
			switch(java.nextInt())
			{
				case 1:
					java.nextLine();
					System.out.println("\nEnter the Employee name: ");
					String name = java.nextLine();
					System.out.println("Enter the Employee Id: ");
					int id = java.nextInt();
					System.out.println("Enter the number of working days: ");
					int days = java.nextInt();

					salary_calculation:
					while(true)
					{
						System.out.println("\nSelect Employment Type: \n1. Full Time Employement \n2. Part Time Employment");
						switch(java.nextInt())
						{
							case 1:
								e = new FullTime();
								e.calculateSalary(name, id, days);
								break salary_calculation;
							
							case 2:
								e = new PartTime();
								e.calculateSalary(name, id, days);
								break salary_calculation;

							default:
								System.out.println("Enter the Option Correctly..!!!"); 
						}
					}
					break;

				case 2:
					System.out.println("\n\n...................Shutting Down!!!.....................");
					return;

				default: 
					System.out.println("Enter the option correctly!!!");
			}
		}
	
	}	
}

//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

//4. Design a Java Ticket Booking System using polymorphism where Bus, Train, and Flight tickets share a common method but implement booking differently.

class BookingSystem
{
	String passengerName;		
	String boardingPoint;
	String destination;
	double price;
	int ticketId;
	String ticketStatus = "booked";
	public BookingSystem(String passengerName, int id, String board, String destiny, double price)
	{
		this.passengerName = passengerName;
		this.ticketId = id; 
		this.boardingPoint = board;
		this.destination = destiny;
		this.price = price;
	}
	public void bookTicket()
	{
		
		return;
	}
}

class Bus extends BookingSystem
{
	String busType;
	String busName;	
		
	public Bus(String passengerName, int id, String board, String destiny, double price, String busType, String busName)
	{
		super(passengerName, id, board, destiny, price);
		this.busType = busType;
		this.busName = busName;
		bookTicket();
	}
	public void bookTicket()
	{
		System.out.println("----------------------------------HAPPY BUS JOURNEY--------------------------------");
		System.out.println("Ticket_ID: "+super.ticketId);
		System.out.println("Passenger_Name: "+super.passengerName);
		System.out.println("Boarding_Point: "+super.boardingPoint);
		System.out.println("Destination_Point: "+super.destination);
		System.out.println("Bus_Name: "+busName);
		System.out.println("Bus_Type: "+busType);
		System.out.println("Ticket_Fare: "+super.price);
		System.out.println("-----Sometimes it's the journey that teaches you a lot about your destination------\n\n\n");
		return;
	}	
}

class Train extends BookingSystem
{
	String fareClass;
	int trainNo;
	String trainName;

	public Train(String passengerName, int id, String board, String destiny, double price, String fareClass, int trainNo, String trainName)
	{
		super(passengerName, id, board, destiny, price);
		this.fareClass = fareClass;
		this.trainNo = trainNo;
		this.trainName = trainName;
		bookTicket();
	}
	public void bookTicket()
	{
		System.out.println("---------------------------------HAPPY RAIL JOURNEY------------------------------------");
		System.out.println("Ticket_ID: "+super.ticketId);
		System.out.println("Passenger_Name: "+super.passengerName);
		System.out.println("Boarding_Point: "+super.boardingPoint);
		System.out.println("Destination_Point: "+super.destination);
		System.out.println("Train_Name: "+trainName);
		System.out.println("Train_No: "+trainNo);
		System.out.println("FareClass: "+fareClass);
		System.out.println("Ticket_Fare: "+super.price);
		System.out.println("------Sometimes it's the journey that teaches you a lot about your destination.-------\n\n\n");
		return;
	}	
}

class Flight extends BookingSystem
{
	String aeroClass;
	int flightNo;
	String flightName;
	
	public Flight(String passengerName, int id, String board, String destiny, double price, String aeroClass, int flightNo, String flightName)
	{
		super(passengerName, id, board, destiny, price);
		this.aeroClass = aeroClass;
		this.flightNo = flightNo;
		this.flightName = flightName;
		bookTicket();
	}
	public void bookTicket()
	{
		System.out.println("--------------------------------------HAPPY FLYING-------------------------------------");
		System.out.println("Ticket_ID: "+super.ticketId);
		System.out.println("Passenger_Name: "+super.passengerName);
		System.out.println("Boarding_Point: "+super.boardingPoint);
		System.out.println("Destination_Point: "+super.destination);
		System.out.println("Flight_No: "+flightNo);
		System.out.println("Flight_Name: "+flightName);
		System.out.println("Aero_Class: "+aeroClass);
		System.out.println("Ticket_Fare: "+super.price);
		System.out.println("------Sometimes it's the journey that teaches you a lot about your destination------\n\n\n");
		return;
	}
}

class BookTicket
{
	public static void main(String[]args)
	{
	Scanner java = new Scanner(System.in);
	System.out.println("----------------------------------Ticket Booking System-------------------------------------");
	System.out.println("Enter the Boarding Point: ");
	String boarding = java.nextLine();
	System.out.println("Enter the Destination: ");
	String destiny = java.nextLine();
	System.out.println("Enter the Passenger Name: ");
	String name = java.nextLine();
	BookingSystem b;
	
	while(true)
	{
		System.out.println("Enter the mode of transport: \n1. Bus \n2. Train \n3. Flight \n4. Exit");
		int mode = java.nextInt();
		java.nextLine();
		switch(mode)
		{
			case 1: 
				System.out.println("Enter the BusType: ");
				String bustype = java.nextLine();
				System.out.println("Enter the BusName: ");
				String busname = java.nextLine();
				int min = 500, max = 1000;
				double busfare = min + (int)(Math.random() * ((max - min) + 1));
				b = new Bus(name, (int)(Math.random()*100), boarding, destiny, busfare, bustype, busname);
				break;

			case 2:
				System.out.println("Enter the TrainNo: ");
				int trainno = java.nextInt();
				java.nextLine();
				System.out.println("Enter the TrainName: ");
				String trainame = java.nextLine();
				System.out.println("Enter the class: ");
				String fareclass = java.nextLine();
				int min1 = 500, max1 = 1000;
				double trainfare = min1 + (int)(Math.random() * ((max1 - min1) + 1));
				b = new Train(name, (int)(Math.random()*100), boarding, destiny, trainfare, fareclass, trainno, trainame);
				break;

			case 3:
				System.out.println("Enter the FlightNo: ");
				int flightno = java.nextInt();
				java.nextLine();
				System.out.println("Enter the FlightName: ");
				String flightname = java.nextLine();
				System.out.println("Enter the class: ");
				String aeroclass = java.nextLine();
				int min2 = 2000, max2 = 5000;
				double aerofare = min2 + (int)(Math.random() * ((max2 - min2) + 1));
				b = new Flight(name, (int)(Math.random()*100), boarding, destiny, aerofare, aeroclass, flightno, flightname);
				break;

			case 4:
				System.out.println("Shutting Down!!!!");
				return;

			default:
				System.out.println("Enter the correct choice..!!!");
		}
	}	

	}
}



















