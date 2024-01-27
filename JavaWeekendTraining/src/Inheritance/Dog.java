package Inheritance;

public class Dog extends Animal {
	
	public void sound() {
		System.out.println("Dog's Sound");
	}
	
	public void color() {
		System.out.println("Brown");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Dog obj = new Dog();
       obj.sound();
       obj.color();
	}

}
