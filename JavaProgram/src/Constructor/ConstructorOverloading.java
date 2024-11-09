package Constructor;
class Student3{
	private String name;
	private int age;
	public Student3() {
		System.out.println("Default constructor");
		name="chandan";
		age=20;
	}
	public Student3(String name) {
		this.name=name;		
	}
	public Student3(String name,int age) {
		this.name=name;
		this.age=age;
	}
	public void disp() {
		System.out.println(name);
		System.out.println(age);
	}
}
public class ConstructorOverloading {
	public static void main(String[] args) {
		Student3 obj = new Student3();
		obj.disp();
		Student3 obj1 = new Student3("Kiran");
		obj1.disp();
		Student3 obj2 = new Student3("Rohan",22);
		obj2.disp();
		
		
		
	}

}
