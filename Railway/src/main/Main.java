package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import Booking.Bearthallocation;
import Booking.BookingInitialization;
import Booking.Printticket;
import Booking.TicketDetails;
import cancelation.Ticketcancel;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		List<TicketDetails> ticketlist=new ArrayList<TicketDetails>();
		System.out.println("Enter the number of passenger");
		String numberofpassenger=reader.readLine();
		for(int i=1;i<=Integer.parseInt(numberofpassenger);i++) {
		if(61>BookingInitialization.getInstance().getConfirmticketcount()) {
			int count=BookingInitialization.getInstance().getConfirmticketcount();
			count=count+1;
			TicketDetails tcount=start(i);
			tcount.setStatus("Confirm");
			int ticketnumber=BookingInitialization.getInstance().getTicketnumber();
			ticketnumber=ticketnumber+1;
			BookingInitialization.getInstance().setTicketnumber(ticketnumber);
			tcount.setTicketNumber(ticketnumber);
			Bearthallocation ba=new Bearthallocation();
			String bearthallocated=ba.ballocation(tcount.getAge(),tcount.getBearthPreference());
			tcount.setBearthAllocated(bearthallocated);
			BookingInitialization.getInstance().getConfirmticket().add(tcount);
			ticketlist.add(tcount);
			BookingInitialization.getInstance().setConfirmticketcount(count);
		}
		else if((18>BookingInitialization.getInstance().getRacticketcount())) {
			int count=BookingInitialization.getInstance().getRacticketcount();
			count=count+1;
			TicketDetails tcount=start(i);
			tcount.setStatus("RAC");
			int ticketnumber=BookingInitialization.getInstance().getTicketnumber();
			ticketnumber=ticketnumber+1;
			BookingInitialization.getInstance().setTicketnumber(ticketnumber);
			tcount.setTicketNumber(ticketnumber);
			Bearthallocation ba=new Bearthallocation();
			String bearthallocated=ba.ballocation(tcount.getAge(),tcount.getBearthPreference());
			tcount.setBearthAllocated(bearthallocated);
			BookingInitialization.getInstance().getRACticket().add(tcount);
			ticketlist.add(tcount);
			BookingInitialization.getInstance().setRacticketcount(count);
		}
		else if((10>BookingInitialization.getInstance().getWaitinglistcount())) {
			int count=BookingInitialization.getInstance().getWaitinglistcount();
			count=count+1;
			TicketDetails tcount=start(i);
			tcount.setStatus("WL");
			int ticketnumber=BookingInitialization.getInstance().getTicketnumber();
			ticketnumber=ticketnumber+1;
			BookingInitialization.getInstance().setTicketnumber(ticketnumber);
			tcount.setTicketNumber(ticketnumber);
			Bearthallocation ba=new Bearthallocation();
			String bearthallocated="NAN";
			tcount.setBearthAllocated(bearthallocated);
			BookingInitialization.getInstance().getWaitinglist().add(tcount);
			ticketlist.add(tcount);
			BookingInitialization.getInstance().setWaitinglistcount(count);
		}
		}
		Printticket pt=new Printticket();
		pt.print(ticketlist);
		System.out.println("press 1 to continue");
		System.out.println("press 2 to view entire history of booking");
		System.out.println("press 3 for cancellation");
		String option=reader.readLine();
		if(1==Integer.parseInt(option)) {
			main(args);
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
	public static TicketDetails start(int number) throws IOException {
		TicketDetails td=new TicketDetails();
		int i=number;
		System.out.println("Enter the "+i+"st "+"passenger Name ");
		BufferedReader reader1=new BufferedReader(new InputStreamReader(System.in));
		String name=reader1.readLine();
		td.setName(name);
		System.out.println("Enter the "+td.getName()+" age");
		String age=reader1.readLine();
		int age1=Integer.parseInt(age);
		td.setAge(age1);
		System.out.println("Enter the "+td.getName()+" Gender(male/female)");
		String gender=reader1.readLine();
		td.setGender(gender);
		System.out.println("Enter the "+td.getName()+" Bearthpreference");
		String bearthpreference=reader1.readLine();
		td.setBearthPreference(bearthpreference);
		return td;
	}
}
