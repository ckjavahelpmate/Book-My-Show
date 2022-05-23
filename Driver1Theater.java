package assessment;
import java.util.Scanner;
import OlaDownCastExample.*;

public class Driver1Theater {
	static Theater th=new Theater();
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Welocme to BookMyShow Application\n"
				+ "=====================================\n");
		boolean repeat=true;
		do {
			try {
				System.out.println("Select an Option\n"
						+ "=================\n"
						+ "1)Book Ticket\n"
						+ "2)Cancle Ticket\n"
						+ "3)Check Ticket Availability\n"
						+ "4)Show Ticket Details\n"
						+ "5)Exit");
				int choice=sc.nextInt();
				switch(choice) {
				case(1):
				{
					if(th.t==null)
					{
						System.out.println("Enter the Theater Name");
						String tname=sc.next();
						th.setTname(tname);
						System.out.println("Enter the Movie Name");
						String movieName=sc.next();
						System.out.println("Enter the No. of seats");
						int noOfTickets=sc.nextInt();
						th.bookTicket(movieName,noOfTickets);
						OlaDriver.main(null);
						break;
					}
					else
						th.checkAvailability();break;

				}
				case(2):
				{
					th.cancleTicket();break;
				}
				case(3):
				{
					th.checkAvailability();
					break;
				}
				case(4):
				{
					if(th.t!=null) {
						th.showTicketDetails();
					}
					else {
						System.out.println("Ticket not Booked...!");
					}break;

				}
				case(5):
				{
					repeat=false;
					break;
				}
				default:System.out.println("Invalid Selection...!");
				}

			} catch (Exception e) {
				System.out.println("Invalid Selection...!");sc.next();

			} 
		}while (repeat);
		System.out.println("Thank you for using Application");
	
	}
}
