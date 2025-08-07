/*
4. Design a travel booking system using two packages:
`travel.booking` – includes a class `Ticket` with ticket ID, destination, and fare.
`travel.user` – includes a class `User` with user details and a method to book a ticket.
Illustrate accessing ticket data from within the user class.*/

package travel.user;
import java.util.*;
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






