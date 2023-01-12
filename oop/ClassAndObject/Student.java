package oop.ClassAndObject;

public class Student {
	
	private int id;
	private String name;
	private int rollNO;
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student st = new Student();
	    st.setId(101);
	    st.setName("Amar");
	    st.setRollNO(10);
	    System.out.println();
	    System.out.println(st.getId()+" "+st.getName()+" "+st.getRollNO());
	    
	    
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getRollNO() {
		return rollNO;
	}


	public void setRollNO(int rollNO) {
		this.rollNO = rollNO;
	}
	

}
