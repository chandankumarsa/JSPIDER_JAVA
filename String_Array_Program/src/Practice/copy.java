package Practice;

public class copy {
public static void main(String[] args) {
	String s ="chandan Kumar Sahu";
	int size = s.length();
	char x[]= s.toCharArray();
	char y[] = new char[size];
	int i =0;
	while(i!=size) {
		y[i]=x[i];
		i++;
	}
	System.out.println(x);
	System.out.println(y);
	
}
}
