package Nov23ExceptionHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Test {
	public static void main(String[] args) {
		System.out.println("Main Executed ");
		try {
			m1();
		}catch(FileNotFoundException e) {
			System.out.println("Handled");
		}
	}
	public static void m1() throws FileNotFoundException{
		System.out.println("M1 is Executed");
		m2();
	}
	public static void m2()throws FileNotFoundException{
		System.out.println("m2 Executed");
		FileReader r = new FileReader("C:\\Users\\sahuc\\Documents\\OneNote Notebooks");
	}

}
