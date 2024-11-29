package PracticeJava26;

public class CountVowel {
	public static void main(String[] args) {
		String s = "chandankumarsahu";
		char y[] = s.toCharArray();
		int size = y.length;
		int vowel=0;
		int consonant=0;
		int special=0;
		int i=0;
		while (i != size) {
			if ((y[i] >= 'A' && y[i] <= 'Z') || (y[i] >= 'a' && y[i] <= 'z')) {
				if (y[i] == 'a' || y[i] == 'e' || y[i] == 'i' || y[i] == 'o' || y[i] == 'u' || y[i] == 'A'
						|| y[i] == 'E' || y[i] == 'I' || y[i] == 'O' || y[i] == 'U') {
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
		System.out.println("Total vowel "+vowel);
		System.out.println("Total Consonant "+consonant);
		System.out.println("Total Special Char "+special);
	}

}
