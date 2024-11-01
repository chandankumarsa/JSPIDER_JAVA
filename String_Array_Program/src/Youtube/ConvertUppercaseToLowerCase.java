package Youtube;

public class ConvertUppercaseToLowerCase {
	public static void main(String[] args) {
		String x ="CHANDAN";
		char y[]=x.toCharArray();
		int size =y.length;
		int i =0;
		while(i!=size) {
			y[i]=(char)(y[i]+32);//typecasting
			i++;
		}
		System.out.println(x);
		System.out.println(y);
	}
}
