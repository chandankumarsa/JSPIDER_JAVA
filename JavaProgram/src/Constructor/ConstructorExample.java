package Constructor;
class Student{
	private int age;
	private String name;
	public Student() {
		System.out.println("Zeor Parameterized Constructor");
	}
	public Student(String name,int age) {
		this.name=name;
		this.age=age;
	}
	public void show() {
		System.out.println("name "+name);
		System.out.println(" age "+age);
	}
}
public class ConstructorExample {
	public static void main(String[] args) {
		Student obj = new Student();
		Student obj1=new Student("chandan",20);
		obj.show();
		obj1.show();
		
		
	}

}
