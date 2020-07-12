package oops.abstraction;

public class BankUser {

	public static void main(String[] args) {

		account(new SBI());//SBI =ChromeDriver
		account(new HDFC());//HDFC=FirefoxDriver
		account(new ICICI());//ICICI = Edge
		
		String name="Sudha";
		int a= 10;
		RBI bank = new ICICI();
		message(name);
		sum(a);
		account(bank);
		
		message("Nitu");
		sum(29);
		account(new SBI());
		

	}

	public static void account(RBI bank)//RBI==WebDriver
	{
		bank.CreditCard();//Navigate
		bank.debitCard();//Click
		bank.currentAccount();//Enter Data
		bank.savingAccount();//Select Option
	}

	public static void sum(int a) {
		System.out.println(10 + a);
	}

	public static void message(String name) {
		System.out.println("Your name is " + name);
	}
}
