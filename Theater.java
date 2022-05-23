package assessment;

public class Theater {
	String tname;
	Ticket t;
	public void setTname(String tname) {
		this.tname = tname;
	}
	public String getTname() {
		return tname;
	}
	public Theater() {	}
	public Theater(String tname) {
		this.tname=tname;
	}
	public synchronized void  bookTicket(String movieName,int noOfTickets) {
		System.out.println("<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>");
		t=new Ticket(movieName,noOfTickets);
		System.out.println("Ticket Booked successfully..!");
		System.out.println("<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>");
	}
	public void checkAvailability() {
		System.out.println("<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>");
		if(t==null)
			System.out.println("Tickets are available");
		else
			System.out.println("Tickets are not available");
		System.out.println("<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>");
	}
	public synchronized void cancleTicket() {
		System.out.println("<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>");
		if(t!=null) {
			t=null;
			System.out.println("Ticket cancled...!!!");
		}
		else
			System.out.println("Ticket Not Booked...!");
		System.out.println("<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>");
	}
	public void showTicketDetails() {
		System.out.println("<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>");
		System.out.println("Theater Name: "+tname);
		t.ticketDetails();
		System.out.println("<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>");
	}
}
