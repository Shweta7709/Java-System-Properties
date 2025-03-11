package mypack;

import java.util.Properties;

public class Useproperties {
	public static void main(String[] args) {
		Properties countries = new Properties();
		countries.put("India", "New Delhi");
		countries.put("Malaysia", "Kolalampur");
		countries.put("Singapore", "Singapore");
		System.out.println(countries);
		System.out.println(countries.get("India"));
	}

}
