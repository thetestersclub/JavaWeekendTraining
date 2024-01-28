package SuperKeyword;

public class Dog extends Animal {
	
	public Dog(int a) {
		System.out.println("Dog Constructor");
	}
	
	
	public void sound() {
		super.sound();
		System.out.println("Dog Sound");
	}

}
