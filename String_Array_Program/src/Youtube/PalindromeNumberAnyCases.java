package Youtube;

public class PalindromeNumberAnyCases {
	public static void main(String[] args) {
		String x ="too Hot to Hoot";
		x=x.replace(" ","");
		x=x.toUpperCase();
		char y[]=x.toCharArray();
		int size = y.length;
		char a[]=new char[size];
		int i =0;
		while(i!=size) {
			a[size-1-i]=y[i];
			i++;
		}
		i=0;
		while(i!=size) {
			if(a[i]!=y[i]) {
				System.out.println("Not a Palindrome");
				 System.exit(0);
			}else {
				i++;
				continue;
			}
		}
		System.out.println("palindrome");
	}

}
