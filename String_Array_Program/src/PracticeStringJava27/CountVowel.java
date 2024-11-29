package PracticeStringJava27;

public class CountVowel {
	public static void main(String[] args) {
		String s ="chandan kumar";
		char y[]=s.toCharArray();
		int size =y.length;
		int vowel =0;
		int consonant=0;
		int special=0;
		int i=0;
		while(i!=size) {
			if((y[i]>='A'&& y[i]<='Z')||(y[i]>='a'&& y[i]<='z')) {
				if(y[i]=='a'||y[i]=='e'||y[i]=='i'||y[i]=='o'||y[i]=='u') {
					vowel++;
				}else {
					consonant++;
				}
			}
			special++;
			i++;
		}
		System.out.println("Total vowel is "+vowel);
		System.out.println("Total Consonant is "+consonant);
		System.out.println("Total SpecialCharacter is "+special);
	}

}
