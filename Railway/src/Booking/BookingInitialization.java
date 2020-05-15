package Booking;

import java.util.ArrayList;
import java.util.List;

public class BookingInitialization {
	static BookingInitialization bk;
	static List<TicketDetails> confirmticket=new ArrayList<TicketDetails>();
	static List<TicketDetails> RACticket=new ArrayList<TicketDetails>();
	static List<TicketDetails> waitinglist=new ArrayList<TicketDetails>();
	public int ticketnumber=4080;
	public int confirmticketcount=0;
	public int racticketcount=0;
	public int waitinglistcount=0;
	public int upperbearth=21;
	public int lowerbearth=21;
	public int middelbearth=21;
	public int racbearth=9;
	public int getTicketnumber() {
		return ticketnumber;
	}
	public void setTicketnumber(int ticketnumber) {
		this.ticketnumber = ticketnumber;
	}
	public int getUpperbearth() {
		return upperbearth;
	}
	public void setUpperbearth(int upperbearth) {
		this.upperbearth = upperbearth;
	}
	public int getLowerbearth() {
		return lowerbearth;
	}
	public void setLowerbearth(int lowerbearth) {
		this.lowerbearth = lowerbearth;
	}
	public int getMiddelbearth() {
		return middelbearth;
	}
	public void setMiddelbearth(int middelbearth) {
		this.middelbearth = middelbearth;
	}
	public int getRacbearth() {
		return racbearth;
	}
	public void setRacbearth(int racbearth) {
		this.racbearth = racbearth;
	}
	public BookingInitialization getBk() {
		return bk;
	}
	public void setBk(BookingInitialization bk) {
		this.bk = bk;
	}
	
	public List<TicketDetails> getConfirmticket() {
		return confirmticket;
	}
	public void setConfirmticket(List<TicketDetails> confirmticket) {
		this.confirmticket = confirmticket;
	}
	
	public static List<TicketDetails> getRACticket() {
		return RACticket;
	}
	public static void setRACticket(List<TicketDetails> rACticket) {
		RACticket = rACticket;
	}
	public static List<TicketDetails> getWaitinglist() {
		return waitinglist;
	}
	public static void setWaitinglist(List<TicketDetails> waitinglist) {
		BookingInitialization.waitinglist = waitinglist;
	}
	public int getConfirmticketcount() {
		return confirmticketcount;
	}
	public void setConfirmticketcount(int confirmticketcount) {
		this.confirmticketcount = confirmticketcount;
	}
	public int getRacticketcount() {
		return racticketcount;
	}
	public void setRacticketcount(int racticketcount) {
		this.racticketcount = racticketcount;
	}
	public int getWaitinglistcount() {
		return waitinglistcount;
	}
	public void setWaitinglistcount(int waitinglistcount) {
		this.waitinglistcount = waitinglistcount;
	}
	public static BookingInitialization getInstance() {
		if(null==bk) {
			bk=new BookingInitialization();
			return bk;
		}
		return bk;
	}
}
