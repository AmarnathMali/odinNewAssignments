package abstractClass;

public class Car extends EngineBasedVehicle{@Override

	public int getMilleage() {
		// TODO Auto-generated method stub
		return 15;
	}

	@Override
	public String getFuelCount() {
		// TODO Auto-generated method stub
		return "full";
	}

	@Override
	public int getFuelCapacity() {
		// TODO Auto-generated method stub
		return 50;
	}

	@Override
	public String getCompanyName() {
		// TODO Auto-generated method stub
		return "BMW";
	}

}
