package Youtube;

public class StringIsRotationOfAnotherString {
	public static void main(String[] args) {
		String originalString ="ARADHYA";
		String keyString ="RADHYA";
		String newString = originalString.concat(originalString);
		if(newString.contains(keyString)) {
			System.out.println("Rotational String");
		}else {
			System.out.println("Not Rotational String");
		}
	}

}
