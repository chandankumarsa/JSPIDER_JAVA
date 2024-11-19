package Typecasting;

public class TypecastingInPremitiveType {
	public static void main(String[] args) {
/*		Upcasting-Converting the Value from Smaller to Larger
		-Upcasting is a Automatic Process
		int----long
		float----- to double
		
*/
		int intvalue=100;
		long longvalue=intvalue;
		System.out.println(longvalue);
		
//		Down Casting-Converting the Value from larger To Smaller
//		explicitely we have to specify the data type
			
		double d =10.5;
		int i=(int)d;
		System.out.println(i); //downcasting
	}

}
