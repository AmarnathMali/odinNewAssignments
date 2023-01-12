package InClassExample;

public class InheritanceBicycle {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t = new Test();
		t.setColor("red");
		t.setMadeFor("to ride in mountain");
		t.setRate("to high");
		t.setSize("medium");
		t.setSpeciallyDesigned("mountain");
		
		MountainBike mb = new MountainBike();
		mb.setRate("high price");
		mb.setSpeciallyDesigned("to run in diffcult road");
		System.out.println(t);
		System.out.println(mb);
		
	}

}
