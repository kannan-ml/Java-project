package cancelation;

import Booking.BookingInitialization;
import Booking.TicketDetails;

public class Ticketcancel {
	int ticketcancelcount=0;
	public void ticketcancel(String Ticketnumber, String pname) {
		for(TicketDetails td:BookingInitialization.getInstance().getConfirmticket()) {
			if(((td.name).equals(pname))&&(td.getTicketNumber()==(Integer.parseInt(Ticketnumber)))){
				BookingInitialization.getInstance().getConfirmticket().remove(td);
				if(!BookingInitialization.getInstance().getRACticket().isEmpty()) {
					TicketDetails tk=BookingInitialization.getInstance().getRACticket().get(ticketcancelcount);
					tk.setStatus("RAC->Confirm");
					BookingInitialization.getInstance().getConfirmticket().add(tk);
					BookingInitialization.getInstance().getRACticket().remove(ticketcancelcount);
				}
				if(!BookingInitialization.getInstance().getWaitinglist().isEmpty()) {
					TicketDetails tk=BookingInitialization.getInstance().getWaitinglist().get(ticketcancelcount);
					tk.setStatus("WL->RAC");
					BookingInitialization.getInstance().getRACticket().add(tk);
					BookingInitialization.getInstance().getWaitinglist().remove(ticketcancelcount);
				}
				ticketcancelcount=ticketcancelcount+1;
				System.out.println("Ticket cancellation successfull");
			}
		}
		
	}

}
