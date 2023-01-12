package InClassExample;

public class MountainBike  {
	private String SpeciallyDesigned;
	private String rate;
	public String getSpeciallyDesigned() {
		return SpeciallyDesigned;
	}
	public void setSpeciallyDesigned(String speciallyDesigned) {
		SpeciallyDesigned = speciallyDesigned;
	}
	public String getRate() {
		return rate;
	}
	public void setRate(String rate) {
		this.rate = rate;
	}
	@Override
	public String toString() {
		return "MountainBike [SpeciallyDesigned=" + SpeciallyDesigned + ", rate=" + rate + "]";
	}
	
	
}
