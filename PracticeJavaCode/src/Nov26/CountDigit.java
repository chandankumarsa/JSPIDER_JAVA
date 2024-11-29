package Nov26;

public class CountDigit {
	public static void main(String[] args) {
		String s ="chandan6";
		int count =0;
		for(int i=0;i<s.length();i++) {
			char ch =s.charAt(i);
			if(ch>='0' && ch<='9') {
				count++;
			}
		}
		System.out.println(count);
	}

}
