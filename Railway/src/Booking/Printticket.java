package Booking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

import cancelation.Ticketcancel;
import main.Main;

public class Printticket {
	
public void print(List<TicketDetails> ticketlist) {
	System.out.println("==================================Ticket Summary=================================");
	System.out.println("Ticket Number"+"   "+"Passenger Name"+"   "+"age"+"   "+"Gender"+"   "+"BearthPreference"+"   "+"Bearth Allocated"+"	"+"Ticket Status");
	for(int itr=0;itr<ticketlist.size();itr++) {
		TicketDetails td=ticketlist.get(itr);
		System.out.println(td.getTicketNumber()+"		"+td.getName()+"		"+td.getAge()+"      "+td.getGender()+"		"+td.getBearthPreference()+"		"+td.getBearthAllocated()+"		"+td.getStatus());
	}
//	for(int itr=1;itr<=BookingInitialization.getInstance().getRACticket().size();itr++) {
//		TicketDetails td=BookingInitialization.getInstance().getRACticket().get(itr);
//		System.out.println(td.getTicketNumber()+"		"+td.getName()+"		"+td.getAge()+"      "+td.getGender()+"		"+td.getBearthPreference()+"		"+td.getBearthAllocated()+"		"+td.getStatus());
//	}
//	for(int itr=1;itr<=BookingInitialization.getInstance().getWaitinglist().size();itr++) {
//		TicketDetails td=BookingInitialization.getInstance().getWaitinglist().get(itr);
//		System.out.println(td.getTicketNumber()+"		"+td.getName()+"		"+td.getAge()+"      "+td.getGender()+"		"+td.getBearthPreference()+"		"+td.getBearthAllocated()+"		"+td.getStatus());
//	}
	System.out.println("=======================================End=========================================");
}
public void printEntireHistory() throws IOException {
	System.out.println("======================Printing Booked confirm Tickets=============================");
	System.out.println("Ticket Number"+"   "+"Passenger Name"+"   "+"age"+"   "+"Gender"+"   "+"BearthPreference"+"   "+"Bearth Allocated"+"	"+"Ticket Status");
	for(int i=0;i<BookingInitialization.getInstance().getConfirmticket().size();i++) {
		TicketDetails td=BookingInitialization.getInstance().getConfirmticket().get(i);
		System.out.println(td.getTicketNumber()+"		"+td.getName()+"\t"+"\t"+td.getAge()+"		"+td.getGender()+"		"+td.getBearthPreference()+"		"+td.getBearthAllocated()+"		"+td.getStatus());
	}
	System.out.println("=====================================End===========================================");
	
	System.out.println("======================Printing Booked RAC Tickets=============================");
	System.out.println("Ticket Number"+"   "+"Passenger Name"+"   "+"age"+"   "+"Gender"+"   "+"BearthPreference"+"   "+"Bearth Allocated"+"	"+"Ticket Status");
	for(int i=0;i<BookingInitialization.getInstance().getRACticket().size();i++) {
		TicketDetails td=BookingInitialization.getInstance().getRACticket().get(i);
		System.out.println(td.getTicketNumber()+"		"+td.getName()+"\t"+"\t"+td.getAge()+"		"+td.getGender()+"		"+td.getBearthPreference()+"		"+td.getBearthAllocated()+"		"+td.getStatus());
	}
	System.out.println("==================================End============================================");
	
	System.out.println("======================Printing Booked waitlist Tickets=============================");
	System.out.println("Ticket Number"+"   "+"Passenger Name"+"   "+"age"+"   "+"Gender"+"   "+"BearthPreference"+"   "+"Bearth Allocated"+"	"+"Ticket Status");
	for(int i=0;i<BookingInitialization.getInstance().getWaitinglist().size();i++) {
		TicketDetails td=BookingInitialization.getInstance().getWaitinglist().get(i);
		System.out.println(td.getTicketNumber()+"		"+td.getName()+"\t"+"\t"+td.getAge()+"		"+td.getGender()+"		"+td.getBearthPreference()+"		"+td.getBearthAllocated()+"		"+td.getStatus());
	}
	System.out.println("=============================End==================================");
	System.out.println();
	System.out.println();
	System.out.println("press 1 to book");
	System.out.println("press 2 to view entire history of booking");
	System.out.println("press 3 for cancellation of ticket");
	BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
	String option=reader.readLine();
	if(1==Integer.parseInt(option)) {
		String [] args=new String[2];
		Main m=new Main();
		m.main(args);
	}
	if(2==Integer.parseInt(option)) {
		Printticket ptt=new Printticket();
		ptt.printEntireHistory();
	}
	if(3==Integer.parseInt(option)) {
		System.out.println("Enter the ticket number");
		String cancel_ticket_number=reader.readLine();
		System.out.println("Enter the passenger name");
		String pname=reader.readLine();
		Ticketcancel tc=new Ticketcancel();
		tc.ticketcancel(cancel_ticket_number, pname);
		Printticket ptt=new Printticket();
		ptt.printEntireHistory();
	}
	
}
}
