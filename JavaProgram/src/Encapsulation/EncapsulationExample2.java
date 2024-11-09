package Encapsulation;
class Z{
	int age;
	String name="chandan";
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public int getAge() {
		return age;
	}
	public void show() {
		System.out.println("name :"+name);
		System.out.println("age :"+age);
	}
}
public class EncapsulationExample2 {
public static void main(String[] args) {
	Z obj = new Z();
	obj.setAge(18);
	obj.setName("chandan kumar sahu");
	obj.show();
	
}
}
