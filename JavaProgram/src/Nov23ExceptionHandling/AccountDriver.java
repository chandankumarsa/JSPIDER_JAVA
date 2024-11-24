package Nov23ExceptionHandling;

public class AccountDriver {
	public static void main(String[] args) {
		Account  a = new Account(10000);
		try {
			a.withdraw(30000);
		}catch(InsufficientBalException e) {
			System.out.println(e.getMessage());
		}
	}

}
