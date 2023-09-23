package com.String;

public class StringImmutable {

	public static void main(String[] args) {

		String s1 = "Hello";
		System.out.println(s1);
		
//		s1.concat("World");
//		System.out.println(s1);
		
//		s1 = s1.concat("World");      // OR line 14
		s1 = s1 + "World";
		System.out.println(s1);
		
		System.out.println("--------------------------------");
		
		String s2 = new String("Java");
		s2 = s2.concat("Programs");
		
		System.out.println(s2);
	}

}
