package com.String;

public class StringToArray {

	public static void main(String[] args) {
		
		String s = "India is My Country";
		
		char ch[] = s.toCharArray();
		
		int iLength = 0;
		
		for(int i = 0; i < ch.length; i++)
		{
			iLength++;
		}
		
		System.out.println("Length is : "+iLength);
	}

}
