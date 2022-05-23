package assessment;

public class Ticket {
	String movieName;
	int noOfTicket;
	public int getNoOfTicket() {
		return noOfTicket;
	}
	public void setNoOfTicket(int noOfTicket) {
		this.noOfTicket = noOfTicket;
	}
	public String getMovieName() {
		return movieName;
	}
	public Ticket() {}
	public Ticket(String movieName,int noOfTicket) {
		this.movieName=movieName;
		this.noOfTicket=noOfTicket;
	}
	public void ticketDetails() {
		System.out.println("Movie Name: "+movieName);
		System.out.println("No. of Tickets: "+noOfTicket);
		
	}
}
