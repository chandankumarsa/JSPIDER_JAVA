package Youtube;

public class String_with_spaces_from_lowercase_to_uppercase {
	public static void main(String[] args) {
		String x ="chandan kumar sahu";
		char y[]=x.toCharArray();
		int size =y.length;
		int i=0;
		while(i!=size) {
			if(y[i] !=' ')
			{
				y[i]=(char)(y[i]-32);
			}
			i++;
		}
		System.out.println(x);
		System.out.println(y);
	}

}
