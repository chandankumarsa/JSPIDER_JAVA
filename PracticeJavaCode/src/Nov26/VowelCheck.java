package Nov26;

public class VowelCheck {
	public static void main(String[] args) {
		String s ="chandnakumar";
		char y[]=s.toCharArray();
		int size =y.length;
		int i=0;
		int vowel=0;
		int consonant=0;
		int special=0;
		while(i!=size) {
			if((y[i]>='A'&& y[i]<='Z') ||(y[i]>='a'&& y[i]<='z')) {
				if(y[i]=='A'||y[i]=='E'||y[i]=='I'||y[i]=='O'||y[i]=='U'||y[i]=='a'||y[i]=='e'||y[i]=='i'||y[i]=='o'||y[i]=='u') {
					vowel++;
				}else {
					consonant++;
				}
				
			}
			else {
				special++;
			}
			i++;
		}
		System.out.println("vowel count "+vowel);
		System.out.println("consonant count "+consonant);
		System.out.println("Special Count "+special);
	}

}
