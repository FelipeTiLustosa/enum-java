package entities;

import java.time.LocalDate;

public class HourContract {
private LocalDate date;
private Double ValuePerHour;
private int hours;


public HourContract() {
	
}

public HourContract(LocalDate date, Double valuePerHour, int hours) {
	this.date = date;
	ValuePerHour = valuePerHour;
	this.hours = hours;
}



public Double totalValue() {
	return hours*ValuePerHour;
	}


public LocalDate getDate() {
	return date;
}


public void setDate(LocalDate date) {
	this.date = date;
}


public Double getValuePerHour() {
	return ValuePerHour;
}


public void setValuePerHour(Double valuePerHour) {
	ValuePerHour = valuePerHour;
}


public int getHours() {
	return hours;
}


public void setHours(int hours) {
	this.hours = hours;
}


}
