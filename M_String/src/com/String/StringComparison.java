package com.String;

public class StringComparison {

	public static void main(String[] args) {

		String str1 = "Java";
		String str2 = "Java";
		
		System.out.println("String Comparison with this == : "+(str1 == str2));
		
		// Type 1
		String str = "Java";
		String str3 = new String("Java");
		
		System.out.println("String Comparison with this == : "+(str == str3));
		// == Compares references instead of actual content{L12 to L15}
		
		// Type 2
		String s = "Java";
		String s1 = new String("Java");
		
		System.out.println("String Comparison with EqualsTo : "+(s.equals(s1)));
		// eqauls method Compares content
		
		// Type 3
		
		String st = new String("Welcome");
		String st1 = new String("welcome");
		
		System.out.println("Using == : "+(st == st1));
		System.out.println("Using equals : "+(st.equals(st1)));
		System.out.println("Using IgnoreCase : "+(st.equalsIgnoreCase(st1)));
	}

}
