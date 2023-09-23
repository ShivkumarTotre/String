package com.AssStringKA;

import java.util.*;

public class UsernamePassword {
	
//	public void checkValid(String str, String str1)
//	{
//		boolean bFlag = false;
//		
//		char ch[] = str.toCharArray();
//		
//		for(int i = 0; i < ch.length; i++)
//		{
//			if(ch.length < 8)
//			{
//				bFlag = true;
//				System.out.println("Password Length Must be Minimum of 8 Characters");
//				break;
//			}
//			else if((ch[i] != '#') || (ch[i] != '@'))
//			{
//				bFlag = true;
//				System.out.println("Must Contain Special Character");
//				break;
//			}
//			else if((ch[i] <= 0) && (ch[i] >= 9))
//			{
//				bFlag = true;
//				System.out.println("Must Contain digits");
//				break;
//			}
//			else if(ch[i] == ' ')
//			{
//				bFlag = true;
//				System.out.println("Must Not Contain any WhiteSpace");
//				break;
//			}
//			else if((ch[i] <= 'A') && (ch[i] >= 'Z'))
//			{
//				bFlag = true;
//				System.out.println("Password Must Contain atleast 1 UpperCase Character");
//				break;
//			}
//			
//			if(ch.length < 8)
//			{
//				bFlag = true;
//				System.out.println("Length Must be Minimum of 8 Characters");
//			}
//		}
//	}
		
		public void checkValid1(String str, String str1)
		{	
			int iCnt = 0;
			int iCount = 0;
			int flag = 0;
			
			char ch[] = str1.toCharArray();
			
			if(str1.length() < 8)
			{
				System.out.println("Password Length Must be Minimum of 8 Characters");
				flag = 1;
			}
			
			if(!(str1.contains("#") || str1.contains("@")))
			{
				System.out.println("Must Contain Special Character");
				flag = 1;
			}
			
			for(int i = 0; i < str1.length(); i++)
			{
				if((ch[i] >= '0') && (ch[i] <= '9'))
				{
					iCnt++;
				}
			}
				
			if(iCnt == 0)
			{
				System.out.println("Must Contain digits");
				flag = 1;
			}
			
			if(str1.contains(" "))
			{
				System.out.println("Must Not Contain any WhiteSpace");
				flag = 1;			
			}
			
			for(int i = 0; i < ch.length; i++)
			{
				if((ch[i] >= 65) && (ch[i] <= 95))
				{
					iCount++;
				}
			}
				
			if(iCount == 0)
			{
				System.out.println("Password Must Contain atleast 1 UpperCase Character");
				flag = 1;
			}
		
			if(flag == 0)
			{
				System.out.println("Username : "+str);
				System.out.println("Password : "+str1);
			}
		}
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		UsernamePassword up = new UsernamePassword();
		
		System.out.println("Enter the Username");
		String s = sc.next();
		
		System.out.println("Enter the Password");
		String s1 = sc.next();
		
		up.checkValid1(s, s1);
	}

}
