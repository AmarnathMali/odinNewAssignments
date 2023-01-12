package oop.ClassAndObject;

public class Address {
	public String add;
	public int rent;
	public String addres;
	public String location;
	public int rate;
	Address(){
    	System.out.println("default constructor");
    }
	Address(String addres, String location, int rate){
		this.addres = addres;
		this.location = location;
		this.rate=rate;
		
	}

	public String getAdd() {
		return add;
	}

	public void setAdd(String add) {
		this.add = add;
	}

	@Override
	public String toString() {
		return "Address [add=" + add + ", rent=" + rent + ", addres=" + addres + ", location=" + location + ", rate="
				+ rate + "]";
	}
	public int getRent() {
		return rent;
	}

	public void setRent(int rent) {
		this.rent = rent;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Address a = new Address();
        a.setAdd("sai nagar");
        a.setRent(2000);
        
       // System.out.println(a.getAdd());
        //System.out.println(a.getRent());
        //-------------------------
        Address b = new Address("samarth nagar","solapur",5000);
        System.out.println(a);
        
	}
	

}
