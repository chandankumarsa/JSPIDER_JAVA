package Practice;

public class Reverse {
public static void main(String[] args) {
	String s ="chandan Kumar Sahu";
	char y[]= s.toCharArray();
	int size =y.length;
	char a [] = new char[size];
	int i =0;
	while(i!=size) {
		a[size-1-i]=y[i];
		i++;
	}
	System.out.println(a);
	System.out.println(y);
	
}
}
