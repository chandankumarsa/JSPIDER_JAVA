package Encapsulation;
class Student{
	int age;
	String name;
	public void show() {
		System.out.println(" Name "+ name);
		System.out.println(" Age "+ age);
	}
}
public class A {
	public static void main(String[] args) {
		Student obj = new Student();
		obj.name="chandan";
		obj.age=20;
		obj.show();
	}
}

//data is accessable outside in the class