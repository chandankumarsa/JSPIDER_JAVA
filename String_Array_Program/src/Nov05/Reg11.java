package Nov05;

public class Reg11 {
	public static void main(String[] args) {
		String s = "a1b2c3d4";
		String s2=s.replace("[0-9","");
		System.out.println(s2);
		String s3=s.replaceAll("[0-9]","");
		System.out.println(s3);
	}

}


//replace() doesnot support in Regex
//ReplaceAll() supports in Regex