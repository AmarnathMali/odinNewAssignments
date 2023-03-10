package oop.ClassAndObject;

public class Date {
	private int month;
	private int day;
	private int year;
	
	public Date(){
		
	}
	public Date(int day, int month, int year) {
		
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	@Override
	public String toString() {
		return "Date [month=" + month + ", day=" + day + ", year=" + year + "]";
	}
	void getInfo() {
		System.out.println("Given Date is "+day+"/"+month+"/"+year);
	}
}
