package oops.abstraction;

public class HDFC implements RBI{

	@Override
	public void savingAccount() {
    System.out.println("HDFC saving account");
		
	}

	@Override
	public void currentAccount() {
		System.out.println("HDFC current account");
		
	}

	@Override
	public void debitCard() {
		System.out.println("HDFC debitcard");
		
	}

	@Override
	public void CreditCard() {
	System.out.println("HDFC Creditcard");
		
	}

}
