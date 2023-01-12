package abstractClass;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c = new Car();
		
		System.out.println(c.getCompanyName());
		System.out.println(c.getFuelCapacity());
		System.out.println(c.getFuelCount());
		System.out.println(c.getMilleage());
		System.out.println();
		Bike b = new Bike();
		System.out.println(b.getCompanyName());
		System.out.println(b.getFuelCapacity());
		System.out.println(b.getFuelCount());
		System.out.println(b.getMilleage());
		
		System.out.println();
		
		System.out.println(b.getGearCount());
		System.out.println(b.getVehicleColor());
	}

}
