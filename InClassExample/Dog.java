package InClassExample;

public class Dog extends Animal{
    

	@Override
	public String toString() {
		return "Dog [smell=" + smell + ", name=" + name + ", color=" + color + ", size=" + size + "]";
	}

	String smell;

	public String getSmell() {
		return smell;
	}

	public void setSmell(String smell) {
		this.smell = smell;
	}
}
