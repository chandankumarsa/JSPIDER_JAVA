package Nov_07_Array;

interface Animal {
	void makesound();
}

class Dog implements Animal {
	public void makesound() {
		System.out.println("bow bow");
	}
	public void jump() {
		System.out.println("jumped");
	}
}

class Cat implements Animal {
	public void makesound() {
		System.out.println("peow");
	}
}

public class ArrayCreateInAbstract {
	public static void main(String[] args) {
		Animal[] arr = new Animal[4];
		arr[0] = new Dog();
		arr[1] = new Cat();
		arr[2] = new Cat();
		arr[3] = new Dog();
		
		for (Animal a : arr) {
			a.makesound();
			if (a instanceof Dog) {
				((Dog) a).jump();
			}
		}
	}
}
