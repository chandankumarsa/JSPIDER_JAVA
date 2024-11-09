package Encapsulation;
class B{
	private String name;
	private int age;
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
public class EncapsulationExample {
	public static void main(String[] args) {
		B obj = new B();
		obj.setAge(18);
		obj.setName("chandan");
;		obj.show();
		
	}

}
