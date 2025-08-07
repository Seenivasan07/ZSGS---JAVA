/*
4. Design a travel booking system using two packages:
`travel.booking` – includes a class `Ticket` with ticket ID, destination, and fare.
`travel.user` – includes a class `User` with user details and a method to book a ticket.
Illustrate accessing ticket data from within the user class.
*/

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







