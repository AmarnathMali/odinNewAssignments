package InClassExample;

public class Test extends MountainBike {
	private String size;
	private String color;
	private String madeFor;

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getMadeFor() {
		return madeFor;
	}

	public void setMadeFor(String madeFor) {
		this.madeFor = madeFor;
	}

	@Override
	public String toString() {
		return "InheritanceBicycle [size=" + size + ", color=" + color + ", madeFor=" + madeFor + "]";
	}

}
