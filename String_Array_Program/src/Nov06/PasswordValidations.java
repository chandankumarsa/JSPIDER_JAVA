package Nov06;

import java.util.regex.Pattern;

public class PasswordValidations {
public static void main(String[] args) {
	System.out.println(isPassword("asGsag7jhg@jgj"));
}
static boolean isPassword(String pwd) {
	String exp="(?=.*[!@#$])(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9]).{8,15}";
	Pattern ptrn =Pattern.compile(exp);
	return ptrn.matcher(pwd).matches();
	
}
}

//atleast 1 digit 
//atleast 1 upper Case
//atleast 1 special character
//atleast 1 lower case