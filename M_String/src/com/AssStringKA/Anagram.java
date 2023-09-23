package com.AssStringKA;

public class Anagram {
	
	public static void checkAnagram(String str, String str2)
	{
		int iCount1 = str.length();
		int iCount2 = str2.length();
		
		str = str.toLowerCase();
		str2 = str2.toLowerCase();
		
		char ch[] = str.toCharArray();
		char ch1[] = str2.toCharArray();
		
		int iCount = 0;
		
		for(int i = 0; i < ch.length; i++)
		{
			for(int j = i+1; j < ch.length; j++)
			{
				if(ch[i] > ch[j])
				{
					int temp = 0;
					
					temp = ch[i];
					ch[i] = ch[j];
					ch[j] = (char)temp;
				}
			}
		}
		
		for(int i = 0; i < ch1.length; i++)
		{
			for(int j = i+1; j < ch1.length; j++)
			{
				if(ch1[i] > ch1[j])
				{
					int temp = 0;
					
					temp = ch1[i];
					ch1[i] = ch1[j];
					ch1[j] = (char)temp;
				}
			}
		}
		
//		System.out.println(ch);
//		System.out.println(ch1);
		
		for(int i = 0,j = 0; i < ch.length && j < ch1.length; i++, j++)
		{
			if(ch[i] == ch1[j])
			{
				iCount++;
			}
			else
			{
				break;
			}
		}
		
		
		
		if((iCount == ch.length) && (iCount1 == ch.length) && (iCount2 == ch1.length))
		{
			System.out.println("Anagram");
		}
		else if(iCount < ch.length)
		{
			System.out.println("Not Anagram");
		}
	}

	public static void main(String[] args) {

		String s = "Mary";			
		String s1 = "yrmy";			
		
		Anagram.checkAnagram(s, s1);
	}

}
