package PracticeProgramJava;

public class CountVowel {
public static void main(String[] args) {
	String s="chandan kumar sahu";
	char y[]=s.toCharArray();
	int size =y.length;
	char a[]=new char[size];
	int i=0;
	int vowel=0;
	int consonant=0;
	int special=0;
	while(i!=size) {
		if((y[i]>='a' && y[i]<='z')||(y[i]>='A' && y[i]<='Z')) {
			if(y[i]=='a'||y[i]=='e'||y[i]=='i'||y[i]=='o'||y[i]=='u'||y[i]=='A'||y[i]=='E'||y[i]=='I'||y[i]=='O'||y[i]=='U') {
				vowel++;
			}else {
				consonant++;
			}
		}
		special++;
		i++;
	}
	System.out.println("vowel count "+vowel);
	System.out.println("Consonant Count "+consonant);
	System.out.println("Special Count "+special);
}
}
