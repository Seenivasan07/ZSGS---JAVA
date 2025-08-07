/*
4. Design a travel booking system using two packages:
`travel.booking` – includes a class `Ticket` with ticket ID, destination, and fare.
`travel.user` – includes a class `User` with user details and a method to book a ticket.
Illustrate accessing ticket data from within the user class.*/

import java.util.*;
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