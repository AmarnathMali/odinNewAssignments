package InClassExample;

public class InheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Animal a = new Animal();
         a.setColor("black");
         a.setName("Animal");
         a.setSize("big");
         
         Cat c = new Cat();
         c.setColor("white");
         c.setName("laika");
         c.setSize("small");
         c.setSound("miew miew");
         
         Dog d = new Dog();
         d.setColor("black");
         d.setName("bunty");
         d.setSize("medium");
         d.setSmell("smell");
         
         System.out.println(a);
         System.out.println(c);
         System.out.println(d);
	}

}
