package Nov28;

public class CountVowel {
public static void main(String[] args) {
	String s ="apple ";
	char y[]=s.toCharArray();
	int size =y.length;
	int i=0;
	int vowel =0;
	int consonant =0;
	int special=0;
	while(i!=size) {
		if((y[i]>='A'&& y[i]<='Z')||(y[i]>='a'&& y[i]<='z')) {
			if(y[i]=='A'||y[i]=='E'||y[i]=='I'||y[i]=='O'||y[i]=='U'||y[i]=='a'||y[i]=='e'||y[i]=='i'||y[i]=='o'||y[i]=='u') {
			vowel++;	
			}
			consonant++;
		}else {
			special++;
		}
		i++;
	}
	System.out.println("Vowel Count "+vowel);
	System.out.println("Consonant Count "+consonant);
	System.out.println("Special Count "+special);
	
}
}
