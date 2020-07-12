package oops.abstraction;

public class ICICI implements RBI {

	@Override
	public void savingAccount() {
		  System.out.println("ICICI saving account");
		
	}

	@Override
	public void currentAccount() {
		  System.out.println("ICICI current account");
		
	}

	@Override
	public void debitCard() {
	System.out.println("ICICI debit Card");
		
	}

	@Override
	public void CreditCard() {
	System.out.println("ICICI Credit Card");
		
	}

}
