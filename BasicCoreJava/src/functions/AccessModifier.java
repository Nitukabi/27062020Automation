package functions;

public class AccessModifier {

	public static void main(String[] args) {

		AccessModifier obj =new AccessModifier();
		obj.publicFunction();
		obj.privateFunction();
		obj.defaultFunction();
		obj.protectedFunction();
	}

	public void publicFunction() {

	}

	private void privateFunction() {

	}

	void defaultFunction() {

	}

	protected void protectedFunction() {

	}

}
