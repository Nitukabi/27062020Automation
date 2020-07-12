package oops.inheritance;

public class User {
	public static void main(String[] args)
	{
		SmartPhone sm = new SmartPhone();
		sm.calling();
		sm.videoCalling();
		sm.texting();

	
		Mobile mob = new Mobile();
		mob.calling();
		mob.texting();
		
		Telephone tel = new Telephone();
		tel.calling();
		
		
	}

	
}
