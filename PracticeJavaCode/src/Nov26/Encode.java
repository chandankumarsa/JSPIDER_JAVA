package Nov26;

public class Encode {
public static void main(String[] args) {
	String s ="jsp";
	int k=13;
	char y[]=s.toCharArray();
	char letter[]="abcdefghijklmnopqrstuvwxyz".toCharArray();
	for(int i=0;i<y.length;i++) {
		if(y[i]>='a' && y[i]<='z') {
			y[i]=letter[(y[i]-'a'+k)%26];
		}
		
	}
	System.out.println(y);
}
}
