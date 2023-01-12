package abstractClass;

public abstract  class EngineBasedVehicle implements Vehicle {

	@Override
	public abstract String getCompanyName();

	@Override
	public abstract int getMilleage();
	
	@Override
	public abstract String getFuelCount();

	@Override
	public abstract  int getFuelCapacity();


	@Override
	public int getGearCount() {
		// TODO Auto-generated method stub
		return 4;
	}

	@Override
	public String getVehicleColor() {
		// TODO Auto-generated method stub
		return "red";
	}

	
}
