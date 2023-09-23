package com.AssStringKA;

public class FreqCharacter {
	
	public void frequencyCharacter(String s)
	{
		// Type 1
//		
//		char ch[] = s.toCharArray();
//		int iCnt = 0;
//		
//		for(int i = 0; i < ch.length; i++)
//		{
//			if (ch[i] == '\0' || ch[i] == ' ')
//			{
//				continue;
//			}
//			iCnt = 1; 
//			
//			for(int j = i+1; j < ch.length; j++)
//			{
//				if(ch[i] == ch[j])
//				{
//					iCnt++;
//					ch[j] = '\0';
//				}		
//			}
//			
//			System.out.println("Count of "+ ch[i]+" is : "+iCnt);
//		}
		
		// Type 2
		
		char ch[]=s.toCharArray();
		
		for(int i = 0; i < ch.length; i++)
		{
			char c = ch[i];

			int iCnt =  1;
			
			for(int k = i+1; k < ch.length; k++)
			{	
				if(ch[i]== ch[k])
				{
					iCnt++;
					ch[k] = ' ';
				}
			}
				
			if(c!= ' ')
			{
				System.out.println("Count of "+ch[i]+" is : "+iCnt);
			}
		}
		
		
		// Type 3
		
//		char ch[] = s.toCharArray();
//		
//		for(int i = 0; i < ch.length; i++)
//		{
//			int iCnt =  1;
//			
//			for(int j = i+1; j < ch.length; j++)
//			{	
//				if(ch[i] == ch[j])
//				{
//					iCnt++;
//					ch[j] = ' ';
//				}
//			}
//			
//			if(ch[i]!= ' ')
//			{
//				System.out.println("Count of "+ch[i]+" is : "+iCnt);
//			}
//		}
	}
		

	public static void main(String[] args) {

		FreqCharacter fc = new FreqCharacter();
		
		String str = "I Love Java";
		
		fc.frequencyCharacter(str);
		
	}

}
