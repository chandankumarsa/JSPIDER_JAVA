package Youtube;

public class Delete_All_Occurrences_givenCharacterFromString {
	public static void main(String[] args) {
		String x = "SPIDERSLIES";
		char y[]= x.toCharArray();
		int size = x.length();
		char key='S';
		int i =0;
		String res = "";
		while(i!=size) {
			if(y[i]!=key) {
				res = res+y[i];
			}
			i++;
		}
		System.out.println(res);
	}

}


//How to delete all occurrences of a given character from a String