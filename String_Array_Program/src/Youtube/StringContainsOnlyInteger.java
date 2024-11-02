package Youtube;

public class StringContainsOnlyInteger {
	public static void main(String[] args) {
		String s ="1234";
		char y[]=s.toCharArray();
		int size =y.length;
		int i =0;
		while(i!=size) {
			if(y[i]>='0' && y[i]<='9') {
				i++;
			}
			else {
				System.out.println("Not an Integer String");
				System.exit(0);
			}
		}
		System.out.println("integer String");
	}

}
