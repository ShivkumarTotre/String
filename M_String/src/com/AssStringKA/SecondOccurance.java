package com.AssStringKA;

public class SecondOccurance {
	
	public static void findSecondOccurance(String s1)
	{	
		int iCnt = 0;
		int iPos = 0;
		
		for(int i = 0; i < s1.length(); i++)
		{	
			if(s1.charAt(i) == 'a')
			{
				iPos = i;
				iCnt++;
			}
			
			if(iCnt == 2)
			{
				System.out.println("Second Occurance of a is at index : "+iPos);
				break;
			}
		}
	}

	public static void main(String[] args) {

		String s = "Java Programs";
		
		findSecondOccurance(s);
	}

}
