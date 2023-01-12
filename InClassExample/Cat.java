package InClassExample;

public class Cat extends Animal {
     @Override
	public String toString() {
		return "Cat [sound=" + sound + ", name=" + name + ", color=" + color + ", size=" + size + "]";
	}

	String sound;

	public String getSound() {
		return sound;
	}

	public void setSound(String sound) {
		this.sound = sound;
	}
}
