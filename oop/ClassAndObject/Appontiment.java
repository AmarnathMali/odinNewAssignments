package oop.ClassAndObject;

public class Appontiment extends Date{
     private String text;
     
     Appontiment(){
    	 
     }
    
	public Appontiment(int day, int month, int year, String text) {
		super(day, month, year);
		this.text = text;
	}

	

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	
	
    void getInfo() {
    	System.out.println("I have "+text+" on "+this.getDay()+"/"+this.getMonth()+"/"+this.getYear());
    }
     
}
