package oops.polymorphism;

import oops.inheritance.Mobile;
import oops.inheritance.SmartPhone;
import oops.inheritance.Telephone;

public class DynamicPolymorphism {

	public static void main(String[] args) {

		Telephone obj = null; // Webdriver
		String browserName = "Chrome";
		if (browserName.equals("Chrome")) {
			obj = new Mobile(); // ChromeDriver
		} else if (browserName.equals("Firefox")) {
			obj = new SmartPhone(); // FirefoxDriver
		}
		// Script calling

		obj.calling();

	}

}
