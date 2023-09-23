package com.AssStringKA;

public class Pallindrome {
	
	public static void isPal(String s1)
	{
		String rev = "";
		
		char ch[] = s1.toCharArray();
		
		for(int i = (ch.length-1); i >= 0; i--)
		{
			rev = rev + ch[i];
		}
		
		if(s1.equalsIgnoreCase(rev))
		{
			System.out.println("It is Pallindrome String");
		}
		else
		{
			System.out.println("It is not a Pallindrome String");
		}
	}

	public static void main(String[] args) {

		String s = "Madam1";
		
		Pallindrome.isPal(s);
	}

}
