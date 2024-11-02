package Youtube;

public class StringContainsIntegerEfficient {
	public static void main(String[] args) {
		String s="9555";
		int size =s.length();
		int i =0;
		while(i!=size) {
			if(s.charAt(i)>'0' && s.charAt(i)<='9') {
				i++;
			}else {
				System.out.println("Not an Integer String");
				System.exit(0);
			}
		}
		System.out.println("Integer String");
	}

}

//2approach operting String

//tocharArray()//copy of object into array
//charAt()//accessing the data present in the object