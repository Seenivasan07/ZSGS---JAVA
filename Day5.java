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





























