package com.AssStringKA;

public class ReplaceOccurance {
	
	public void replaceFirstChar(String s1)
	{
		char ch[] = s1.toCharArray();
		
		for(int i = 0; i < ch.length; i++)
		{
			if(ch[i] == ' ')
			{
				ch[i+1] = 'S';
			}
			else if(i == 0)
			{
				ch[i] = 'S';
			}
		}
		
		System.out.println(ch);
	}

	public static void main(String[] args) {

		ReplaceOccurance ro = new ReplaceOccurance();
		
		String s = "I Love India";
		ro.replaceFirstChar(s);
	}

}
