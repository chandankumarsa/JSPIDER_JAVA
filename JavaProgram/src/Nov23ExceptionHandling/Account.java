package Nov23ExceptionHandling;

public class Account {
	int bal;
	public Account(int bal) {
		this.bal=bal;
	}
	public void withdraw(int amount) throws InsufficientBalException{
		if(amount >bal) {
			InsufficientBalException a = new InsufficientBalException();
			throw a;
		}
		bal-=amount;
		System.out.println("Withdraw Done : "+amount);
		System.out.println("Available Bal"+bal);
	}
}
