package Booking;

public class Bearthallocation {
	public String ballocation(int age,String preference) {
		if(age>=60&&(1<=BookingInitialization.getInstance().getLowerbearth())) {
			int count=BookingInitialization.getInstance().getLowerbearth();
			count=count-1;
			BookingInitialization.getInstance().setLowerbearth(count);
			return "LB";
		}
		else if(preference.equalsIgnoreCase("MB")&&(1<=BookingInitialization.getInstance().getMiddelbearth())) {
			int count=BookingInitialization.getInstance().getMiddelbearth();
			count=count-1;
			BookingInitialization.getInstance().setMiddelbearth(count);
			return "MB";
		}
		else if(preference.equalsIgnoreCase("UB")&&(1<=BookingInitialization.getInstance().getUpperbearth())) {
			int count=BookingInitialization.getInstance().getUpperbearth();
			count=count-1;
			BookingInitialization.getInstance().setUpperbearth(count);
			return "UB";
		}
		else if(1<=BookingInitialization.getInstance().getMiddelbearth()) {
			int count=BookingInitialization.getInstance().getMiddelbearth();
			count=count-1;
			BookingInitialization.getInstance().setMiddelbearth(count);
			return "MB";
		}
		else if(1<=BookingInitialization.getInstance().getLowerbearth()){
			int count=BookingInitialization.getInstance().getLowerbearth();
			count=count-1;
			BookingInitialization.getInstance().setLowerbearth(count);
			return "LB";
		}
		return"sb";
	}

}
