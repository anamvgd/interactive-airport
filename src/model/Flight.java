package model;

import java.util.Date;

public class Flight implements Comparable<Flight>{
	
	private Date date;
	private String airline;
	private String numFlight;
	private String destiny;
	private String gate;

	public Flight(Date d, String a, String n, String des, String g) {
		this.date = d;
		this.airline = a;
		this.numFlight = n;
		this.destiny = des;
		this.gate = g;
		
	}

	public Date getDate() {
		return this.date;
	}


	public void setDate(Date date) {
		this.date = date;
	}

	public String getAirline() {
		return this.airline;
	}

	
	public void setAirline(String airline) {
		this.airline = airline;
	}

	public String getNumFlight() {
		return this.numFlight;
	}

	
	public void setNumFlight(String numFlight) {
		this.numFlight = numFlight;
	}

	public String getDestiny() {
		return this.destiny;
	}

	public void setDestiny(String destiny) {
		this.destiny = destiny;
	}

	public String getGate() {
		return this.gate;
	}

	public void setGate(String gate) {
		this.gate = gate;
	}
	
	@Override
	public int compareTo(Flight flights) {
		int comparation ;
		
		if(airline.compareTo(flights.airline)>0) {
			comparation = 1;
		}else if(airline.compareTo(flights.airline)<0) {
			comparation = -1;
		}else {
			comparation = 0;
		}
		return comparation;
	}
	
	@Override
	public String toString() {
		return "Date: "+date+"\n"+ "Airline: "+airline+"\n" +"Flight: "+numFlight+"\n"+"Destiny: "+destiny+"\n"+"Gate: "+gate;
	}
}
